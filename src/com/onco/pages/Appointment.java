package com.onco.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.onco.testbase.BaseClass;

public class Appointment extends BaseClass{


	
	@FindBy(xpath = "/html/body/app-root/book-appointment/section/div/div[2]/div[1]/div[1]/div/div[3]/div/div[2]/div/div[2]/button")
	WebElement bookappointment;
	
	@FindBy(xpath="/html/body/app-root/book-appointment/section/div/div[2]/div[1]/div[7]/button")
	WebElement exploremorebutton;
	
	@FindBy(xpath="/html/body/app-root/book-appointment/section/div/div[2]/div[1]/div[8]/div/div")
	WebElement backbutton;
	
	@FindBy(xpath="/html/body/app-root/book-appointment/div[4]/div/div/div/div/div[2]/div[1]/button")
	WebElement calendarday;
	
	@FindBy(xpath="/html/body/app-root/book-appointment/div[4]/div/div/div/div/div[2]/div[1]/div/div[2]/button")
	WebElement calendartime;
	
    
    
	public Appointment() {
		PageFactory.initElements(driver, this);
	}
	
    public String verifyHomeTitle() {
		
		return driver.getTitle();
		
	}
	
    public void SignupPage(String name,String email, String phone) throws InterruptedException  {
    	
    	bookappointment.click();
    	calendarday.click();
    	calendartime.click();	
    	
    }
    
    public void exploremore() throws InterruptedException {
    	
    	exploremorebutton.click();
    	Thread.sleep(3000);
    	
    	
    }
    
    public void backbutton() throws InterruptedException {
    	
    	backbutton.click();
    	Thread.sleep(3000);
    }
    }

  
