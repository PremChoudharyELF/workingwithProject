package workingWithTakeScreetShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenShotOfWebElement {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		//input[@type='submit']
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		//img[@title='Study Table']
		 WebElement element = driver.findElement(By.xpath("//img[@title='Study Table']/.."));
		 Thread.sleep(3000);
		 File tempshot=element.getScreenshotAs(OutputType.FILE);
		File targetLocation = new File("C://WorkingWithTakeScreenShot/snap.png");
		FileHandler.copy(tempshot, targetLocation);
	}
}
