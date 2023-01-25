package WorkingWithWebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithgetPageSourceCode {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		
		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.apple.com/");
			System.out.println(driver.getPageSource());
		}
}
