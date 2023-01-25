package workingWithTakeScreetShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WorkingWithScreenShot2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.honda2wheelersindia.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempScreenShot = ts.getScreenshotAs(OutputType.FILE);
		File targetLocation = new File("C://WorkingWithTakeScreenShot/snap.png");
		FileHandler.copy(tempScreenShot, targetLocation);

	}
}
