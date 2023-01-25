package PractiseOfJavaScriptExecutorAndScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WorkingWithScrollAndAScreenShot {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://woodenkart.in/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,1255);");
		TakesScreenshot ts=(TakesScreenshot)driver;
		WebElement element = driver.findElement(By.partialLinkText("See More"));
		File tempShot = element.getScreenshotAs(OutputType.FILE);
		File targetLocation= new File("C://WorkingWithTakeScreenShot/snap.png");
		FileHandler.copy(tempShot, targetLocation);
		driver.quit();
		
		
	}
}
