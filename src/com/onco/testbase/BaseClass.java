package com.onco.testbase;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;

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
                options.addArguments("--headless");
                options.addArguments("--enable-javascript");
            	options.addArguments("--window-size=1024,768,24");
            	options.addArguments("start-maximized"); 
            	options.addArguments("enable-automation"); 
            	options.addArguments("--no-sandbox"); 
            	options.addArguments("--disable-infobars");
            	options.addArguments("--disable-dev-shm-usage");
            	options.addArguments("--disable-browser-side-navigation"); 
            	options.addArguments("--disable-gpu"); 
            	driver = new ChromeDriver(options);
            	driver.manage().window().maximize();
            	driver.navigate().to(url);
            	
            	driver.manage().deleteAllCookies();
            	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        		
        		
            	

            }
            
        }
	       @AfterMethod
	       public static void tearDown(ITestResult result) throws IOException {    
	       driver.quit();
			
	   
	      
	   }
	
	       
	       
}


          

        
              



