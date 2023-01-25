package WorkingWithWebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetSizeAndGetPosition {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.udemy.com/");
		Dimension getSize = driver.manage().window().getSize();
		int height = getSize.getHeight();
		int width = getSize.getWidth();
		System.out.println(height);
		System.out.println(width);
		Thread.sleep(3000);

		Point windowPosition = driver.manage().window().getPosition();
		System.out.println(windowPosition.getX());
		System.out.println(windowPosition.getY());

		driver.quit();
	}
}
