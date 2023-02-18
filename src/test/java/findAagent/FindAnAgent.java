package findAagent;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.RootClass;

public class FindAnAgent extends RootClass {
	
	@Test(priority = 2, groups = "agent")
	public void findAnAgent() {
		findAnAgent.clickfindanAgent();
		findAnAgent.validatepagetitle("Find an Allstate Insurance Agent Near You");
		findAnAgent.insertzipcode("11435");
		findAnAgent.clciksearchbutton();
		findAnAgent.clcikonfilters();
	//	findAnAgent.experieancedropdown();
	//	findAnAgent.distancedropdown();
		findAnAgent.clickCommercialInsuranceExpert(driver);
		findAnAgent.clickapply(driver);
		findAnAgent.clickonlist();
	//	findAnAgent.clickmyAgent(driver);
	}
  

}
 