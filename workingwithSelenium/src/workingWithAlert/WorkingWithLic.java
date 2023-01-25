package workingWithAlert;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithLic {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://licindia.in/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebDriverWait wait=new WebDriverWait(driver,10);
		for(; ;) {
			try {
				driver.findElement(By.partialLinkText("Agents Portal")).click();
				break;
			}catch(ElementClickInterceptedException e) {
				js.executeScript("window.scrollBy(0,200);");
			}
		}
		driver.switchTo().alert().accept();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allWindowsId = driver.getWindowHandles();
		String parentWindowId = driver.getWindowHandle();
		
		allWindowsId.remove(allWindowsId);
		for(String windowId:allWindowsId) {
			driver.switchTo().window(windowId);
		}
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		 System.out.println(driver.findElement(By.xpath("//li[text()='Please enter your Agent Code or Email or Mobile']")).getText());
	System.out.println(driver.findElement(By.xpath("//li[text()='Please enter your Password']")).getText());
	}
}
