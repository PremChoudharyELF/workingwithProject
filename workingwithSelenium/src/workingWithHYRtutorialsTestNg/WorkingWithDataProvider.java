package workingWithHYRtutorialsTestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider {

	@Test(dataProvider = "loginData")
	public void testMethod(String userName, String pwd) throws IOException {
		FileInputStream fis = new FileInputStream(new File("./testData/practiceConfiguration.properties"));
		Properties properties = new Properties();
		properties.load(fis);

		String key = properties.getProperty("key").toString();
		String value = properties.getProperty("value").toString();
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@DataProvider(name = "loginData")
	public Object[][] logindetails() {
		Object data[][] = new Object[2][2];
		data[0][0] = "admin123@gmail.com";
		data[0][1] = "admin123";

		data[1][0] = "Manager123@gmail.com";
		data[1][1] = "Manager123";

		return data;
	}
}
