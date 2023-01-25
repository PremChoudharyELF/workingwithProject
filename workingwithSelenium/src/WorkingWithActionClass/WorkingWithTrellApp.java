package WorkingWithActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithTrellApp {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://trello.com/login");
			WebDriverWait wait=new WebDriverWait(driver, 10);
			//driver.findElement(By.xpath("//button[text()=\"Sign up - it’s free!\"]")).click();
			//driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
			driver.findElement(By.id("user")).sendKeys("narentamil97@gmail.com");
			driver.findElement(By.id("login")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("password"))));
			driver.findElement(By.id("password")).sendKeys("Naren@123");
			

			driver.findElement(By.xpath("//span[text()='Log in']")).click();
}
}
