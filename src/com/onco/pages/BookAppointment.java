package com.onco.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.onco.testbase.BaseClass;

public class BookAppointment extends BaseClass {

	
	@FindBy(xpath="/html/body/app-root/book-appointment/section/div/div[2]/div[1]/div[1]/div/div[3]/div/div[2]/div/div[2]/button")
	WebElement bookappointemnt;
	
    @FindBy(xpath="/html/body/app-root/book-appointment/section/div/div[2]/div[1]/div[7]/button")
    WebElement exploremoredoctors;
    
    @FindBy(xpath="/html/body/app-root/book-appointment/section/div/div[2]/div[1]/div[8]/div/div/span/img")
    WebElement backbutton;
   
	
	public BookAppointment() {
		PageFactory.initElements(driver, this);
	}
    
    public void Login(String Phone, String otp) throws InterruptedException  {
    	
    	Select countrycode = new Select(driver.findElement(By.name("countryCode")));
    	countrycode.selectByIndex(0);
    	bookappointemnt.click();
    	exploremoredoctors.click();
    	backbutton.click();
    	Thread.sleep(3000);
    
    }
    

    
    }

  
