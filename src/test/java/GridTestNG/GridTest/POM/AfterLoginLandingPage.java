package GridTestNG.GridTest.POM;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class AfterLoginLandingPage {
	
	WebDriver driver;
	
	//public AfterLoginLandingPage(WebDriver driver){
		//this.driver=driver;
	//}
	
	@FindBy(how=How.XPATH,using="//a[contains(@href ,'/customer/info') ]")
	WebElement AfterSignInEmailAssert;

	public String assertLogin(){
		
		return (AfterSignInEmailAssert.getText());
		
	}
	
	
}
