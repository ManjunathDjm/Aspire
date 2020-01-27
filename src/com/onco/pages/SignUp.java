package com.onco.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
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

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(SignUp.class);

	
	@FindBy(xpath = "//li[@class='ng-tns-c1-0 ng-star-inserted']//a[1]")
	@CacheLookup
	WebElement signUpIcon;
	
	@FindBy(xpath="/html/body/app-root/login/div/div[2]/div[2]/a")
	@CacheLookup
	WebElement signUplink;
	
	@FindBy(xpath = "/html/body/app-root/app-register/div[2]/div[2]/div[1]/div/form/div[1]/input")
	@CacheLookup
	WebElement yourName;
	
	@FindBy(xpath="/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[2]/input")
	@CacheLookup
	WebElement yourEmail;
	
	@FindBy(xpath="/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[3]/div[1]/select")
	@CacheLookup
	WebElement countryCode;

    @FindBy(xpath="/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[3]/div[2]/input")
    @CacheLookup
    WebElement phoneNumber;
    
    @FindBy(name="patientQueryId")
    @CacheLookup
    WebElement patientQuery;
    
    @FindBy(xpath="/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[5]/button")
    @CacheLookup
    WebElement startNowButton;
    
    
public SignUp(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
    	}
	
      public String verifyHomeTitle() {
		
    	  return driver.getTitle();
		}	
      
      
public void signupicon() {
	
		try {
	    	
			logger.info(signUpIcon.isDisplayed());
			signUpIcon.click();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
}
	

public void signuppage(String name,String email, String phone) {
    	
		try {
         
			  logger.info(signUplink.isDisplayed());
			  signUplink.click();
			  
			  logger.info(yourName.isDisplayed());
              yourName.sendKeys(name);
              
              logger.info(yourEmail.isDisplayed());
              yourEmail.sendKeys(email);
              
              logger.info(phoneNumber.isDisplayed());
              phoneNumber.sendKeys(phone);
              
		   } catch (NoSuchElementException e) {
			  e.printStackTrace();
		   }
   }
		  	      
public void countryCode()  {
  
		try {
			
             logger.info(countryCode.isDisplayed());
        	 Select countrycode = new Select(driver.findElement(By.xpath("/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[3]/div[1]/select")));
             countrycode.selectByIndex(0);
             countryCode.click();
             //Assert.assertEquals(true, yourEmail.isDisplayed());
             countrycode.getOptions();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
      
   }
     	
public void patientQuery()  {
    	
		try {
             
			 logger.info(patientQuery.isDisplayed());
			 Select patientquery = new Select(driver.findElement(By.name("patientQueryId")));
             patientquery.selectByIndex(1); 
             patientQuery.click();
             
             logger.info(startNowButton.isDisplayed());
             startNowButton.click();
         
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		
     }
}




    	
 
 

 

 
    



  
