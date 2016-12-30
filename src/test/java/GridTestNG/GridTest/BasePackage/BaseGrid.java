package GridTestNG.GridTest.BasePackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	 public static final String USERNAME = "**";
	 public static final String ACCESS_KEY = "**";
	 public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	 
	 
	 public BaseGrid(String browser) throws MalformedURLException {
		// final Logger log = LogManager.getLogger(BaseGrid.class);
		 System.out.println(browser);
		 if(browser.equalsIgnoreCase("FireFox")){
			 	 capability= new DesiredCapabilities();
			 	 capability.setCapability("os", "Windows");
			 	 capability.setCapability("os_version", "8");
			 	 capability.setCapability("browser", "Firefox");
			 	 capability.setCapability("browser_version", "50.0");
			 	 
			 	 
		 }
		 else if(browser.equalsIgnoreCase("Chrome")){
			 capability= new DesiredCapabilities();
		 	 capability.setCapability("os", "Windows");
		 	 capability.setCapability("os_version", "8");
		 	 capability.setCapability("browser", "Chrome");
		 	 capability.setCapability("browser_version", "52.0");
		 }
		 
		 	driver =new RemoteWebDriver(new URL(URL),capability);
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



