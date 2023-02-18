package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static commonAction.CommonAction.*;
public class InformationPage {
	
	public InformationPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
  
	@FindBy(id = "hdWarmup")
	WebElement pageTitle;
	@FindBy(css = "#PRIMARYFirstName")
	WebElement firstnamefield;
	@FindBy(css = "#PRIMARYMiddleName")
	WebElement middlenamefield;
	@FindBy(xpath = "//input[@id='PRIMARYLastName']")
	WebElement lastnamefield;
	@FindBy(xpath = "//select[@id='PRIMARYSuffix']")
	WebElement suffixdropdown;
	@FindBy(xpath = "//input[@id='CURRENTAddressLine1']")
	WebElement streetaddressfield;
	@FindBy(xpath = "//input[@id='CURRENTApt']")
	WebElement aptfield;
	@FindBy(css = "#CURRENTCity")
	WebElement cityfield;
	@FindBy(xpath = "//input[@id='PrimaryDOB']")
	WebElement dateofbirth;
	@FindBy(id = "btn_next")
	WebElement nextbutton;
	
	public void validatepagetitle(String expectedTitle) {
		validate(pageTitle, expectedTitle);
	}
	
	public void insertfirstname(String expected) {
		insert(firstnamefield, expected);
	}
	
	public void insertmiddlename(String expected) {
		insert(middlenamefield, expected);	
	}
	
	public void insertlastname(String expected) {
		insert(lastnamefield, expected);
	}
	
	public void suffixdropdown() {
		click(suffixdropdown);
		selectDropdown(suffixdropdown, "Sr.");
	}
	
	public void insertsteetaddressfield(String expected) {
		insert(streetaddressfield, expected);
	}
	
	public void insertapt(String expected) {
		insert(aptfield, expected);
	}
	
	public void insertcity(String expected) {
		insert(cityfield, expected);
	}
	
	public void insertdateofbirth(WebDriver driver , String expected) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='10/20/1993'", dateofbirth);
	}
	
	public void clicknextbutton() {
		click(nextbutton);
		
	}
}
