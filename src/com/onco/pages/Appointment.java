package com.onco.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.onco.testbase.BaseClass;
import java.util.List;

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

	
	@FindBy(xpath = "//div[@class='col-md-8 col-xs-12 results-list']//div[1]//div[1]//div[3]//div[1]//div[2]//div[1]//div[2]//button[1]")
	WebElement bookappointment;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/book-appointment[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
	WebElement cal;
	
	@FindBy(xpath="/html/body/app-root/book-appointment/section/div/div[2]/div[1]/div[8]/div/div")
	WebElement calendarday;
	
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
				e.printStackTrace();

			}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting appointment()");
		}
    	  
    }
  
    public void calendar() {
    	
    	 driver.findElement(By.className("modal-content")).click();
    	 List<WebElement> allDates=driver.findElements(By.xpath("//div[@class='book-appt-datetime-modal modal fade in']//div[@class='container-fluid']"));
 		
 		for(WebElement ele:allDates)
 		{
 			
 			String date=ele.getText();
 			
 			if(date.equalsIgnoreCase("28"))
 			{
 				ele.click();
 				break;
 			}
 			
 		}
 		
 		
 	}
  
    		
    public void exploreMore() {
    	
    		if (logger.isDebugEnabled()) {
			logger.debug("entering exploreMore()");
		}
			try {
	
				calendar.click();
			} catch (NoSuchElementException e) {		
				e.printStackTrace();
			}
			if (logger.isDebugEnabled()) {
				logger.debug("exiting exploreMore()");
			}
    	
    	}
    }   	    

  
