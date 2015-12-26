package commonLibrary;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverEngine;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class SetUp_TearDown {
	
	public static WebDriver driver;    		
	
    public static void setup(String browser) throws Exception{
 		
		
        //Check if parameter passed from TestNG is 'Firefox'	 
        if(browser.equalsIgnoreCase("firefox")){
        	File pathToBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox 41\\firefox.exe");
        	FirefoxBinary binary = new FirefoxBinary(pathToBinary);
        	FirefoxDriver driver = new FirefoxDriver(binary, new FirefoxProfile());
        	
        	//System.setProperty("webdriver.firefox.driver","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        	/*DesiredCapabilities capabilies = DesiredCapabilities.firefox();			
            capabilies.getBrowserName();
            capabilies.getVersion();*/
        			
        	//create Firefox instance	 
            //driver = new FirefoxDriver();  
            System.out.println("Browser Used: "+browser);
        }	 
        //Check if parameter passed is 'Chrome'
        // https://seleniumhq.github.io/selenium/docs/api/java/org/openqa/selenium/chrome/ChromeOptions.html
        // http://www.programcreek.com/java-api-examples/index.php?api=org.openqa.selenium.remote.DesiredCapabilities (Singleton)
        else if(browser.equalsIgnoreCase("chrome")){	             	 
            System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Assets\\chromedriver.exe");
            ChromeOptions opt = new ChromeOptions();
            opt.setBinary("C:\\Selenium\\Assets\\chromedriver.exe");
            opt.setExperimentalOption("Browser", "Chrome");
            opt.getExperimentalOption("version");
            
//            DesiredCapabilities capabilies = DesiredCapabilities.chrome();
//            capabilies.setBrowserName("chrome");
//            capabilies.setPlatform(Platform.WINDOWS);
//            capabilies.setVersion("38");
//            DesiredCapabilities capabilities = new DesiredCapabilities();
            
            //Create Chrome instance
            driver = new ChromeDriver(opt);	 
        }
        
        //Check if parameter passed is 'Safari'	
        else if(browser.equalsIgnoreCase("safari")){	             	 
        	System.setProperty("webdriver.safari.driver","C:/safaridriver.exe");
        	
        	//System.setProperty("webdriver.safari.noinstall", "true");
        	driver = new SafariDriver();
        	
        /*	SafariOptions options = new SafariOptions();
        	SafariDriver driver = new SafariDriver(options);
        	DesiredCapabilities capabilities = DesiredCapabilities.safari();
        	capabilities.setCapability(SafariOptions.CAPABILITY, options);*/
        }
        
          //Check if parameter passed is 'IE'	    
        else if(browser.equalsIgnoreCase("ie")){
        	//String IE32 = "C:\\Selenium\\Assets\\IEDriverServer_32.exe"; //IE 32 bit
			String IE64 = "C:\\Selenium\\Assets\\IEDriverServer_64.exe"; //IE 64 bit
        	System.setProperty("webdriver.ie.driver",IE64);
        	
   /*     	DesiredCapabilities capabilies = DesiredCapabilities.internetExplorer();
        	capabilies.setBrowserName("ie");
            capabilies.getBrowserName();
            capabilies.getPlatform();
            capabilies.getVersion();*/
            
        	//Create IE instance
        	driver = new InternetExplorerDriver();
        }	 
        else{	 
            //If no browser passed throw exception	 
            throw new Exception("Browser is not correct");	 
        }	        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	}
}
