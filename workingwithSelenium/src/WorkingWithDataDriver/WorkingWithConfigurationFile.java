package WorkingWithDataDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithConfigurationFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(new File("./testData/practiceConfiguration.properties"));
		Properties properties=new Properties();
		properties.load(fis);
		
		System.setProperty(properties.getProperty("key").toString(),properties.getProperty("value").toString());
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(properties.getProperty("browser").toString());
	}
}
