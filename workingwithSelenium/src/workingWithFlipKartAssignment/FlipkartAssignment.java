package workingWithFlipKartAssignment;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAssignment {
	static Scanner sc = new Scanner(System.in);
	static WebDriver driver;

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void addElements(String productName) {
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys(productName,
				Keys.ENTER);
		driver.findElement(By.xpath("//div[contains(text(),'" + productName + "')]")).click();
	}

	public static void main(String[] args) {
		System.out.println("enter the mobile");
		String mobile = sc.nextLine();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		// input[@title='Search for products, brands and more']
		addElements(mobile);
	}
}