package WorkingWithDataDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithConfigureFile {

	public static void main(String[] args) throws IOException {
		File absPath = new File("./testData/Configuration.properties");
		FileInputStream fis = new FileInputStream(absPath);

		Properties properties = new Properties();
		properties.load(fis);

		System.setProperty(properties.getProperty("key").toString(), properties.get("value").toString());
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(properties.get("url").toString());
		driver.findElement(By.id("fl_email")).sendKeys(properties.get("userName").toString());
		driver.findElement(By.id("fl_password")).sendKeys(properties.get("password").toString());
		driver.findElement(By.xpath("//span[text()='Login']")).click();

	}
}
