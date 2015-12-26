package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private static WebElement element = null;
	 
    public static WebElement txtbx_UserName(WebDriver driver){
         element = driver.findElement(By.id("login"));
         return element;
         }
 
     public static WebElement txtbx_Password(WebDriver driver){
         element = driver.findElement(By.id("passwd"));
         return element;
         }
 
     public static WebElement btn_LogIn(WebDriver driver){
         element = driver.findElement(By.id("loginButton"));
         return element;
         }
}