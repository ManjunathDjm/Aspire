
package com.onco.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
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

public class Appointment {
	

	WebDriver ldriver;
	
	private static final Logger logger = Logger.getLogger(Appointment.class);

	
	@FindBy(xpath = "//div[@class='col-md-8 col-xs-12 results-list']//div[1]//div[1]//div[3]//div[1]//div[2]//div[1]//div[2]//button[1]")
	@CacheLookup
	WebElement bookappointment;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/book-appointment[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
	@CacheLookup
	WebElement cal;
	
	@FindBy(xpath="/html/body/app-root/book-appointment/section/div/div[2]/div[1]/div[8]/div/div")
	@CacheLookup
	WebElement calendarday;
	
	@FindBy(xpath="/html/body/app-root/book-appointment/div[4]/div/div/div/div/div[2]/div[1]/button")
	@CacheLookup
	WebElement calendar;
	
	@FindBy(xpath="//button[contains(text(),'12:00 PM - 3:00 PM')]")
	@CacheLookup
	WebElement calendar_time;
	
    
	public Appointment(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
    public void appointment() {
    	
   
		try {
   
			    bookappointment.click();
        		ldriver.switchTo().defaultContent();
        		cal.click();
        		calendar_time.click();

        	    
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
    	  
    }
  
    public void calendar() {
    	
    	 ldriver.findElement(By.className("modal-content")).click();
    	 List<WebElement> allDates=ldriver.findElements(By.xpath("//div[@class='book-appt-datetime-modal modal fade in']//div[@class='container-fluid']"));
 		
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
    	
			try {
	
				calendar.click();
			} catch (NoSuchElementException e) {		
				e.printStackTrace();
			}
	
    	
    	}
    }   	    

  
