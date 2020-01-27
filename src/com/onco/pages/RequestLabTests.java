package com.onco.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
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

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(RequestLabTests.class);

	@FindBy(xpath="//div[@class='col-md-6 col-lg-6 col-xl-6']//input[@placeholder='Select Location']")
	@CacheLookup
	WebElement location;
	
	@FindBy(xpath="//div[@class='custom-select right']//select[@placeholder='Select test type']")
	@CacheLookup
	WebElement testtype;
	
	@FindBy(xpath="//div[@class='orange-rounded-inner-btn small']")
	@CacheLookup
	WebElement continueButton;
	
	@FindBy(xpath="/html/body/app-root/req-lab-test/div[2]/div[2]/section/div[3]/div[1]/section/div/div/div[2]/div[2]/div")
	@CacheLookup
	WebElement requestCallback;
	
	@FindBy(xpath="//button[@class='callback-request-modal-close']")
	@CacheLookup
	WebElement Requestcallclose;
	

	public RequestLabTests(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
    
    public void location() {
  
		try {    
			
			try {
			
				Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	        	 logger.info(location.isDisplayed());
			     location.click(); 
	    		 location.sendKeys("Mumbai",Keys.TAB);
	    		 
			} catch (NoSuchElementException e) {
				e.printStackTrace();
       }
     }
		
    public void labtest() {
    
		try {
	    	 logger.info(testtype.isDisplayed());
			 Select test = new Select(driver.findElement(By.xpath("//div[@class='custom-select right']//select[@placeholder='Select test type']")));
	    	 testtype.click();
	    	 test.selectByIndex(1);
	    	 testtype.click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
   }
		
   public void continueButton() {
	
	try {
		   logger.info(continueButton.isDisplayed());
		   continueButton.click();
		   
	} catch (NoSuchElementException e) {
		e.printStackTrace();
	}
   }   

   public void requestCallback() {
	
    	requestCallback.click();
	   
   }
   
}
    

    
