package pageObjects;

import org.openqa.selenium.*;

public class CreditCheck {
	
	private static WebElement element = null;
	 
    public static WebElement txtbx_CustomerFirstName(WebDriver driver){
    	 element = driver.findElement(By.id("firstName"));         
         return element;
         }
 
    public static WebElement txtbx_CustomerLastName(WebDriver driver){
   	 	element = driver.findElement(By.id("lastName"));         
        return element;
        }
    
    public static WebElement txtbx_SocialSecurityNumber(WebDriver driver){
   	 	element = driver.findElement(By.id("customerSSN"));         
        return element;
        }
    
    public static WebElement txtbx_DoBMonth(WebDriver driver){
		 element = driver.findElement(By.id("accountHolderDOBMonth"));   	 
		 return element;
		 }
    
    public static WebElement txtbx_DoBDay(WebDriver driver){
		 element = driver.findElement(By.id("accountHolderDOBDay"));         
		 return element;
		 }
    
    public static WebElement txtbx_DoBYear(WebDriver driver){
		element = driver.findElement(By.id("accountHolderDOBYear"));         
		return element;
		}
    
    public static WebElement txtbx_CanBeReachedNumber(WebDriver driver){
   	 	element = driver.findElement(By.id("canBeReachedNumber"));         
        return element;
        }
    
    public static WebElement txtbx_EmployerName(WebDriver driver){
		element = driver.findElement(By.id("employerName"));         
		return element;
		}
    
    public static WebElement btn_RunCreditCheck(WebDriver driver){
    	element = driver.findElement(By.xpath("//input[@id='creditCheckButton']"));         
        return element;
        }
    
    public static WebElement msg_RunningCreditCheck(WebDriver driver){    			  
    	element = driver.findElement(By.xpath(".//*[@id='ajaxRunCreditSaveOrderDIV']"));         
        return element;
        }
    
    public static WebElement btn_SaveOrder(WebDriver driver){
    	element = driver.findElement(By.id("saveOrderButtonId"));         
        return element;
        }
    
    public static WebElement msg_SavingOrder(WebDriver driver){    			  
    	element = driver.findElement(By.xpath(".//*[@id='ajaxRunCreditSaveOrderDIV']"));         
        return element;
        }
}
