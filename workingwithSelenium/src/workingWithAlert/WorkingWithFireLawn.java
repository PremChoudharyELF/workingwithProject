package workingWithAlert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithFireLawn {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.firelawn.com/");
			driver.findElement(By.id("fl_login_btn")).click();
			driver.findElement(By.id("fl_email")).sendKeys("abcd@testyantra.com");
			driver.findElement(By.id("fl_password")).sendKeys("nopassword");
			driver.findElement(By.xpath("//span[text()='Login']")).click();
			//div[text()='successfully logged in']
			WebDriverWait wait=new WebDriverWait(driver,20);
wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[text()='successfully logged in']")));
	driver.findElement(By.xpath("//div[text()='successfully logged in']"));
	driver.findElement(By.xpath("//button[@type='button']")).click();
			
			
}
}
