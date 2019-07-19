package com.onco.pages;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onco.testbase.BaseClass;
import org.apache.log4j.Logger;

/**
 * Locators and methods for appointment page
 * We will call these locator and methods to create test cases in webtests packege
 *
 * @author manjunathdj
 *
 */

public class Appointment extends BaseClass {
	


	private static final Logger logger = Logger.getLogger(Appointment.class);

	@FindBy(xpath = "/html/body/app-root/book-appointment/section/div/div[2]/div[1]/div[1]/div/div[3]/div/div[2]/div/div[2]/button")
	WebElement bookappointment;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/book-appointment[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
	WebElement cal;
	
	@FindBy(xpath="/html/body/app-root/book-appointment/section/div/div[2]/div[1]/div[8]/div/div")
	WebElement calendar_day;
	
	@FindBy(xpath="/html/body/app-root/book-appointment/div[4]/div/div/div/div/div[2]/div[1]/button")
	WebElement calendar;
	
	@FindBy(xpath="//button[contains(text(),'12:00 PM - 3:00 PM')]")
	WebElement calendar_time;
	
    
	public Appointment() {
		PageFactory.initElements(driver, this);
	}
	
    public void appointment() {
    	
    	    
    	 if (logger.isDebugEnabled()) {
			logger.debug("entering appointment()");
		}
		try {
    	    	
    	    	bookappointment.click();
        		driver.switchTo().defaultContent();
        		cal.click();
        	    calendar_time.click();
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting appointment()");
		}
    	  
    }
  
    public void exploreMore() {
    	
    		if (logger.isDebugEnabled()) {
			logger.debug("entering exploreMore()");
		}
			try {
    			calendar.click();
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (logger.isDebugEnabled()) {
				logger.debug("exiting exploreMore()");
			}
    	
    	}
    }   	    

  
