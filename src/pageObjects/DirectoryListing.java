package pageObjects;

import org.openqa.selenium.*;

public class DirectoryListing {
	
	private static WebElement element = null;
	 
    public static WebElement rdobtn_Published(WebDriver driver){      
    	 element = driver.findElement(By.xpath("//input[@value='LN']"));
         return element;
         }
    
    public static WebElement rdobtn_listingSelection(WebDriver driver){     
   	 	element = driver.findElement(By.xpath("//input[@value='1']"));
        return element;
        }
    
    public static WebElement btn_SaveDirectoryListing(WebDriver driver){     
      	 element = driver.findElement(By.xpath("//input[@onclick='saveDirListing()']"));
         return element;
         }
    
    public static WebElement btn_Next(WebDriver driver){
   	 	element = driver.findElement(By.id("Continue"));         
        return element;
        }
}
