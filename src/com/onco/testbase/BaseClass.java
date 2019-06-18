package com.onco.testbase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import com.onco.util.PropertiesData;
import com.onco.util.TestUtil;

public class BaseClass {
	
    
	public static final String USERNAME = "manjunathdj1";
    public static final String AUTOMATE_KEY = "PkujzMABisfx9BvMUtF5";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  
	  
	public static WebDriver driver;
	Properties prop=new Properties();
    @Parameters({"browser"})
    @BeforeMethod
    public void openBrowser(String browser) throws Exception {
       
		try {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "/Users/manjunathdj/Applications/OncoWeb/exe/chromedriver");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
        
                driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        		
            } else if (browser.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.chrome.driver", "/Users/manjunathdj/Applications/");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
              
 
                
                         
      }
            
        } catch (WebDriverException e) {
            System.out.println(e.getMessage());
        }
     	driver.get(PropertiesData.getObject("URL"));
     	driver.manage().deleteAllCookies();
    }
   
	   @AfterMethod
       public void teardown() {
       driver.quit();
		
		}
          
}
        
              



