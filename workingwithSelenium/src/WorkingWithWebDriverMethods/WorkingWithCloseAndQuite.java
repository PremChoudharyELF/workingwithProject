package WorkingWithWebDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCloseAndQuite {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/User/Downloads/MultipleWindow%20(1).html");
			driver.findElement(By.xpath("//input")).click();
			Thread.sleep(2000);
			
			Set<String> allWindows = driver.getWindowHandles();
			for(String window:allWindows) {
				System.out.println(window);
			}
			
			driver.quit();
			
}
}
