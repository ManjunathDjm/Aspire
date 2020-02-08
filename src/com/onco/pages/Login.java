
package com.onco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import org.apache.log4j.Logger;

/**
 * Locators and methods for Login page
 * We will call these locator and methods to create test cases in webtests package
 * @author manjunathdj
 *
 */
public class Login  {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(Login.class);

	@FindBy(name="countryCode")
	WebElement countryCode;
	
    @FindBy(name="contact")
    @CacheLookup
    WebElement phoneNumber;
    
    @FindBy(xpath="/html/body/app-root/login/div/div[2]/div[1]/div/form/div[2]/div[3]/button")
    @CacheLookup
    WebElement loginVIAOTPbutton;
    
    @FindBy(xpath="//body//input[1]")
    @CacheLookup
    WebElement Otp;
    
    @FindBy(xpath="//*[@type='submit']")
    @CacheLookup
    WebElement proceedButton;
  
    @FindBy(xpath="//body/app-root/patient-dashboard-component[@class='ng-tns-c3-16 ng-star-inserted']/div[@class='dashboard-container']/div[@class='ng-tns-c3-16']/div[@class='col-md-3 hidden-sm hidden-xs dashboard-col-left onboarding-nav-container']/div/div[@class='col-md-12 dashboard-left-separator']/onboarding-nav[@class='ng-tns-c3-16']/div[@class='row']/div[@class='onboarding-nav-container']/div[@class='footer-links-ctn']/a[1]")
    @CacheLookup
    private WebElement delete;
    
public Login(WebDriver rdriver) {
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
	}
    
public void login(String phone) {
    	 	

		
	try {
		
		for(int i=0; i<=2; i++) {
		 
		try {
    	   
    	  Select countrycode = new Select(ldriver.findElement(By.name("countryCode")));
    	  countrycode.selectByIndex(0);
    	  countryCode.click();  
    	  logger.info("Country code selected");
  
    	  phoneNumber.sendKeys(phone); 
    	  logger.info("Phone number entered");
    	  loginVIAOTPbutton.click();
    	  logger.info("Login via OTP clicked");
    	  break;

    	  
    	} catch (NoSuchElementException e) {
    		e.printStackTrace();
    	}  	
}
	
} catch (Exception e) {
	// TODO: handle exception
}
}
     	
public void otpDetails(String otp) {
    	
   try {
	   
	for(int i=0;i<=1;i++) {
		
	try{
    			    
    	 Otp.click(); 	   
    	 logger.info("OTP clicked");
    	 Otp.sendKeys(otp); 
    	 logger.info("OTP clicked");
    	 proceedButton.click();
    	 logger.info("Proceed Button clicked");
    	 break;
    	 
         } catch(NoSuchElementException e){
        	 e.printStackTrace();
    		   
    		  }
    }
	 
} catch (Exception e) {
	// TODO: handle exception
}
   
}
}


    	
    	
    	
    	
    	
    	
    	
    	

    

  
