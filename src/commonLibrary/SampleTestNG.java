package commonLibrary;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commonLibrary.SetUp_TearDown;
import commonLibrary.POC;


public class SampleTestNG {
	
	public static WebDriver driver;
	String browser = "firefox";
	
	//@Parameters("browser")
	@BeforeTest	
	public void BeforeTest() throws Exception{
		SetUp_TearDown.setup(browser);
	}
 
    @Test
    public void AtTest() throws IOException {
        POC.Calculator(driver);
    }

	
}
