package com.onco.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.onco.testbase.BaseClass;


import org.apache.log4j.Logger;
/**
 * Locators and methods for signup page
 * We will call these locator and methods to create test cases webtests package
 * @author manjunathdj
 *
 */
public class SignUp extends BaseClass{

	
	private static final Logger logger = Logger.getLogger(SignUp.class);

	
	@FindBy(xpath = "//li[@class='ng-tns-c1-0 ng-star-inserted']//a[1]")
	WebElement signUpIcon;
	
	@FindBy(xpath="/html/body/app-root/login/div/div[2]/div[2]/a")
	WebElement signUplink;
	
	@FindBy(xpath = "/html/body/app-root/app-register/div[2]/div[2]/div[1]/div/form/div[1]/input")
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
      
      
public void signupicon() {
	
	    if (logger.isDebugEnabled()) {
		logger.debug("entering signupicon()");
	}
		try {
	    	 signUpIcon.click();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting signupicon()");
		}
	    
}
	

public void signuppage(String name,String email, String phone) {
    	
          
        if (logger.isDebugEnabled()) {
		logger.debug("entering SignupPage(String,String,String)");
		logger.debug("name: \"" + name + "\"");
		logger.debug("email: \"" + email + "\"");
		logger.debug("phone: \"" + phone + "\"");
	}
		try {
        
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
		  	      
public void countryCode()  {
      
         if (logger.isDebugEnabled()) {
		logger.debug("entering CountryCode()");
	}
		try {
        	 Select countrycode = new Select(driver.findElement(By.xpath("/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[3]/div[1]/select")));
             countrycode.selectByIndex(0);
             countryCode.click();
             //Assert.assertEquals(true, yourEmail.isDisplayed());
             countrycode.getOptions();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting CountryCode()");
		} 
      
   }
     	
public void patientQuery()  {
    	
         if (logger.isDebugEnabled()) {
		logger.debug("entering PatientQuery()");
	}
		try {
             
        	 Select patientquery = new Select(driver.findElement(By.name("patientQueryId")));
             patientquery.selectByIndex(1); 
             patientQuery.click();
             //Assert.assertEquals(true, patientQuery.isDisplayed());
             startNowButton.click();
             //Assert.assertEquals(true, startNowButton.isDisplayed());
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting PatientQuery()");
		}
     }
}




    	
 
 

 

 
    



  
