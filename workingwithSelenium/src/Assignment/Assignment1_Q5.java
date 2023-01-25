package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_Q5 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Downloads/MultipleWindow%20(1).html");
		driver.findElement(By.xpath("//input")).click();
		Thread.sleep(2000);
		Set<String> allwindows = driver.getWindowHandles();
		for(String window:allwindows) {
		System.out.println(driver.switchTo().window(window).getTitle());
		}
		driver.quit();
		
}
}
