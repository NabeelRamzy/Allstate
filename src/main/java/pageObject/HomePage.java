package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public  HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
   }
	
   WebElement homepagetitle;
   WebElement buildyearfield;
   WebElement selectbilevel;
   WebElement squarefeetfield;
   WebElement nextbutton;

	
}