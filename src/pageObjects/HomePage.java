package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private static WebElement element = null;
		 
    public static WebElement lnk_Logout(WebDriver driver){
    	element = driver.findElement(By.xpath("//a[contains(.,'Logout')]"));         
         return element;
         }
 
     public static WebElement tab_ProductCatalog(WebDriver driver){
    	 element = driver.findElement(By.xpath("//a[contains(.,'Product Catalog')]"));         
         return element;
         }
 
     public static WebElement tab_AddressValidation(WebDriver driver){
    	 element = driver.findElement(By.xpath("//a[contains(.,'Address Validation')]"));
         return element;
         }
	}