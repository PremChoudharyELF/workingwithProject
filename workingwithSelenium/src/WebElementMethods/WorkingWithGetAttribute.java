package WebElementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetAttribute {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://demowebshop.tricentis.com/login");
			WebElement element = driver.findElement(By.id("small-searchterms"));
			element.sendKeys("hello");
		System.out.println(element.getAttribute("value"));
		WebElement element1 = driver.findElement(By.xpath("//a[contains(@href,'register')]"));
		System.out.println(element1.getText());
}
}
