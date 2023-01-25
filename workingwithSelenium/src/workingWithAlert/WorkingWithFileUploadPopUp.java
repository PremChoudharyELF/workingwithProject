package workingWithAlert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFileUploadPopUp {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.freshersworld.com/");
		driver.findElement(By.xpath("//span[text()='REGISTER NOW']")).click();
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\User\\Pictures\\Camera Roll\\CC.png");
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\User\\Pictures\\Camera Roll\\Sonali_1yr_java.docx");
	}
}
