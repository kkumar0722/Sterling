package commonLibrary;

import java.util.NoSuchElementException;

import org.openqa.selenium.*;


public class WebObjUtilities {

	public static boolean isElementPresent(WebElement Object) {				
		
		try{			
			WebElement iprocess = Object;
			boolean Bool= iprocess.isDisplayed();
			return Bool;
		}
		catch (NoSuchElementException e){			
			return false;
		}
		
	}
		public static boolean objExist(WebElement Object, boolean blncondition) throws InterruptedException {	
			
			boolean blnTrue;
			boolean blnFalse;
			
			if (blncondition = true){
				blnTrue = true;
				blnFalse = false;
			}else {
				blnTrue = false;
				blnFalse = true;
			}
			
			int x = 0;
			boolean blnObjFound = blnTrue;
			do {				
				if (isElementPresent(Object)==blnTrue) {					
					blnObjFound = blnTrue;
				}
				else {
					blnObjFound = blnFalse;					
					break;
				}
				x++;				
				Thread.sleep(1000);
			}while (x==180 || blnObjFound == blnTrue);
			return blnObjFound;
		}
}









/*
 * String ObjValue = "";
		String ObjType = "xpath";
				
				switch(ObjType){
					case "id":
						System.out.println("Case is Id");
						break;
					case "xpath":
						element = driver.findElement(By.xpath(ObjValue));
						System.out.println("Case is xpath");
						return element;
						break;		
				}
*/				
