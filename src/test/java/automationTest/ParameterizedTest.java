package automationTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.RootClass;
import utils.HomeQuoteData;

public class ParameterizedTest extends RootClass{
	
	@Parameters({"expectedTitle1" , "locationPageTitle1", "informationPageTitle1" , "firstname1", "middle1", "lastname1", "zipcode1" , "address1", "apt1", "city" , "dateofbirth"   })
	@Test (enabled = true ,groups = "home") 
 	public void create_HomeQuoteTest(String expectedTitle, String locationPageTitle, String informationPageTitle, String firstname, String middle,String lastname ,String zipcode , String address , String apt , String city , String dateofbirth ){
	landingPage.validatelandingpagetitle(expectedTitle);
	landingPage.unclicktheautobutton();	
	landingPage.clickonhomebutton();
	landingPage.clickongetAqouteButton();
	locationPage.locationpagetitlevalidation(locationPageTitle);
	locationPage.inputzipcode(zipcode,driver);
	locationPage.clickonstartmyqoutebutton(); 
	informationPage.validatepagetitle(informationPageTitle);
	informationPage.insertfirstname(firstname);
	informationPage.insertmiddlename(middle);
	informationPage.insertlastname(lastname);
	informationPage.suffixdropdown();
	informationPage.insertsteetaddressfield(address);
	informationPage.insertapt(apt);
	informationPage.insertcity(city);
	informationPage.insertdateofbirth( driver, dateofbirth);
	informationPage.clicknextbutton();
	}
    
	@Parameters({"landingPageTitle" , "zipcode", "informationPageTitle1" , "firstname1", "middle1", "lastname1", "zipcode1" , "address1", "apt1", "city" , "dateofbirth"   })
	@Test (enabled = true ,groups = "home") 
 	public void homeQuoteTest(String expectedTitle, String locationPageTitle, String zipcode , String informationPageTitle, String firstname, String middle,String lastname , String address , String apt , String city , String dateofbirth ){
	
	HomeQuoteData homeQuoteData = new HomeQuoteData(expectedTitle, zipcode, locationPageTitle, informationPageTitle, firstname, middle, lastname, address, apt, city, dateofbirth);
	
	landingPage.validatelandingpagetitle(homeQuoteData.getLandingPageTitle());	
	landingPage.unclicktheautobutton();	
	landingPage.clickonhomebutton();
	landingPage.clickongetAqouteButton();
	locationPage.locationpagetitlevalidation(homeQuoteData.getLocationPageTitle());
	locationPage.inputzipcode(zipcode,driver);
	locationPage.clickonstartmyqoutebutton(); 
	informationPage.validatepagetitle(homeQuoteData.getInformationPageTitle());
	informationPage.insertfirstname(homeQuoteData.getFirstname());
	informationPage.insertmiddlename(homeQuoteData.getMiddle());
	informationPage.insertlastname(homeQuoteData.getLastname());
	informationPage.suffixdropdown();
	informationPage.insertsteetaddressfield(homeQuoteData.getAddress());
	informationPage.insertapt(homeQuoteData.getApt());
	informationPage.insertcity(homeQuoteData.getApt());
	informationPage.insertdateofbirth( driver, homeQuoteData.getDateofbirth());
	informationPage.clicknextbutton();
	
	}
	
}