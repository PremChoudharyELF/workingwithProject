package WorkingWithActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragandDropAll {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	static int i=1;
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
			WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
			driver.switchTo().frame(frame);
			Actions action=new Actions(driver);
			WebDriverWait wait=new WebDriverWait(driver,10);
			for(int j=1;j<=4;j++) {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[contains(@class,'ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle')])["+j+"]")));
			WebElement source = driver.findElement(By.xpath("(//li[contains(@class,'ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle')])["+i++ +"]"));
			WebElement target=driver.findElement(By.id("trash"));
				action.dragAndDrop(source, target).perform();
			}
			WebElement source=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
			WebElement target=driver.findElement(By.id("gallery"));
			action.dragAndDrop(source, target).perform();
}
}
