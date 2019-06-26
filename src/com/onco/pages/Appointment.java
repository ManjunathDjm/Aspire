package com.onco.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.onco.testbase.BaseClass;

public class Appointment extends BaseClass {


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
	
    public String verifyHomeTitle() {
		
		return driver.getTitle();
		
	}
	
    public void appointment() throws InterruptedException  {
    	
    	if(bookappointment.isDisplayed()) {
    		bookappointment.click();
    		Thread.sleep(3000);
    	   System.out.print("Book appointment is present");
    	} else {
    	   System.out.print("Book appointment is not present");
    	}
    	
    	if(cal.isDisplayed()) {	
    		driver.switchTo().defaultContent();
    		cal.click();
    		Thread.sleep(3000);
    	   System.out.print("calendar day is displayed");
    	} else {
    	   System.out.print("calendar day is not displayed");
    	}
    	if(calendar_time.isDisplayed()) {
    	   calendar_time.click();
    	   Thread.sleep(3000);
    	   System.out.println("calendar day is displayed");	
    }
  }
    
    public void exploremore() throws InterruptedException {
    	
    	if(calendar.isDisplayed()) {
    		calendar.click();
    	   System.out.println("explore options link is present");
    	} else {
    	   System.out.print("explore options link is not present");
    	   Thread.sleep(3000);
    	}
    	
    	
    }
    }

  
