package com.onco.testbase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;

import com.paulhammant.ngwebdriver.NgWebDriver;

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
            	options.addArguments("disable-gpu","ignore-certificate-errors");
            	//options.addArguments("headless");
            	options.addArguments("window-size=1200,600,24");
            	driver = new ChromeDriver(options);
            	//Dimension d = new Dimension(1382,744); 
            	//Resize the current window to the given dimension
            	//driver.manage().window().setSize(d); 
            	driver.get(url);
            	driver.manage().deleteAllCookies();
            	driver.manage().window().maximize();
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


          

        
              



