package dynamicXpath;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWoodenStreet {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the index");
		int index=sc.nextInt();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[contains(@id,'loginclose')]")).click();
		driver.findElement(By.xpath("//img[@alt='Study Table']")).click();
		// Thread.sleep(15000);

		WebElement addtoCart = driver.findElement(By.xpath("(//p[contains(text(),'Add to Cart')])[2]"));
		String text = driver.findElement(By.xpath("(//p[contains(text(),'Add to Cart')])["+index+"]/../..//div/strong"))
				.getText();

		text = text.replaceAll("[^0-9]", "");
		int price = Integer.parseInt(text);
		System.out.println(price);
		if (price < 10000) {
			addtoCart.click();
		} else {
			System.out.println("price is to high");
		}

	}
}
