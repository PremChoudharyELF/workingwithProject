package WorkingWithLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithRegisterButton {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Prem");
		driver.findElement(By.id("LastName")).sendKeys("Choudhary");
		driver.findElement(By.id("Email")).sendKeys("abc123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Abc123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Abc123");
		driver.findElement(By.id("register-button")).click();

	}
}
