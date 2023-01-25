package WorkingWithActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithDrapAndDrop3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		// WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame
		// lazyloaded']"));
		// driver.switchTo().frame(frame);
		Actions action = new Actions(driver);
		action.moveByOffset(495, 277).click().perform();
		driver.navigate().refresh();
		// driver.findElement(By.id("Propagation")).click();
		// driver.switchTo().defaultContent();
		// WebElement frame3 =
		// driver.findElement(By.xpath("//iframe[contains(@data-src,'propagation')]"));
		explicitWait.until(ExpectedConditions
				.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@data-src,'propagation')]")));
		// Thread.sleep(2000);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
		WebElement Source = driver.findElement(By.id("draggable"));

		action.dragAndDropBy(Source, 250, 0).perform();
		action.dragAndDropBy(Source, 250, 0).perform();
	}
}
