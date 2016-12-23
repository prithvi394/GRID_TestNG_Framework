package GridTestNG.GridTest.BasePackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;


public class BaseGrid {
	
	 public WebDriver driver=null;
	 public String baseURL="http://demowebshop.tricentis.com/";
	 DesiredCapabilities capability;
	 
	 public BaseGrid(String browser) throws MalformedURLException {
		// final Logger log = LogManager.getLogger(BaseGrid.class);
		 System.out.println(browser);
		 if(browser.equalsIgnoreCase("FireFox")){
			 	 capability= DesiredCapabilities.firefox();
		 }
		 else if(browser.equalsIgnoreCase("Chrome")){
			     capability= DesiredCapabilities.chrome();
		 }
		 
		 	driver =new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capability);
		 	//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(baseURL);
	 }
	
	public static void OpenUrl(WebDriver driver,String baseUrl){
			//System.out.println("I am trying to navigate to URL page ");
			driver.get(baseUrl);
			
		}
	 
	 
	public static void teardownDriver(WebDriver driver){
		driver.quit();
	}
	
}



