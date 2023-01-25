package workingWithHYRtutorialsTestNg;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WorkingWithParameters {
	WebDriver driver;
	@Parameters("browserName")
	@BeforeTest
	public void launchApplication(@Optional("chrome")String browserName) {
		
		switch(browserName.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "edge":
			System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
			driver=new EdgeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			default:
				System.out.println("no such browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void tearProgram() {
		driver.quit();
	}
	
	@Parameters("url")
	@Test(priority=1)
	public void launch(String url) {
		driver.get(url);
	}
	
	@Parameters({"username","password"})
	@Test(priority = 2,enabled = true)
	public void enterCredentials(String username,String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}
	
	@Test(priority=3)
	public void verifyWelcomepage() {
		System.out.println(driver.findElement(By.id("loginButton")).isDisplayed());
	}
	
}
