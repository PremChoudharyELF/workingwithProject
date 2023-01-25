package workingWithHYRtutorialsTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P4 {
static WebDriver driver;
	@Test(groups = {"smoke"})
	public void loginHrm() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement webElement = driver.findElement(By.name("username"));
		webElement.clear();
		webElement.sendKeys("Admin");
		WebElement webElement2 = driver.findElement(By.name("password"));
		webElement2.clear();
		webElement2.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	System.out.println(driver.findElement(By.xpath("//img[@alt='profile picture']")).isDisplayed());
	}
	
}
