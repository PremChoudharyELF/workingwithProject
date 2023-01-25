package makeMyTripAssignment;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithMakeMyTripAssignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	static WebDriver driver;
		public static void EnterFromCitytoCity(String fromCity, String toCity, String monthName, int year, int date)
			throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,10);
		// from
		driver.findElement(By.id("fromCity")).sendKeys(fromCity);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@role='listbox']//li")).click();
		// to
		driver.findElement(By.id("toCity")).sendKeys(toCity);
		Thread.sleep(1000);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ul[@role='listbox']//li)[1]")));
		driver.findElement(By.xpath("(//ul[@role='listbox']//li)[1]")).click();
		for (;;) {
			try {
				driver.findElement(
						By.xpath("//div[text()='" + monthName + " " + year + "']/../..//p[text()='" + date + "']"))
						.click();
				break;
			} catch (NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		//	driver.close();
		}
		//Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.partialLinkText("SEARCH"))));
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='listingCard']")));
		//Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		
	List<WebElement> allFlights = driver.findElements(By.xpath("//div[@class='listingCard']"));
	

		System.out.println("No of flights:"+allFlights.size());
		//return;
		driver.close();
		

	}

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Enter From city");
		String fromCity = sc.next();
		System.out.println("enter to city");
		String toCity = sc.next();
		System.out.println("enter the date");
		int day = sc.nextInt();
		System.out.println("enter the month");
		String month = sc.next();
		System.out.println("enter the year");
		int year = sc.nextInt();
		System.out.println(day);
		// System.out.println(month);
		System.out.println(year);
		month = month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase();
		System.out.println(month);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		// WebDriverWait wait=new WebDriverWait(driver,10);

		Actions action = new Actions(driver);
		action.moveByOffset(25, 75).click().perform();
		EnterFromCitytoCity(fromCity, toCity, month, year, day);
		System.out.println("enter y to continue else press anything to exit");
		char ch=sc.next().charAt(0);
		if(ch=='y'|| ch=='Y') {
			continue;
		}
		else {
			break;    
		}
		}
		while(true);

	}
}
