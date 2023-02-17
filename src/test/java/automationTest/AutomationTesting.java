package automationTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.RootClass;
import reporting.Logs;

public class AutomationTesting extends RootClass{
	
	@Test 
	public void landingpageTest() throws InterruptedException {
	landingPage.validatelandingpagetitle("get a quote in the blink of an eye");
	landingPage.unclicktheautobutton();	
	landingPage.clickonhomebutton();
	landingPage.clickongetAqouteButton();
	locationPage.locationpagetitlevalidation("bundle to see how much you could save");
	locationPage.inputzipcode("11435",driver);
	locationPage.clickonstartmyqoutebutton(); 
	informationPage.validatepagetitle("");
	informationPage.insertfirstname("Jhon");
	informationPage.insertmiddlename("L");
	informationPage.insertlastname("Smith");
	informationPage.suffixdropdown();
	informationPage.insertsteetaddressfield("14539 Arlington Terrace");
	informationPage.insertapt("2");
	informationPage.insertcity("Jamaica");
	informationPage.insertdateofbirth( driver, "10201993");
	informationPage.clicknextbutton();
	}
    
	@Test(priority = 0 , groups = {"home" , "non-func"})
	public void pretest1() {
		Logs.log("Test1");
	}
	
	@Test(priority = 1, groups = {"home " , "non-func"})
	public void pretest2() {
		Logs.log("Test2");
	}
}
