package com.onco.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.onco.testbase.BaseClass;
import org.apache.log4j.Logger;

/**
 * Locators and methods for labtest page
 * We will call these locator and methods to create test cases webtests package
 * @author manjunathdj
 *
 */
public class RequestLabTests extends BaseClass {

	
	private static final Logger logger = Logger.getLogger(RequestLabTests.class);

	@FindBy(xpath="//div[@class='col-md-6 col-lg-6 col-xl-6']//input[@placeholder='Select Location']")
	WebElement location;
	
	@FindBy(xpath="//div[@class='custom-select right']//select[@placeholder='Select test type']")
    WebElement testtype;
	
	@FindBy(xpath="//div[@class='orange-rounded-inner-btn small']")
	WebElement continueButton;
	
	@FindBy(xpath="/html/body/app-root/req-lab-test/div[2]/div[2]/section/div[3]/div[1]/section/div/div/div[2]/div[2]/div")
	WebElement requestCallback;
	
	@FindBy(xpath="//button[@class='callback-request-modal-close']")
	WebElement Requestcallclose;
	

	public RequestLabTests() {
		PageFactory.initElements(driver, this);
	}
    
    public void location() {
  
    	 
		if (logger.isDebugEnabled()) {
			logger.debug("entering appointment()");
		}
		try {    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	        	 location.click(); 
	    		 location.sendKeys("Mumbai",Keys.TAB);
	    		 Assert.assertEquals(true, location.isDisplayed());
			} catch (NoSuchElementException e) {
				e.printStackTrace();
       }
		if (logger.isDebugEnabled()) {
			logger.debug("exiting appointment()");
		}	  
     }
		
    public void labtest() {
    	
    	
	     if (logger.isDebugEnabled()) {
			logger.debug("entering labtest()");
		}
		try {
	    	 Select test = new Select(driver.findElement(By.xpath("//div[@class='custom-select right']//select[@placeholder='Select test type']")));
	    	 testtype.click();
	    	 test.selectByIndex(1);
	    	 testtype.click();
	    	 Assert.assertEquals(true, testtype.isDisplayed());
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting labtest()");
		}
   }
		
   public void continueButton() {
	   
	   if (logger.isDebugEnabled()) {
		logger.debug("entering continueButton()");
	}
	try {
		   continueButton.click();
		   Assert.assertEquals(true, continueButton.isDisplayed());
	} catch (NoSuchElementException e) {
		e.printStackTrace();
	}
	if (logger.isDebugEnabled()) {
		logger.debug("exiting continueButton()");
	}
	   
   }
   public void requestCallback() {
	   
	  if (logger.isDebugEnabled()) {
		logger.debug("entering RequestCallback()");
	}
    	requestCallback.click();
    	Assert.assertEquals(true, requestCallback);
	    Requestcallclose.click();
	    Assert.assertEquals(true, Requestcallclose);
	if (logger.isDebugEnabled()) {
		logger.debug("exiting RequestCallback()");
	}
	   
   }
   
}
    

    
