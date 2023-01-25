package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpeningEmptyFireFoxBrowser {
static {
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	
}
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
	}
}
