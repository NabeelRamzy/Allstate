package unittest;

import org.testng.annotations.Test;

import utils.HomeQuoteData;

public class UnitTest {

	
	@Test(enabled = false)
	 public void unitTestHomeData() {
		 HomeQuoteData data = new HomeQuoteData("jhon", "L", "Smith", null, null, null, null, null, null, null, null);
		 System.out.println(data.getFirstname());
		 	 
	 }
	
	@Test
	public void system_getpropertyTest() {
		System.out.println(System.getProperty("user.name"));
	}
}
