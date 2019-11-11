package com.onco.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.onco.testbase.BaseClass;
import org.apache.log4j.Logger;

/**
 * Locators and methods for Service page
 * We will call these locator and methods to create test cases webtests package
 * @author manjunathdj
 *
 */
public class Service extends BaseClass {

	
	private static final Logger logger = Logger.getLogger(Service.class);

	@FindBy(xpath="//div[@class='row']//div[1]//div[1]//div[2]")
	WebElement appointment;
	
    @FindBy(xpath="//body//div[@class='bg-color-mob']//div//div[2]//div[1]//div[2]")
    WebElement opinion;
    
    @FindBy(xpath="//div[@class='container']//div[3]//div[1]//div[2]")
    WebElement labtest;
    
    @FindBy(xpath="//div[@class='row']//button[@class='close']")
    WebElement initialAssessmentClose;
    
   
	public Service() {
		PageFactory.initElements(driver, this);
	}
    
    public void appointment()   {
    
        	
        	if (logger.isDebugEnabled()) {
			logger.debug("entering appointment()");
		}
			try {
        		try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
        		appointment.click();
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
			if (logger.isDebugEnabled()) {
				logger.debug("exiting appointment()");
			}
    	  
    }
     
   public void opinion() {
           
           if (logger.isDebugEnabled()) {
		logger.debug("entering opinion()");
	}
		try {
			   try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   opinion.click();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting opinion()");
		}
   }
      
   public void labtest() { 
	   
        
        	if (logger.isDebugEnabled()) {
		logger.debug("entering labtest()");
	}
			try {
        		try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		labtest.click();
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (logger.isDebugEnabled()) {
				logger.debug("exiting labtest()");
			}
        }
   }
  	   

     
    	
    	
  
    

    
   

  
