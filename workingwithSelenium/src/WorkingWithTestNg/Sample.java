package WorkingWithTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
     @Test
	public void openingGoogle() {
    	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.close();
	}
     
     @Test
     public void openingMaharashtra() {
    	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    	 WebDriver driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("https://www.maharashtra.gov.in/1125/Home");
 		driver.close();
     }
     @Test
     public void demoActitime() {
    	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    	 WebDriver driver=new ChromeDriver();
  		driver.manage().window().maximize();
  		driver.get("https://demo.actitime.com/user/submit_tt.do"); 
  		driver.close();
     }

     @Test
     public void vtiger() {
    	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    	 WebDriver driver=new ChromeDriver();
   		driver.manage().window().maximize();
   		driver.get("https://www.vtiger.com/");  
   		driver.close();
     }
}