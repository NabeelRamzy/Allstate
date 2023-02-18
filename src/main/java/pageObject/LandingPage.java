package pageObject;

import static commonAction.CommonAction.click;
import static commonAction.CommonAction.validate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LandingPage {
	
	public  LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(css = "h1.pt-4.pb-1.pb-lg-4.pl-page.pr-page")
	WebElement title;
	@FindBy(id = "lbl--auto")
	WebElement auto;
	@FindBy(id = "lbl--home")
	WebElement homeButton;
	@FindBy(id = "heroBundleGetQuote")
	WebElement getAqouteButton;
	
    public void validatelandingpagetitle(String expectedTitel) {
		validate(title, expectedTitel);
	}
	
	public void unclicktheautobutton() {
		click(auto);
	}

	public void clickonhomebutton() {
		click(homeButton);
	}
	
	
	public void clickongetAqouteButton() {
		click(getAqouteButton);
	}
}
