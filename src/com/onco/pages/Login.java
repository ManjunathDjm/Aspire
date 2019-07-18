
package com.onco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.onco.testbase.BaseClass;
import org.apache.log4j.Logger;

/**
 * Locators and methods for Login page
 * @author manjunathdj
 *
 */
public class Login extends BaseClass {

	
	private static final Logger logger = Logger.getLogger(Login.class);

	@FindBy(name="countryCode")
	WebElement countryCode;
	
    @FindBy(name="contact")
    WebElement phoneNumber;
    
    @FindBy(xpath="/html/body/app-root/login/div/div[2]/div[1]/div/form/div[2]/div[3]/button")
    WebElement loginVIAOTPbutton;
    
    @FindBy(xpath="/html/body/app-root/app-confirm-otp/div/div[2]/div/div/form/div[1]/otpinput/input[1]")
    WebElement otp;
    
    @FindBy(xpath="/html/body/app-root/app-confirm-otp/div/div[2]/div/div/form/div[3]/button")
    WebElement proceedButton;
    
     
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
    
    public void login(String phone) {
    	
    	  if (logger.isDebugEnabled()) {
			logger.debug("entering login(String)");
			logger.debug("phone: \"" + phone + "\"");
		}
		Select countrycode = new Select(driver.findElement(By.name("countryCode")));
    	  countrycode.selectByIndex(0);
    	  countryCode.click();
    	  phoneNumber.sendKeys(phone); 
          loginVIAOTPbutton.click();
		if (logger.isDebugEnabled()) {
			logger.debug("exiting login()");
		}
    
    	
    }
     	
    public void OtpDetails(String Otp) {
    	
    		if (logger.isDebugEnabled()) {
			logger.debug("entering otpDetails(String)");
			logger.debug("Otp: \"" + Otp + "\"");
		}
			otp.click();  
    		otp.sendKeys(Otp);
    		proceedButton.click();
			if (logger.isDebugEnabled()) {
				logger.debug("exiting otpDetails()");
			}	
    	}
    }
    

  
