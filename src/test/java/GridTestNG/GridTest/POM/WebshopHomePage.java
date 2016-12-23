package GridTestNG.GridTest.POM;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class WebshopHomePage {
	
	WebDriver driver;

	public WebshopHomePage(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Log in")
	WebElement loginLink;
	
	public void clickLoginLink(){
		loginLink.click();
	}
	
	
}
