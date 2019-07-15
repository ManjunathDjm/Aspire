package com.onco.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.onco.testbase.BaseClass;
import org.apache.log4j.Logger;

/**
 * Locators and methods for Service page
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
    
    public void Appointment()   {
    
        	
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
        		String data =driver.findElement(By.xpath("/html/body/app-root/select-service/div[2]/div[2]/section/div[3]/section/div/div/div[1]")).getText();
        		System.out.println("Result:" + data);
        		appointment.click();
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (logger.isDebugEnabled()) {
				logger.debug("exiting appointment()");
			}
    	  
    }
     
   public void Opinion() {
           
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
      
   public void Labtest() { 
	   
        
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
  	   

     
    	
    	
  
    

    
   

  
