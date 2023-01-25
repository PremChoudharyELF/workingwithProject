package WorkingWithActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithDragAndDrop2 {
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
			Actions action=new Actions(driver);
			action.moveByOffset(331,281).click().perform();
			driver.switchTo().parentFrame();

			WebElement frame2 = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]"));
			driver.switchTo().frame(frame2);
			WebElement source=driver.findElement(By.id("draggable"));
			WebElement trash = driver.findElement(By.id("droppable"));
			action.dragAndDrop(source, trash).perform();
			System.out.println(driver.findElement(By.xpath("//p[text()='Dropped!']")).getText());
}
}
