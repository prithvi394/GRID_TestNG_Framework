package GridTestNG.GridTest.IntegrationTest;

import org.testng.annotations.*;

import GridTestNG.GridTest.BasePackage.BaseGrid;
import GridTestNG.GridTest.POM.WebshopHomePage;
import GridTestNG.GridTest.POM.AfterLoginLandingPage;
import GridTestNG.GridTest.POM.SignInSignUpPage;

import java.net.MalformedURLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;



public class WebShopSignInTest extends BaseGrid {
	
  @Parameters("browser")
  public WebShopSignInTest(String browser) throws MalformedURLException {
	  	super(browser);
		// TODO Auto-generated constructor stub
	}
  
  Logger stdLog = LogManager.getLogger(WebShopSignInTest.class);
  
  @BeforeTest  
  public void testDeclaration() {
	  BaseGrid.OpenUrl(driver, baseURL);
	  stdLog.info("Browser invoked!!");
  }
  
  @Test
  public void testSteps() {
	  
	System.out.println("I'm in teststeps!!");
	WebshopHomePage wshpObj=PageFactory.initElements(driver, WebshopHomePage.class);
	wshpObj.clickLoginLink();
	
	SignInSignUpPage signInSignUpPageObj=PageFactory.initElements(driver, SignInSignUpPage.class);
	signInSignUpPageObj.enterCredsSubmit("seleniumtest@gmail.com", "passw0rd");
	stdLog.info("Entered UserName and Password");
	
	
	AfterLoginLandingPage AfterLoginLandingPageobj=PageFactory.initElements(driver, AfterLoginLandingPage.class);
	String assertVal=AfterLoginLandingPageobj.assertLogin();
	if (assertVal.equals("seleniumtest@gmail.com")){
		stdLog.info("AssertSuccess");
	}
	else{
		stdLog.info("AssertFailure");
	}
	
	
  }

  @AfterTest
  public void afterClass() {
	  BaseGrid.teardownDriver(driver);
	  stdLog.info("Browser Closed!!");
  }

}
