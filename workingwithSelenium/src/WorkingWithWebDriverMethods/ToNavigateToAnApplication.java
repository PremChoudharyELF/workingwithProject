package WorkingWithWebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToAnApplication {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ferrari.com/en-IN");
		driver.get("https://www.lamborghini.com/en-en");
	}
}
