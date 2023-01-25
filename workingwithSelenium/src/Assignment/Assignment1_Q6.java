package Assignment;

import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_Q6 {
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
		TreeSet<String> elements=new TreeSet<>();
		for(String windowId:allwindowId) {
			String windowTitle = driver.switchTo().window(windowId).getTitle();
			elements.add(windowTitle);
		}
		for(String element:elements) {
			System.out.println(element);
		}
}
}
