package commonAction;

import static org.testng.Assert.fail;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import reporting.Logs;

public class CommonAction {
	
	public static void click(WebElement element) {
		try {
			element.click();
			Logs.log(element + " ---> has been clicked");
		} catch (NullPointerException | NoSuchElementException e) {
			Logs.log(element + " ---> Element Not Found");
			Assert.fail();
		}
	}

	public static void validate(WebElement element, String expected) {
		String actual = "";
		try {
			actual = element.getText();
			Logs.log("Validating ---> Actual : *** " + actual + " ***. Expected : *** " + expected + " ***");
		} catch (NullPointerException | NoSuchElementException e) {
			Logs.log(element + " ---> Element Not Found");
			Assert.fail();
		}
		Assert.assertEquals(actual, expected);
	}

	public static void insert(WebElement element, String value) {
		try {
			element.sendKeys(value);
			Logs.log(value + " <--- This value has been passed into ---> " + element);
		} catch (NullPointerException | NoSuchElementException e) {
			Logs.log(element + " ---> Element Not Found");
			Assert.fail();
		}
	}
	public static void selectDropdown(WebElement element, String value) {
		  try {
		   Select select = new Select(element);
		   select.selectByValue(value);
		   Logs.log(value + " : has been selected for ---> " + element);
		  } catch (NoSuchElementException | NullPointerException e) {
		   e.printStackTrace();
		   Logs.log("ELEMENT NOT FOUND IN DROPDOWN -->" + element);
		   fail();
		  }
		 }
}



