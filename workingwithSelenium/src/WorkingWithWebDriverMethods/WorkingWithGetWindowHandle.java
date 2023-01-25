package WorkingWithWebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetWindowHandle {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
	}
}
