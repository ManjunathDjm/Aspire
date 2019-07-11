package com.onco.mobileweb;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;


public class mobile {

	private static final Logger logger = Logger.getLogger(mobile.class);
	public static final String USERNAME = "manjunathdj1";
	public static final String AUTOMATE_KEY = "PkujzMABisfx9BvMUtF5";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	@Test
	public static void test() throws Exception {
 
    	if (logger.isDebugEnabled()) {
			logger.debug("entering test()");
		}
		DesiredCapabilities caps = new DesiredCapabilities();
    	caps.setCapability("browserName", "iPhone");
    	caps.setCapability("device", "iPhone 8 Plus");
    	caps.setCapability("realMobile", "true");
    	caps.setCapability("os_version", "11");
    	caps.setCapability("name", "Bstack-[Java] Sample Test");
    	WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
    	driver.get("http://18.136.208.196/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@class='mobile-header-link-chat ng-tns-c2-0 ng-star-inserted ng-lazyloaded']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'SIGN IN HERE')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Sign up he")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[1]/input")).sendKeys("test_manjunath");
	    driver.findElement(By.xpath("/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[2]/input")).sendKeys("manjunath.11j@gmail.com");
	    driver.findElement(By.xpath("/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[3]/div[1]/select")).click();
	    driver.findElement(By.xpath("/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[3]/div[2]/input")).sendKeys("9036890379");
	    Select query = new Select(driver.findElement(By.name("patientQueryId")));
		query.selectByIndex(1);
	    driver.findElement(By.xpath("/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[5]/button")).click();
		if (logger.isDebugEnabled()) {
			logger.debug("exiting test()");
		}
	   
	    
			
		
	}
			
		
		
}
