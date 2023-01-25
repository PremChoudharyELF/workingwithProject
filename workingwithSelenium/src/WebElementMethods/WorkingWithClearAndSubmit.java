package WebElementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClearAndSubmit {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php?module=Users&parent=Settings&view=Login&error=login");
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("Prem");
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("Choudhary");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
	}
}
