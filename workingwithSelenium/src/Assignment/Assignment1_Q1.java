package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_Q1 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String pageSourceCode=driver.getPageSource();
		System.out.println(pageSourceCode);
		driver.quit();
	}
}
