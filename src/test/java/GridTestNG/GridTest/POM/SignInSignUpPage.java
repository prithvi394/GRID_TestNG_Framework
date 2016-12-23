package GridTestNG.GridTest.POM;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class SignInSignUpPage {
	
	WebDriver driver;
	
	public SignInSignUpPage(WebDriver driver){
		this.driver=driver;		
	}
	
	@FindBy(how=How.ID,using="Email")
	WebElement emailID;
	
	@FindBy(how=How.ID,using="Password")
	WebElement passW0rd;
	
	@FindBy(how=How.ID,using="RememberMe")
	WebElement remMeChkBox;
	
	@FindBy(how=How.XPATH,using="//input[contains(@class, 'login-button') and contains(@class ,'button-1')]")
	WebElement submitButton;
	
	@FindBy(how=How.XPATH,using="//div[contains(@class, 'validation-summary-errors')]")
	WebElement loginUnsuccessfulTxt;
	
	public void enterCredsSubmit(String usrName,String passWrd){
		emailID.sendKeys(usrName);
		passW0rd.sendKeys(passWrd);
		submitButton.click();
	}
	
	public String checkInvalidLoginTxt(){
		return (loginUnsuccessfulTxt.getText());
	}

}
