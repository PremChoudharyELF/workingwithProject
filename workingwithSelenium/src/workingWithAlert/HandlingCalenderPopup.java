package workingWithAlert;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingCalenderPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		LocalDateTime Systemtime = LocalDateTime.now().plusYears(1);
		String monthName = Systemtime.getMonth().name();
		int date = Systemtime.getDayOfMonth();
		System.out.println(monthName);
		System.out.println(date);
		int year = Systemtime.getYear();
		monthName = monthName.substring(0, 1).toUpperCase() + monthName.substring(1).toLowerCase();
		System.out.println(monthName);
		System.out.println(year);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Actions action = new Actions(driver);
		action.moveByOffset(0, 10).click().perform();
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		// div[text()='December 2022']/../..//p[text()='28']
		for (;;) {
			try {
				driver.findElement(
						By.xpath("//div[text()='" + monthName + " " + year + "']/../..//p[text()='" + date + "']"))
						.click();
				break;
			} catch (NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();

			}
		}

	}
}
