package WorkingWithScreenShotsOfFailedTestCase;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
public static WebDriver driver;
public static String subFolderName;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@AfterTest
	public void tear() {
		driver.quit();
	}
	
	public void captureScreenShot(String fileName) {
//		if(subFolderName==null) {
//			LocalDateTime ldt=LocalDateTime.now();
//			DateTimeFormatter dateformatter=DateTimeFormatter.ofPattern("dd-MM-yyyy-HH:mm:ss");
//			subFolderName=ldt.format(dateformatter);
//		}
		TakesScreenshot takescreenshot=(TakesScreenshot) driver;
		File sourceFile=takescreenshot.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./ScreenShots/"+fileName);
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("ScreenShots saved successfully");
		
	}
}
