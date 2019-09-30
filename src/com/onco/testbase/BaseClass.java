package com.onco.testbase;

import java.awt.Dimension;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.aeonbits.owner.Config;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.maven.plugin.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;



import bsh.This;
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
            	//options.addArguments("window-size=1280,800");
            	options.addArguments("--no-sandbox");
            	options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
            	options.addArguments("--disable-dev-shm-usage");
            	options.addArguments("--disable-setuid-sandbox");
            	options.setExperimentalOption("useAutomationExtension", false);
            	driver = new ChromeDriver(options);
            	driver.get(url);
            	driver.manage().deleteAllCookies();
            	Dimension d= new Dimension(1920,1200);
            	driver.manage().window().getSize();
                driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);   
        		
      }
                 
        } catch (WebDriverException e) {
            System.out.println(e.getMessage());
        }
	
    }
	
	   @AfterMethod
	   public static void quit(ITestResult result) throws IOException {    
			driver.quit();
			
	
	      
	   }
	      
}


          

        
              



