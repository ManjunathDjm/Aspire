package com.onco.testbase;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;
import com.onco.pages.Login;
import com.onco.pages.SignUp;
import com.onco.util.PropertiesData;


import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Methods to launch browsers and take screenshots on test case fail
 * Base class will be used for all the test to launch browsers
 * @author manjunathdj
 *
 */
public class BaseClass {
	  
	public static WebDriver driver;
	Properties prop=new Properties();
	
	@Parameters({"browser","url"})
	@BeforeMethod
	public void openBrowser(String browser, String url) throws Exception {
       
    	String log4jConfPath = "/Users/manjunathdj/Applications/OncoWeb/src/resources/log4j.properties";
    	PropertyConfigurator.configure(log4jConfPath);
 
   
		try {
            if (browser.equalsIgnoreCase("chrome")) {
            	
            	WebDriverManager.chromedriver().setup(); 
            	driver = new ChromeDriver();
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
	
	@BeforeClass
	@Parameters({"deleteURL","url","browser"})
	public void delete(String deleteURL,String url,String browser) throws Exception {
		
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
		
		SignUp sign=new SignUp();
		sign.signupicon();
			
		Login login= new Login();
		login.login(PropertiesData.getObject("phone"));
		Thread.sleep(3000);
		login.OtpDetails(PropertiesData.getObject("otp"));
		Thread.sleep(5000);
		driver.get(deleteURL);
		Thread.sleep(3000);
		driver.close();
		
		
	}
	
	   @AfterMethod
	   public static void quit(ITestResult result) throws IOException {    
			driver.quit();
	
	      
	   }
	      
}


          

        
              



