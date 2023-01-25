package Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_Q8 {

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
		Iterator<String> window=allWindows.iterator();
		String parentWindow=window.next();
		String parentWindowTitle = driver.switchTo().window(parentWindow).getTitle();
		for(String allwindow:allWindows) {
			WebDriver childwindow = driver.switchTo().window(allwindow);
			String title=childwindow.getTitle();
			if(!parentWindowTitle.equals(title)) {
				System.out.println(title);
				driver.close();
			}
		}
}
}
