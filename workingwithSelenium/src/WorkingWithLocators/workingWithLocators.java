package WorkingWithLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithLocators {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("abc123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("prem123");
	}
}
