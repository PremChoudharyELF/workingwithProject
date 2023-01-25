package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_Q9 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String currentWindowId=driver.getWindowHandle();
		System.out.println(currentWindowId);
}
}
