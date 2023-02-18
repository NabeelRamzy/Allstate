package base;

import static utils.IConstant.BROWSER;
import static utils.IConstant.CHROME;
import static utils.IConstant.EDGE;
import static utils.IConstant.EXPLICIT_WAIT;
import static utils.IConstant.FIREFOX;
import static utils.IConstant.IMPLECIT_WAIT;
import static utils.IConstant.PAGELOAD_WAIT;
import static utils.IConstant.SAFARI;
import static utils.IConstant.URL;
import static utils.IConstant.*;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputFilter.Status;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.github.dockerjava.transport.DockerHttpClient.Request.Method;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.FindAnAgent;
import pageObject.HomePage;
import pageObject.InformationPage;
import pageObject.LandingPage;
import pageObject.LocationPage;
import reporting.Logs;
import utils.ReadProperties;


public class RootClass {

	protected WebDriver driver;
	protected LandingPage landingPage;
	protected LocationPage locationPage;
	protected InformationPage informationPage;
	protected HomePage homePage;
	protected FindAnAgent findAnAgent;
	ReadProperties readProperties = new ReadProperties();;

	
    @Parameters("browser")
	@BeforeMethod
	public void setUpDriver(String browsername) {
	//	String browser =  readProperties.getProperty(BROWSER);
		String url =  readProperties.getProperty(URL);
		long pageLoadWait =  readProperties.getNumProperty(PAGELOAD_WAIT);
		long implicitlyWait =  readProperties.getNumProperty(IMPLECIT_WAIT);
		long explicitWait =  readProperties.getNumProperty(EXPLICIT_WAIT);

		initDriver(browsername);
		initClass(driver);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadWait));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(implicitlyWait));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(explicitWait));

	}

	private void initClass(WebDriver driver) {
	landingPage = new LandingPage(driver);
	locationPage = new LocationPage(driver);
    informationPage = new InformationPage(driver);
    homePage = new HomePage(driver);
    findAnAgent = new FindAnAgent(driver);
	}

	private void initDriver(String driverName) {
		switch (driverName) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case SAFARI:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		}
	}

	@AfterMethod
	public void tearUp() {
		//driver.quit();

	}
   
//	@AfterMethod
/*	public void getResult(ITestResult result, Method method) {
		if(result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, PASSED);
		}else if(result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, FAILED);
			test.addScreenCaptureFromPath(captureScreenShot(driver, method.name()));
		}else if(result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, SKIPPED);
		}*/
	
	
}
