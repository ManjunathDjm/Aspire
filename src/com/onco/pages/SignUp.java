package com.onco.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.onco.testbase.BaseClass;
import org.apache.log4j.Logger;

public class SignUp extends BaseClass{

	
	private static final Logger logger = Logger.getLogger(SignUp.class);

	@FindBy(xpath = "/html/body/app-root/home/header-component/header[1]/div/div[2]/div/ul/li[6]/a/img")
	WebElement signUpIcon;
	
	@FindBy(xpath="/html/body/app-root/login/div/div[2]/div[2]/a")
	WebElement signUplink;
	
	@FindBy(xpath = "/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[1]/input")
	WebElement yourName;
	
	@FindBy(xpath="/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[2]/input")
	WebElement yourEmail;
	
	@FindBy(xpath="/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[3]/div[1]/select")
	WebElement countryCode;

    @FindBy(xpath="/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[3]/div[2]/input")
    WebElement phoneNumber;
    
    @FindBy(name="patientQueryId")
    WebElement patientQuery;
    
    @FindBy(xpath="/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[5]/button")
    WebElement startNowButton;
    
    
public SignUp() {
		
	PageFactory.initElements(driver, this);
    	}
	
      public String verifyHomeTitle() {
		
		if (logger.isDebugEnabled()) {
			logger.debug("entering verifyHomeTitle()");
			logger.debug("exiting verifyHomeTitle()");
		}
		return driver.getTitle();
		
	 }
	
public void SignupPage(String name,String email, String phone)    {
    	
          
          if (logger.isDebugEnabled()) {
		logger.debug("entering SignupPage(String,String,String)");
		logger.debug("name: \"" + name + "\"");
		logger.debug("email: \"" + email + "\"");
		logger.debug("phone: \"" + phone + "\"");
	}
		try {
        	  signUpIcon.click();
              signUplink.click();		
              yourName.sendKeys(name);
              yourEmail.sendKeys(email);
              phoneNumber.sendKeys(phone);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting SignupPage()");
		}
          
   
   }
		  	      
public void CountryCode()  {
      
         if (logger.isDebugEnabled()) {
		logger.debug("entering CountryCode()");
	}
		try {
        	 Select countrycode = new Select(driver.findElement(By.xpath("/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[3]/div[1]/select")));
             countrycode.selectByIndex(0);
             countryCode.click();
             countrycode.getOptions();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting CountryCode()");
		} 
      
   }
     	
public void PatientQuery()  {
    	
         if (logger.isDebugEnabled()) {
		logger.debug("entering PatientQuery()");
	}
		try {
             
        	 Select patientquery = new Select(driver.findElement(By.name("patientQueryId")));
             patientquery.selectByIndex(1); 
             patientQuery.click();
             startNowButton.click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting PatientQuery()");
		}
      
      }

}




    	
 
 

 

 
    



  
