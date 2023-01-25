package WorkingWithActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithActionClass {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.reliancedigital.in/");
		 Actions action=new Actions(driver);
		 action.moveToElement(driver.findElement(By.xpath("//button[text()=\"No, don’t.\"]"))).click().perform();
		 action.moveToElement(driver.findElement(By.xpath("//div[text()='Audio']"))).perform();
	}
}
