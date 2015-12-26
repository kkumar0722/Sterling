package commonLibrary;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import pageObjects.Packages;
import commonLibrary.POC;

@SuppressWarnings("unused")
public class TestCase01 {


	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {	
		
		System.out.println("Execting test");
		
		/*WebDriver driver = new FirefoxDriver();		
		
		//Login to Sterling 7
		Sterling.Login(Constants.strUrl,Constants.strUserId,Constants.strPwd,driver);		
		
		//Address Validation
		Sterling.AddressValidation(driver);
		
		Sterling.ProductCatalog(driver);
		
		//Credit Check
		Sterling.CreditCheck(driver);
		
		//Directory Listing
		Sterling.DirectoryListing(driver);
		
		//Order Products
		Sterling.AddProducts(driver);
		
		//Logout from application;
		//Sterling.Logout(driver);*/
		
		/*WebElement htmltable = Packages.table_Packages(driver);
		List<WebElement> rows = htmltable.findElements(By.tagName("tr"));
		int RowCount = rows.size();
		System.out.println("No: of rows : " + RowCount);
		
		//List<WebElement> columns = rows.get(rnum).findElements(By.tagName("td"));
		List<WebElement> columns;
		for(int rnum=0; rnum<rows.size(); rnum++) {			
			columns = rows.get(rnum).findElements(By.tagName("td"));		
			for(int cnum=0; cnum<columns.size(); cnum++)
				
				System.out.println("row = " + rnum + ", col = " + cnum + " -- " + columns.get(cnum).getText());		
				}	*/	
		
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
	 	  WebElement element = wait.until(ExpectedConditions.visibilityOf(Packages.rdobtn_AL_Primary_Local_Exchange_Carrier_Freeze(driver)));*/		
		
		
		// C:\Selenium\Data Sheets\test-data.xlsx

		//SetUp_TearDown st = new SetUp_TearDown();
			
		System.out.println("TestCase01 executed");
	}

}

