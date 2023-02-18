package automationTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.RootClass;
import reporting.Logs;

public class AutomationTesting extends RootClass{
	
	@Test (enabled = true ,groups = "home") 
 	public void landingpageTest() throws InterruptedException {
	landingPage.validatelandingpagetitle("get a quote in the blink of an eye");
	landingPage.unclicktheautobutton();	
	landingPage.clickonhomebutton();
	landingPage.clickongetAqouteButton();
	locationPage.locationpagetitlevalidation("bundle to see how much you could save");
	locationPage.inputzipcode("11435",driver);
	locationPage.clickonstartmyqoutebutton(); 
	informationPage.validatepagetitle("let's start with the basics");
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
    
	@Test(enabled = false, priority = 0 , groups = {"home" , "non-func"}, dependsOnMethods = "test2", ignoreMissingDependencies = false)
	public void test1() {
		Logs.log("Test1");
	}
	
	@Test(enabled = false, priority = 1, groups = {"home " , "non-func"})
	public void test2() {
		Logs.log("Test2");
	}
	
	
	@Test(enabled = false, groups = { "login", "non-functional" }, retryAnalyzer = retry.RetryFailedTests.class)
	public void retryTest() {
		Logs.log("Retry Test");
		Assert.fail();
    }
	
	@Test(enabled = false, priority = 1, groups = {"home " , "non-func"}, invocationCount = 2 )
	public void test3() {
		Logs.log("Test2");
	}
	
}