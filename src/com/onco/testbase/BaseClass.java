package com.onco.testbase;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * Methods to launch browsers and take screenshots on test case fail
 * Base class will be used for all the test to launch browsers
 * @author manjunathdj
 *
 */
public class BaseClass {
	  
	public static WebDriver driver;

	
	  @Parameters({"browser","url"})
	  @BeforeMethod
	  public void openBrowser(String browser, String url) throws Exception {
       
		BasicConfigurator.configure(); 
 
		try {
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
            	//driver.manage().deleteAllCookies();
                driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
            	

            }
                 
        } catch (WebDriverException e) {
            
        }
	  }
	       @AfterMethod
	       public static void quit(ITestResult result) throws IOException {    
	       driver.quit();
			
	   
	      
	   }
	
	       
	       
}


          

        
              



