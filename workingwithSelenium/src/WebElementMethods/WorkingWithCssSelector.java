package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCssSelector {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
	System.out.println(element.getCssValue("color"));
	System.out.println(element.getCssValue("font-size"));
	System.out.println(element.getCssValue("border-bottom-color"));
	//driver.quit();
}
}
