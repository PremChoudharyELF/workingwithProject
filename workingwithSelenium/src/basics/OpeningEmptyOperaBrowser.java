package basics;

import org.openqa.selenium.opera.OperaDriver;

public class OpeningEmptyOperaBrowser {
static {
	System.setProperty("webdriver.opera.driver","./driver/operadriver.exe");
}
	public static void main(String[] args) {
		OperaDriver driver=new OperaDriver();
		
	}
}
