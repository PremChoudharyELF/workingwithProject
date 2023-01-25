package workingWithAlert;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithCalendarPopupOfGoibibo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		LocalDateTime systemTime = LocalDateTime.now().plusYears(1);
		String monthName = systemTime.getMonth().name();
		int date = systemTime.getDayOfMonth();
		System.out.println(monthName);
		System.out.println(date);
		int year = systemTime.getYear();
		monthName = monthName.substring(0, 1).toUpperCase() + monthName.substring(1).toLowerCase();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		Actions action = new Actions(driver);
		action.moveByOffset(0, 10).click().perform();
		driver.findElement(
				By.xpath("//*[contains(@class,'fswDownArrow') and not(contains(@class,'fswDownArrowTraveller'))]"))
				.click();
		for (;;) {
			try {
				driver.findElement(
						By.xpath("//div[text()='" + monthName + " " + year + "']/../..//p[text()='" + date + "']"))
						.click();
				driver.findElement(By.xpath("//span[text()='Done']")).click();
				break;
			} catch (NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}
}
