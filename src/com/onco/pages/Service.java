package com.onco.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onco.testbase.BaseClass;
import org.apache.log4j.Logger;

/**
 * Locators and methods for Service page
 * We will call these locator and methods to create test cases webtests package
 * @author manjunathdj
 *
 */
public class Service {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(Service.class);

	@FindBy(xpath="//div[@class='row']//div[1]//div[1]//div[2]")
	@CacheLookup
	WebElement appointment;
	
    @FindBy(xpath="//body//div[@class='bg-color-mob']//div//div[2]//div[1]//div[2]")
    @CacheLookup
    WebElement opinion;
    
    @FindBy(xpath="//div[@class='container']//div[3]//div[1]//div[2]")
    @CacheLookup
    WebElement labtest;
    
    @FindBy(xpath="//div[@class='row']//button[@class='close']")
    @CacheLookup
    WebElement initialAssessmentClose;
    
   
	public Service(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
    
    public void appointment()   {
 
			try {
				
        		try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
        		appointment.click();
        		logger.info("Appointment clicked");
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
  
    }
     
   public void opinion() {
   
		try {
			   try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			   opinion.click();
			   logger.info("Opinion clicked");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
      
   public void labtest() { 
	   
			try {
        		try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		labtest.click();
        		logger.info("labtest clicked");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
        }
   }
   
}
  	   

     
    	
    	
  
    

    
   

  
