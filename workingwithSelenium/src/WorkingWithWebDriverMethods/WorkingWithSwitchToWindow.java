package WorkingWithWebDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSwitchToWindow {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/User/Downloads/MultipleWindow%20(1).html");
		driver.findElement(By.xpath("//input")).click();
		Thread.sleep(3000);
		Set<String> allWindows = driver.getWindowHandles();
		String expectedTitle="Original Italian Recipes - Giallozafferano Recipes";
		
		for(String window:allWindows) {
			driver.switchTo().window(window);
		String actualTitle=driver.getTitle();
	
		if(expectedTitle.equals(actualTitle)) {
			driver.close();
			break;
		}
		}
		
}
}
