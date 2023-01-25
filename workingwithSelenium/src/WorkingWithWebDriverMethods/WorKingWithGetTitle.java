package WorkingWithWebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorKingWithGetTitle {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
	String	pageTitle=driver.getTitle();
	System.out.println(pageTitle);
	}
}
