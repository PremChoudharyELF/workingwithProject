package WorkingWithLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDemoActiTime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.partialLinkText("Login")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		//Thread.sleep(2000);
		driver.findElement(By.id("logoutLink")).click();
		driver.findElement(By.id("username")).sendKeys("trainee");
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		driver.findElement(By.partialLinkText("Login")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		//Thread.sleep(2000);
		driver.quit();
		
}
}
