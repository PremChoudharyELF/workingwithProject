package workingWithPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusHomePage {

	public BusHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="src") private WebElement fromTextField;
	
	@FindBy(id="dest") private WebElement destTextField;
	
	@FindBy(id="onward_cal") private WebElement dateField;
	
	@FindBy(id = "search_btn") private WebElement searchButton;
	
	@FindBy(partialLinkText = "redbus") private WebElement redbusIcon;

	public WebElement getFromTextField() {
		return fromTextField;
	}

	public WebElement getDestTextField() {
		return destTextField;
	}

	public WebElement getDateField() {
		return dateField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getRedbusIcon() {
		return redbusIcon;
	}
	
	
	
}
