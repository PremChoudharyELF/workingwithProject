package WorkingWithWebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSetSizeAndSetDiemnsion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.udemy.com/");
		Point point = new Point(0, 0);
		driver.manage().window().setPosition(point);
		Thread.sleep(2000);
		Dimension dimension = new Dimension(800, 800);
		driver.manage().window().setSize(dimension);

		driver.manage().window().fullscreen();
	}
}
