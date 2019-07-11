package com.onco.pages;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.onco.testbase.BaseClass;
import org.apache.log4j.Logger;

public class Service extends BaseClass {

	
	private static final Logger logger = Logger.getLogger(Service.class);

	@FindBy(xpath="//div[@class='row']//div[1]//div[1]//div[2]")
	WebElement appointment;
	
    @FindBy(xpath="/html/body/app-root/select-service/div[2]/div[2]/section/div[3]/section/div/div/div[2]/div/div[2]")
    WebElement opinion;
    
    @FindBy(xpath="/html/body/app-root/select-service/div[2]/div[2]/section/div[3]/section/div/div/div[3]/div/div[2]")
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		appointment.click();
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
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
  	   

     
    	
    	
  
    

    
   

  
