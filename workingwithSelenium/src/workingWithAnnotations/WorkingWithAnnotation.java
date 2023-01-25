package workingWithAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithAnnotation {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("before test");
		}
	
	@AfterMethod
	public void tearBrowser() {
		driver.quit();
		System.out.println("after test");
		}
	
	@Test
	public void workingWithGoogle() {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR tutorials",Keys.ENTER);
		System.out.println("google");
	}
	
	@Test
	public void workingwithfacebook() {
		driver.get("https://www.facebook.com/");
		System.out.println("facebook");
	}
}
