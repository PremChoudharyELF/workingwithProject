package workingWithPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RedBus {

	@Test
	public void redbus() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		BusHomePage homepage=new BusHomePage(driver);
		homepage.getFromTextField().sendKeys("Bangalore",Keys.ENTER);
		homepage.getDestTextField().sendKeys("Chennai",Keys.ENTER);
		homepage.getDateField().click();
		driver.findElement(By.xpath("//td[text()='17']")).click();
		homepage.getSearchButton().click();
		
	}
}
