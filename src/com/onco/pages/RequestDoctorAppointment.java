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
 * Locators and methods for Request doctor appointment page
 * We will call these locator and methods to create test cases webtests package
 * @author manjunathdj
 *
 */
public class RequestDoctorAppointment extends BaseClass {

	
	private static final Logger logger = Logger.getLogger(RequestDoctorAppointment.class);

	@FindBy(xpath="//div[@class='col-md-6 col-lg-6 col-xl-6']//input[@placeholder='Select Location']")
	WebElement location;
	
    @FindBy(xpath="//div[@class='col-md-6 col-lg-6 col-xl-6']//select[@placeholder='Select Specialisation']")
    WebElement specialisationDropdownSurgicalOncologist;
   
     
    @FindBy(xpath="//input[@placeholder='Any specific requirements']")
    WebElement specific_test;
    
    @FindBy(xpath="/html/body/app-root/req-doc-appointment/div/div[2]/div[2]/section/div[3]/div[1]/section/div/div[1]/div[3]/div")
    WebElement find_cancer_specialist;
    

	public RequestDoctorAppointment() {
		PageFactory.initElements(driver, this);
	}
    
    public void appointment()   {
         
		   if (logger.isDebugEnabled()) {
			logger.debug("entering appointment()");
		}
		try {
	        	 location.click(); 
	        	 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		 location.sendKeys("Bangalore",Keys.TAB);
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting appointment()");
		}
		  
    }
    
    public void surgicalOncologist() {
    	
    	
	     if (logger.isDebugEnabled()) {
			logger.debug("entering surgicalOncologist()");
		}
		try {
	    	 Select specialisation = new Select(driver.findElement(By.xpath("//div[@class='col-md-6 col-lg-6 col-xl-6']//select[@placeholder='Select Specialisation']")));
		     specialisationDropdownSurgicalOncologist.click();
		     specialisation.selectByIndex(1);
		     specialisationDropdownSurgicalOncologist.click();
		     
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting surgicalOncologist()");
		}
    }
		
    public void radiationOncologist() {

	     if (logger.isDebugEnabled()) {
			logger.debug("entering radiationOncologist()");
		}
		try {
	    	 Select specialisation = new Select(driver.findElement(By.xpath("//div[@class='col-md-6 col-lg-6 col-xl-6']//select[@placeholder='Select Specialisation']")));
		     specialisationDropdownSurgicalOncologist.click();
		     specialisation.selectByIndex(2);
		     specialisationDropdownSurgicalOncologist.click();
		    
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting radiationOncologist()");
		}
   }
    	
   public void button()  {
		   		   
	      if (logger.isDebugEnabled()) {
			logger.debug("entering Button()");
		}
		try {
	    	  find_cancer_specialist.click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting Button()");
		}   		   
       
      }          	             
   }
			 
		
			
			
		
    	
    	
       
          
     
 
    
 
    	
    
    
    
    
    

    


  
