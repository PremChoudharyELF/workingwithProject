package WorkingWithActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithClickHoldAndRelease {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
			WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
			driver.switchTo().frame(frame);
			WebElement source=driver.findElement(By.xpath("(//li[contains(@class,'ui-widget-content ui-corner')])[2]"));
			WebElement target=driver.findElement(By.id("trash"));
			Actions action=new Actions(driver);
			action.clickAndHold(source).release(target).perform();
		}
}
