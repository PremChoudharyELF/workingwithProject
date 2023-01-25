package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_Q10 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Downloads/MultipleWindow%20(1).html");
		driver.findElement(By.xpath("//input")).click();
		Thread.sleep(2000);
		Set<String> allwindowId = driver.getWindowHandles();
		for(String window:allwindowId) {
			if(driver.switchTo().window(window).getTitle().contains("Barbeque")) {
				driver.close();
			}
		}
}
}
