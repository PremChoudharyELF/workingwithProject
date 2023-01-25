package WorkingWithScreenShotsOfFailedTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass extends BaseTest {

	@Test
	public void google() {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		SoftAssert softassert = new SoftAssert();

		driver.findElement(By.name("q")).sendKeys("H y r tutorials",Keys.ENTER);
		String expectedTitle = "H y r tutorials - Google Search";
		String actualTitle = driver.getTitle();
		softassert.assertEquals(expectedTitle, actualTitle, "Title mismatched");
		softassert.assertAll();
	}

	@Test
	public void demowebShop() {
		String pwd = "Prem123";
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/login");
		SoftAssert softassert = new SoftAssert();
		WebElement Element = driver.findElement(By.id("Password"));
		Element.sendKeys(pwd);
		String actualValue = Element.getAttribute("value");
		softassert.assertEquals(pwd, actualValue, "pwd mismatched");
		System.out.println(pwd);
		softassert.assertAll();
	}

	@Test
	public void workingWithTest() {
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		SoftAssert softassert = new SoftAssert();

		// For title
		String ExpectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		softassert.assertEquals(ExpectedTitle, actualTitle, "Title mismatched");
		System.out.println(actualTitle);

		// for url
		String expectedUrl = "https://www.facebook.com/";
		String actualUrl = driver.getCurrentUrl();
		softassert.assertEquals(expectedUrl, actualUrl, "Url mismatched");

		driver.findElement(By.id("email")).sendKeys("HYR tutorials");
		driver.findElement(By.partialLinkText("Forgotten password?")).click();

		// for text
		String actualText = driver.findElement(By.id("identify_email")).getAttribute("aria-label");
		String expectedText = "Email address or mobile number";
		softassert.assertEquals(expectedText, actualText, "Text mismatched");

		driver.findElement(By.id("identify_email")).sendKeys("nxnkadcnkc", Keys.ENTER);

		// for border
		String actualBorder = driver.findElement(By.xpath("//div[@class='pam uiBoxRed']")).getCssValue("border");
		String expectedBorder = "1px solid rgb(221, 60, 16)";
		softassert.assertEquals(expectedBorder, actualBorder, "Border mismatched");
		System.out.println(actualBorder);

		//for text
		String actualerror = driver.findElement(By.xpath("(//div[@class='phl ptm uiInterstitialContent']//div)[3]"))
				.getText();
		String expectederror = "Your search did not return any results. Please try again with other information.";
		softassert.assertEquals(expectederror, actualerror, "Error mismatched");

		driver.quit();
		softassert.assertAll();
	}
}
