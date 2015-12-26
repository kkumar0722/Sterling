package commonLibrary;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.Date;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.*;

import pageObjects.*;

@SuppressWarnings("unused")
public class Sterling {

	//Login to Sterling
	public static void Login(String strUrl,String strUserId,String strPwd,WebDriver driver){
								  
		  //Check if already logged in and logout
		  //Sterling.Logout(driver);
		  
		 //Login to Sterling 7
		driver.get(strUrl);
		driver.manage().window().maximize();
		if (LoginPage.txtbx_UserName(driver).isDisplayed() == true){
			LoginPage.txtbx_UserName(driver).sendKeys(strUserId);
			LoginPage.txtbx_Password(driver).sendKeys(strPwd);
			LoginPage.btn_LogIn(driver).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Login Successful - Userid: " + strUserId + " Pwd: "+strPwd);
		}else {
			  System.out.println("Application not launched");
		  }									
	}
	
	public static void Logout(WebDriver driver){
		if (HomePage.lnk_Logout(driver).isDisplayed() == true) {
		  HomePage.lnk_Logout(driver).click();		  
		  driver.close();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	}
	
	//Address Validation
	public static void AddressValidation(WebDriver driver) throws InterruptedException{
		
		String intStreetNum = "3734";
		String strStreetName = "Flowing Brook Dr";
		String strCity = "Fort Wayne"; 
		String strState = "IN";
		String intZipCode = "46818";
		
		HomePage.tab_AddressValidation(driver).click();
		AddressValidation.txtbx_StreetNumber(driver).sendKeys(intStreetNum);
		AddressValidation.txtbx_StreetName(driver).sendKeys(strStreetName);
		AddressValidation.txtbx_City(driver).sendKeys(strCity);
		AddressValidation.txtbx_State(driver).sendKeys(strState);
		AddressValidation.txtbx_ZipCode(driver).sendKeys(intZipCode);
		AddressValidation.btn_ValidatePhysicalAddress(driver).click();
		Thread.sleep(4000);
		if (WebObjUtilities.objExist(AddressValidation.txtmsg_AddressisbeingvalidatedPleasewait(driver), false) == false) {			
			if (AddressValidation.rdobtn_Isthisforadditionalserviceatthisaddress(driver).isDisplayed() == true) {
				AddressValidation.rdobtn_Isthisforadditionalserviceatthisaddress(driver).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				AddressValidation.rdobtn_Ismailing_billingaddresssameasphysicaladdress(driver).click();
			}else if (AddressValidation.rdobtn_Ismailing_billingaddresssameasphysicaladdress(driver).isDisplayed() == true) {
				AddressValidation.rdobtn_Ismailing_billingaddresssameasphysicaladdress(driver).click();
			}			
		}		
	}
	
	public static void ProductCatalog(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ProductCatalog.btn_Continue(driver).click();		
	}
	
	//Credit Check
	public static void CreditCheck(WebDriver driver) throws InterruptedException{
		
		//Variables
		String FirstName = "FName";
		String LastName = "LName";
		String SSN = "753649875";
		String DoBMonth = "3";
		String DoBDate = "8";
		String DoBYear = "1962";
		String Phone = "8527414562";
		String EmployerName = "Fox News";
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		CreditCheck.txtbx_CustomerFirstName(driver).sendKeys(FirstName);
		CreditCheck.txtbx_CustomerLastName(driver).sendKeys(LastName);
		CreditCheck.txtbx_SocialSecurityNumber(driver).sendKeys(SSN);		
		CreditCheck.txtbx_DoBMonth(driver).sendKeys(DoBMonth);
		CreditCheck.txtbx_DoBDay(driver).sendKeys(DoBDate);
		CreditCheck.txtbx_DoBYear(driver).sendKeys(DoBYear);
		CreditCheck.txtbx_CanBeReachedNumber(driver).sendKeys(Phone);
		CreditCheck.txtbx_EmployerName(driver).sendKeys(EmployerName);
		CreditCheck.btn_RunCreditCheck(driver).click();
		if (WebObjUtilities.objExist(CreditCheck.msg_RunningCreditCheck(driver), false) == false) {
			//driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			CreditCheck.btn_SaveOrder(driver).click();
		}
	}
	
	//Directory Listing
	public static void DirectoryListing(WebDriver driver) throws InterruptedException {
		
		if (WebObjUtilities.objExist(CreditCheck.msg_SavingOrder(driver), false) == false) {
			DirectoryListing.rdobtn_Published(driver).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			DirectoryListing.rdobtn_listingSelection(driver).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			DirectoryListing.btn_SaveDirectoryListing(driver).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			DirectoryListing.btn_Next(driver).click();
		}
	}
	
	public static void AddProducts(WebDriver driver) throws InterruptedException {
				
		String strPassword = "Welcome1";
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Packages.tab_Promotions(driver).click();*/
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Packages.rdobtn_FrontierDigitalPhoneUnlimited(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//if (WebObjUtilities.objExist(Packages.rdobtn_BundleTerm_2YearTermDP(driver), true) == true) {
			Packages.rdobtn_BundleTerm_2YearTermDP(driver).click();
		//}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		Packages.tab_AccessLine(driver).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Packages.rdobtn_AL_Primary_Local_Exchange_Carrier_Freeze(driver).click();		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Packages.tab_Internet(driver).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Packages.rdobtn_Int_Product_Simply_Broadband_FiOS_30M(driver).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Packages.tab_FrontierSecure(driver).click();
		Thread.sleep(9000);
		Packages.subtab_Int_Provisioning(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Packages.txtbox_Int_Provisioning_SecurityAnswer(driver).sendKeys("1234");				
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Packages.btn_Int_Provisioning_Assign(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		
		//Switch to Pop-up/Child Window
	    for (String handle1 : driver.getWindowHandles())
			  driver.switchTo().window(handle1);
	    
		Thread.sleep(5000);
		String strUserName = GenericUtilities.RandomString(3)+GenericUtilities.AppendDateTime();
		Packages.txt_UserName(driver).sendKeys(strUserName);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Packages.txt_Password(driver).sendKeys(strPassword);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Packages.btn_Submit(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Packages.btn_Assign(driver).click();
		
		//Switch back to Parent Window
		for (String handle1 : driver.getWindowHandles())
			  driver.switchTo().window(handle1);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Packages.tab_Int_WirelessData(driver).click();
		Thread.sleep(9000);
		Packages.tab_FrontierSecure(driver).click();
		Thread.sleep(9000);
		Packages.rdobtn_DeclineReasons_OtherProvider(driver).click();
		Thread.sleep(9000);
		Packages.chkbox_NestProducts(driver).click();
		Thread.sleep(9000);
		Packages.btn_Add(driver).click();
		Thread.sleep(9000);
		Packages.btn_CompleteOrder(driver).click();
		Thread.sleep(9000);
		Packages.btn_ReviewOrder(driver).click();
		Thread.sleep(9000);
		Packages.btn_ConfirmOrder(driver).click();
		Thread.sleep(9000);
		String intPhoneNum = Packages.text_TelephoneNum(driver).getText();
		if (intPhoneNum != "") {
			System.out.println(intPhoneNum);
		}
		Thread.sleep(1000);
		String intOrderNum = Packages.text_OrderNum(driver).getText();
		if (intOrderNum != "") {
			System.out.println(intOrderNum);
		}
		Thread.sleep(1000);
		String strStatus = Packages.text_Status(driver).getText();
		if (strStatus != "") {
			System.out.println(strStatus);
		}
		Thread.sleep(1000);
		if (Packages.text_OderSuccess(driver).isDisplayed() == true){
			System.out.println("Order submitted successfully");
		}
	}
}
