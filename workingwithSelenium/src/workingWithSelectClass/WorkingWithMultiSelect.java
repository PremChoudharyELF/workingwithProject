package workingWithSelectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithMultiSelect {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/User/Downloads/dropDown.html");
		WebElement multiSelect = driver.findElement(By.id("m1"));
		
		Select select=new Select(multiSelect);
		System.out.println("Is it multiple:"+select.isMultiple());
		select.selectByIndex(0);
		select.selectByValue("2");
		select.selectByVisibleText("Grapes");
		System.out.println(select.getFirstSelectedOption().getText());
		System.out.println("=====================================");
		List<WebElement> allOptions = select.getOptions();
		for(WebElement option:allOptions) {
			System.out.println(option.getText());
		}
		System.out.println("=====================================");
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		for(WebElement option:selectedOptions) {
			System.out.println(option.getText());
		}
		
}
}
