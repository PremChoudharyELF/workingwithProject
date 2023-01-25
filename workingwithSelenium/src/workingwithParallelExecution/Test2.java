package workingwithParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void test3() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.triumphmotorcycles.in/");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	public void test4() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bmw.in/en/index.html");
		System.out.println(Thread.currentThread().getId());
	}
}
