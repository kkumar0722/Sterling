package commonLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

//Data Driven
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.*;
import org.apache.xerces.dom.DOMConfigurationImpl;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Log4j
import org.apache.log4j.LogManager;
import org.apache.log4j.Appender;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.*;
import org.apache.log4j.config.*;
import org.apache.log4j.*;
import org.apache.log4j.xml.DOMConfigurator;


@SuppressWarnings("unused")
public class POC {
	
	/*private HSSFSheet SXSSFSheet;

	public void dataDrivenThruXL() throws IOException  {
	
		FileInputStream fi = new FileInputStream("C:\\Selenium\\Data Sheets\\test-data.xlsx");
		//Workbook wb = Workbook.getWorkbook(fi);
		HSSFWorkbook workbook  = new HSSFWorkbook(new POIFSFileSystem(fi));
		SXSSFSheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = SXSSFSheet.iterator();
		//Workbook xlWb;
        /*XSSFSheet xlSh;
        XSSFCell xlCell = null;
        XSSFRow xlRow;
        }*/
	
	static final Logger logger = LogManager.getLogger(POC.class.getName());
	
	public static void CalculatorLog4j(WebDriver driver) throws IOException  {
		
		DOMConfigurator.configure("log4j.xml");
		logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
		logger.info("Test Has Started");		
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.calculator.net/");
		logger.info("Open Calc Application");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a")).click();
		logger.info("Clicked Percent Calculator Link");
		driver.findElement(By.id("cpar1")).sendKeys("10");
		logger.info("Entered Value into First Text Box");
		driver.findElement(By.id("cpar2")).sendKeys("50");
		logger.info("Entered Value into Second Text Box");
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[2]/input")).click();
		logger.info("Click Calculate Button");
		String result = driver.findElement(By.xpath(".//*[@id='content']/p[2]/span/font/b")).getText();
		logger.info("Get Text Value");
		logger.info(" The Result is " + result);
		if(result.equals("5"))
		{
			logger.info("The Result is Pass");
		}
		else
		{
			logger.error("TEST FAILED. NEEDS INVESTIGATION");
		}
		logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
		driver.close();
		
	}
	@Test
	public static void Calculator(WebDriver driver) throws IOException  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.calculator.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a")).click();
		driver.findElement(By.id("cpar1")).sendKeys("10");
		driver.findElement(By.id("cpar2")).sendKeys("50");
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[2]/input")).click();
		String result = driver.findElement(By.xpath(".//*[@id='content']/p[2]/span/font/b")).getText();
		if(result.equals("5"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
	
	}
	
}	






















