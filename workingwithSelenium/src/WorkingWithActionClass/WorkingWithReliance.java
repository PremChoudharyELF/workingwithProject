package WorkingWithActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithReliance {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.reliancedigital.in/");
			 Actions action=new Actions(driver);
			 action.moveToElement(driver.findElement(By.xpath("//button[text()=\"No, don’t.\"]"))).click().perform();
			 WebElement homeAppliences = driver.findElement(By.xpath("//div[text()='Home Appliances']"));
			 action.moveToElement(homeAppliences).perform();
			 //168
			 //-181
			 WebDriverWait wait=new WebDriverWait(driver, 10);
			 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.partialLinkText("Refrigerators"))));
			 action.moveByOffset(-181, 168).click().perform();
			 
}
}
