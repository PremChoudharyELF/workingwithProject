package WorkingWithActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithKeysUpKeysDown {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.kalkifashion.com/");
		Actions action=new Actions(driver);

action.moveToElement(driver.findElement(By.partialLinkText("SALWAR KAMEEZ"))).perform();
	action.keyDown(Keys.CONTROL).click().perform();
		action.keyUp(Keys.CONTROL).perform();
	}
}
