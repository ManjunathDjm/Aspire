package com.onco.testbase;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.mongodb.diagnostics.logging.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * Methods to launch browsers and take screenshots on test case fail
 * Base class will be used for all the test to launch browsers
 * @author manjunathdj
 *
 */
public class BaseClass {
	  
	 
	  public static WebDriver driver;
	  public static org.apache.log4j.Logger Logger;   
	
	  @Parameters({"browser","url"})
	  @BeforeMethod
	  public void openBrowser(String browser, String url) throws Exception {
       
		BasicConfigurator.configure(); 
 
            if (browser.equalsIgnoreCase("chrome")) {
            	
            	
            	WebDriverManager.chromedriver().setup();
            	ChromeOptions options = new ChromeOptions(); 
            	options.addArguments("--no-sandbox"); 
            	options.addArguments("--window-size=1920,1080");
            	options.addArguments("headless");
            	options.addArguments("--disable-gpu"); 
                options.addArguments("enable-javascript");
            	driver = new ChromeDriver(options);
            	driver.navigate().to(url);
            	driver.manage().window().maximize();
            	
            	//driver.manage().deleteAllCookies();
            	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        		
        		
            }    	

            }
            
	       @AfterMethod
	       public static void tearDown(ITestResult result) throws IOException {    
	       driver.quit();
			
	   
	      
	   }
	
	       
	       
}


          

        
              



