package workingWithGoogle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithGoogle {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebDriverWait explicitwait=new WebDriverWait(driver, 15);
		driver.get("https://www.google.com/");

		//driver.findElement(By.xpath("//button[text()='No thanks']")).click();

		driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();
		driver.switchTo().frame("app");
		driver.findElement(By.xpath("//a[.='Maps']")).click();

	}
}
