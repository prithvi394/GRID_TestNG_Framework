package GridTestNG.GridTest.IntegrationTest;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;



//@Listeners(utilities.SeleniumListeners.class)
public class TestNG_TestCase {
	private WebDriver driver;
	
	public WebDriver getDriver() {
        return driver;
	}
        
	private String baseUrl;
	//static Logger log = Logger.getLogger(UsingLog4j.class);

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		//PropertyConfigurator.configure("log4j.properties");
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testMethod() throws Exception {
		driver.get(baseUrl);
		
	}
	
	@Test
	public void testMethod1() throws Exception {
		
	}

	@AfterMethod
	public void afterMethod() {
	}

}
