package pageObject;

import static commonAction.CommonAction.click;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static commonAction.CommonAction.*;
public class LocationPage {
	
	public  LocationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "h1.txt.txt--tight.txt--bold.txt--32.txt--48\\@medium.ng-star-inserted")
	WebElement pageTitle;
	@FindBy(xpath  = "//input[@id='zipCodeInputEl']")
	WebElement zipcodefield;
	@FindBy(css = "button[id='btnStart']")
	WebElement startmyqout;

	public void locationpagetitlevalidation(String expected) {
		validate(pageTitle, expected);
	}
	
	public void inputzipcode(String zipcode, WebDriver driver) {
		zipcodefield.clear();
			JavascriptExecutor js = (JavascriptExecutor) driver;
//		insert(zipcodefield, zipcode);
			js.executeScript("arguments[0].value='11435';",zipcodefield);
		}
	
	public void clickonstartmyqoutebutton() {
		click(startmyqout);
	}
}
