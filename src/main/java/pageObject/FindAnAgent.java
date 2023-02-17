package pageObject;

import static commonAction.CommonAction.click;
import static commonAction.CommonAction.insert;
import static commonAction.CommonAction.selectDropdown;
import static commonAction.CommonAction.validate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindAnAgent {
	
	
	public  FindAnAgent(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(xpath = "//a[@id='cf128f7c-3b92-47e9-b84c-0e79dd302f4f_acf4953e-4908-4dfb-a677-239b5acaeb81-header-desktop-nav-level-0-link']")
	WebElement findanagent;
	@FindBy(xpath = "//h1[normalize-space(text())='Find an Allstate Insurance Agent Near You']")
	WebElement pagetitle;
	@FindBy(css = "#zip")
	WebElement zipcode;
	@FindBy(css = "button.search-button.Locator-button.Button--mint.js-form-submit")
	WebElement searchbutton;
	@FindBy(xpath = "//span[text()='Filters']")
	WebElement filters; 
	@FindBy(xpath = "//select[@class='Filter-select' and @hidden='true' and @data-ya-track='loc_exp']")
	WebElement experience;
	@FindBy(xpath = "//select[@aria-labelledby='Filter-legend--r' and @hidden='true']")
	WebElement distance;
	@FindBy(xpath = "(//span[@class='Filter-check'])[1]")
	WebElement commercialInsuranceExpert;
	@FindBy(xpath = "//button[text()='Apply']")
	WebElement apply;
	@FindBy(css = "button.Locator-toggleView.Locator-toggleView--list.js-toggleView-list")
	WebElement list;
	@FindBy(xpath = "(//span[normalize-space(text())='Rajwinder Kaur']")
	WebElement myAgent;
	
	public void clickfindanAgent() {
		click(findanagent);
	}
	
	public void validatepagetitle(String expected) {
		validate(pagetitle, expected);
	}
	
	public void insertzipcode(String expected) {
		insert(zipcode, expected);
	}
	
	public void clciksearchbutton() {
		click(searchbutton);
	}
	
	public void clcikonfilters() {
		click(filters);
	}
	
	public void experieancedropdown() {
		selectDropdown(experience, "30+");
	}
	
	public void distancedropdown() {
		selectDropdown(distance, "25+mi");
	}
	
	public void clickCommercialInsuranceExpert(WebDriver driver) {
	//	click(commercialInsuranceExpert);
		JavascriptExecutor js = (JavascriptExecutor)driver;	
	    js.executeScript("arguments[0].click();",commercialInsuranceExpert );
				
	}
	
	public void clickapply(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;	
	    js.executeScript("arguments[0].click();", apply);
				
	}
	
	public void clickonlist() {
		click(list);
	}
	
	public void clickmyAgent(WebDriver driver) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].window.scrollIntoView()", myAgent);
	}
	
	
}
