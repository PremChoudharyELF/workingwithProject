package workingWithSelectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithFacebook {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		WebElement dayDropDown = driver.findElement(By.id("day"));
		WebElement monthDropDown = driver.findElement(By.id("month"));
		WebElement yearDropDown = driver.findElement(By.id("year"));
		// days DropDown
		Select workingWithDayDropDown = new Select(dayDropDown);
		System.out.println(workingWithDayDropDown.isMultiple());
		List<WebElement> daysOptions = workingWithDayDropDown.getOptions();
		for (WebElement dayOption : daysOptions) {
			System.out.print(dayOption.getText() + " ");
		}
		System.out.println();
		System.out.print("=================================");
		workingWithDayDropDown.selectByIndex(9);
		// month dropdown
		Select workingWithMonthDropDown = new Select(monthDropDown);
		List<WebElement> monthsOptions = workingWithMonthDropDown.getOptions();
		for (WebElement monthOption : monthsOptions) {
			System.out.print(monthOption.getText() + " ");
		}
		System.out.println();
		System.out.print("=======================================");
		workingWithMonthDropDown.selectByValue("12");
		// year dropdown
		Select workingWithYearDropDown = new Select(yearDropDown);
		List<WebElement> yearOptions = workingWithYearDropDown.getOptions();
		for (WebElement yearOption : yearOptions) {
			workingWithYearDropDown.selectByVisibleText(yearOption.getText());
			System.out.print(yearOption.getText() + " ");

		}
		System.out.println();
		System.out.print("===========================================");

	}
}
