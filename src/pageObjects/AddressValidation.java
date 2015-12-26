package pageObjects;

import org.openqa.selenium.*;

public class AddressValidation {

	private static WebElement element = null;	    
 
     public static WebElement txtbx_StreetNumber(WebDriver driver){
         element = driver.findElement(By.id("streetNumberPhysical"));
         return element;
         }
 
     public static WebElement txtbx_StreetName(WebDriver driver){
         element = driver.findElement(By.id("streetNamePhysical"));
         return element;
         }
     
     public static WebElement txtbx_City(WebDriver driver){
         element = driver.findElement(By.id("cityPhysical"));
         return element;
         }
     
     public static WebElement txtbx_State(WebDriver driver){
         element = driver.findElement(By.id("statePhysical"));
         return element;
         }
     
     public static WebElement txtbx_ZipCode(WebDriver driver){
         element = driver.findElement(By.id("zipCodePhysical"));
         return element;
         }
     
     public static WebElement btn_ValidatePhysicalAddress(WebDriver driver){
         element = driver.findElement(By.id("validatePhysical"));
         return element;
         }
     
     public static WebElement txtmsg_AddressisbeingvalidatedPleasewait(WebDriver driver){
         element = driver.findElement(By.id("InProcessMessage"));
         return element;
         }
     
     public static WebElement rdobtn_Isthisforadditionalserviceatthisaddress(WebDriver driver){
         element = driver.findElement(By.id("additionalServiceYes"));
         return element;
         }
     
     public static WebElement rdobtn_Ismailing_billingaddresssameasphysicaladdress(WebDriver driver){
         element = driver.findElement(By.id("IsBillingAddressSameYes"));
         return element;
         }
          
}
