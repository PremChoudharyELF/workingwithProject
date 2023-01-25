package workingWithHYRtutorialsTestNg;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkingWithAssertions {

	@Test
	public void p5() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR tutorials",Keys.ENTER);
		String actualTitle=driver.getTitle();
		String expectTitle="HYR tutorials - Google Search";
		Assert.assertEquals(expectTitle,actualTitle,"Title mismatched");
		driver.quit();
	}
}
