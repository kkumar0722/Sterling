package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Packages {

	private static WebElement element = null;
		 
    public static WebElement table_Packages(WebDriver driver){
    	element = driver.findElement(By.className("configsubcell_normal"));         
        return element;
        }
    
    public static WebElement tab_Promotions(WebDriver driver){
    	element = driver.findElement(By.xpath(".//*[@id='subtablink_450']"));         
        return element;
        }
    
    public static WebElement rdobtn_FrontierDigitalPhoneUnlimited(WebDriver driver){
    	element = driver.findElement(By.xpath(".//*[@id='subtab_24']/table/tbody/tr/td/a/table[2]/tbody/tr/td/a/table/tbody/tr/td/a/table[1]/tbody/tr[1]/td[3]/input"));         
         return element;
         }
 
     public static WebElement rdobtn_BundleTerm_2YearTermDP(WebDriver driver){
    	 element = driver.findElement(By.xpath(".//*[@id='subtab_24']/table/tbody/tr/td/a/table[3]/tbody/tr/td/a/table[1]/tbody/tr[1]/td[3]/input"));         
         return element;
         }
 
     public static WebElement tab_AccessLine(WebDriver driver){    	 
    	 element = driver.findElement(By.xpath(".//*[@id='controlsLayer']/form/table/tbody/tr[1]/td[15]/nobr/a"));
         return element;
         }
     
     public static WebElement rdobtn_AL_Primary_Local_Exchange_Carrier_Freeze(WebDriver driver){
     		element = driver.findElement(By.xpath(".//*[@id='subtab_6884']/table/tbody/tr/td/a/table[2]/tbody/tr/td/a/table[7]/tbody/tr/td/a/table/tbody/tr/td/a/table[1]/tbody/tr[3]/td[3]/input"));         
     		return element;
          	}
  
      public static WebElement tab_Internet(WebDriver driver){
     	 	element = driver.findElement(By.xpath(".//*[@id='controlsLayer']/form/table/tbody/tr[1]/td[23]/nobr/a"));         
     	 	return element;
          	}
  
      public static WebElement rdobtn_Int_Product_Simply_Broadband_FiOS_30M(WebDriver driver){
     	 	element = driver.findElement(By.xpath(".//*[@id='subtab_8657']/table/tbody/tr/td/a/table[1]/tbody/tr/td/a/table[2]/tbody/tr/td/a/table[1]/tbody/tr[11]/td[3]/input"));
     	 	return element;
          	}
      
      public static WebElement tab_Int_FrontierEmail(WebDriver driver){    	  
    	  element = driver.findElement(By.xpath(".//*[@id='subtablink_9051']"));
    	  return element;
      		}
      
      public static WebElement subtab_Int_Provisioning(WebDriver driver){
      		element = driver.findElement(By.xpath(".//*[@id='subtablink_9060']"));         
      		return element;
           	}
   
       public static WebElement txtbox_Int_Provisioning_SecurityAnswer(WebDriver driver){
      	 	element = driver.findElement(By.xpath(".//*[@id='uev9234']"));         
      	 	return element;
           	}
   
       public static WebElement btn_Int_Provisioning_Assign(WebDriver driver){
      	 	element = driver.findElement(By.xpath(".//*[@id='subtab_9060']/table/tbody/tr/td/a/table/tbody/tr/td/a/table[3]/tbody/tr/td/a/table[1]/tbody/tr/td/a/table[2]/tbody/tr/td/a/table[1]/tbody/tr/td[2]/a/img"));
      	 	return element;
           	}
       
       public static WebElement txt_UserName(WebDriver driver){
        	 element = driver.findElement(By.id("text1"));
             return element;
             }
       
       public static WebElement txt_Password(WebDriver driver){
      	 	element = driver.findElement(By.id("password1"));
      	 	return element;
           	}
       
       public static WebElement btn_Submit(WebDriver driver){
        	 element = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
             return element;
             }
       
       public static WebElement btn_Assign(WebDriver driver){
        	 element = driver.findElement(By.id("button1"));
             return element;
             }
       
       public static WebElement tab_Int_WirelessData(WebDriver driver){    	  
     	  element = driver.findElement(By.xpath(".//*[@id='subtablink_9294']"));
     	  return element;
       		}
       
       public static WebElement tab_FrontierSecure(WebDriver driver){
        	 element = driver.findElement(By.xpath(".//*[@id='controlsLayer']/form/table/tbody/tr[1]/td[31]/nobr/a"));         
             return element;
             }
       
       public static WebElement rdobtn_DeclineReasons_OtherProvider(WebDriver driver){
      	 	element = driver.findElement(By.xpath(".//*[@id='subtab_9375']/table/tbody/tr/td/a/table/tbody/tr/td/a/table[3]/tbody/tr/td/a/table[1]/tbody/tr[5]/td[3]/input"));         
      	 	return element;
           	}
       
       public static WebElement chkbox_NestProducts(WebDriver driver){
        	 element = driver.findElement(By.xpath(".//*[@id='subtab_9375']/table/tbody/tr/td/a/table/tbody/tr/td/a/table[4]/tbody/tr/td/a/table[1]/tbody/tr[2]/td[3]/input"));         
             return element;
             }
       
       public static WebElement btn_Add(WebDriver driver){
      	 	element = driver.findElement(By.xpath(".//*[@id='msgbtnLayer']/table/tbody/tr/td[2]/nobr/table/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/a"));         
      	 	return element;
           	}
       
       public static WebElement btn_CompleteOrder(WebDriver driver){
        	 element = driver.findElement(By.xpath(".//*[@id='pendingCompltOrdr']"));         
             return element;
             }
       
       public static WebElement btn_ReviewOrder(WebDriver driver){
      	 	element = driver.findElement(By.xpath(".//*[@id='reviewOrdrBtn']"));         
      	 	return element;
           	}
       
       public static WebElement btn_ConfirmOrder(WebDriver driver){
     	 	element = driver.findElement(By.xpath(".//*[@id='confirmOrdrBtn2']"));         
     	 	return element;
          	}
       
       public static WebElement text_TelephoneNum(WebDriver driver){
    	 	element = driver.findElement(By.xpath(".//*[@id='body']/div[3]/table[1]/tbody/tr[2]/td[2]"));         
    	 	return element;
         	}
       
       public static WebElement text_OrderNum(WebDriver driver){
    	 	element = driver.findElement(By.xpath(".//*[@id='body']/div[3]/table[1]/tbody/tr[2]/td[5]"));         
    	 	return element;
         	}
       
       public static WebElement text_Status(WebDriver driver){
   	 	element = driver.findElement(By.xpath(".//*[@id='body']/div[3]/table[1]/tbody/tr[2]/td[6]"));         
   	 	return element;
        	}
       
       public static WebElement text_OderSuccess(WebDriver driver){
    	 	element = driver.findElement(By.xpath(".//*[@id='body']/div[3]/table[3]/tbody/tr/td/div/ul/li[1]"));         
    	 	return element;
         	}
	}