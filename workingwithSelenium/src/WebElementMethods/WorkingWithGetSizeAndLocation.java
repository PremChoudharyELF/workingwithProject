package WebElementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetSizeAndLocation {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement emailId = driver.findElement(By.id("email"));
		WebElement passWord = driver.findElement(By.id("passContainer"));

		Point emailIdLocation = emailId.getLocation();
		Point passWordLocation = passWord.getLocation();
		Dimension emailIdTextFieldSize = emailId.getSize();
		Dimension passWordTextFieldSize = emailId.getSize();

		int emailIdXLoaction = emailIdLocation.getX();
		int passwordXLocation = passWordLocation.getX();

		int emailIdXLocationPlusWidth = emailIdTextFieldSize.getWidth() + emailIdXLoaction;
		int passWordXLocationPlusWidth = passWordTextFieldSize.getWidth() + passwordXLocation;

		// Right side allignment
		if (emailIdXLocationPlusWidth == passWordXLocationPlusWidth) {
			System.out.println("Right side properly alligned");
		} else {
			System.out.println("Right side properly not alligned");
		}
		// left side allignment
		if (emailIdXLoaction == passwordXLocation) {
			System.out.println("Left side properly alligned");
		} else {
			System.out.println("Left side properly not alligned");
		}
		driver.close();
	}
}
