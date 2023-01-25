package workingWithPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Via_Home_Page {

	public Via_Home_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="src") private WebElement fromTextField;
	
	@FindBy(id="dest") private WebElement destTextField;
	
	@FindBy(id="departure") private WebElement calenderPopUp;
	
	@FindBy(xpath = "//input[@value='Search Buses' and contains(@class,'journey')]") private WebElement searchButton;

	public WebElement getFromTextField() {
		return fromTextField;
	}

	public WebElement getDestTextField() {
		return destTextField;
	}

	public WebElement getCalenderPopUp() {
		return calenderPopUp;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	
}
