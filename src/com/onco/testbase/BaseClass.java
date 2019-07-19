package com.onco.testbase;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
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
    @Parameters({"browser"})
    @BeforeMethod
    public void openBrowser(String browser) throws Exception {
       
    	String log4jConfPath = "/Users/manjunathdj/Applications/OncoWeb/src/resources/log4j.properties";
    	PropertyConfigurator.configure(log4jConfPath);
    	
		try {
            if (browser.equalsIgnoreCase("chrome")) {
            	
            	WebDriverManager.chromedriver().setup(); 
            	driver = new ChromeDriver();
                Thread.sleep(3000);
                driver.manage().window().maximize();
                driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);          
        		
            } else if (browser.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", PropertiesData.getObject("geckodriver"));
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
	    public static void takeScreenshotAtEndOfTest() throws IOException {

	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(scrFile, new File("/Users/manjunathdj/Applications/OncoWeb/screenshot/oncofail.png"));	
	        driver.quit();
		
		}
          
}
        
              



