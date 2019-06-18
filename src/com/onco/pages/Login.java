
package com.onco.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.onco.testbase.BaseClass;

public class Login extends BaseClass {

	
	@FindBy(name="countryCode")
	WebElement countryCode;
	
    @FindBy(name="contact")
    WebElement PhoneNumber;
    
    @FindBy(xpath="/html/body/app-root/login/div/div[2]/div[1]/div/form/div[2]/div[3]/button")
    WebElement LoginVIAOTPbutton;
    
    @FindBy(xpath="/html/body/app-root/app-confirm-otp/div/div[2]/div/div/form/div[1]/otpinput/input[1]")
    WebElement OTP;
    
    @FindBy(xpath="/html/body/app-root/app-confirm-otp/div/div[2]/div/div/form/div[3]/button")
    WebElement LoginButton;
  
   
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
    
    public void login(String Phone) throws InterruptedException  {
    	
    	if(countryCode.isDisplayed()) {
    	  Select countrycode = new Select(driver.findElement(By.name("countryCode")));
    	  countrycode.selectByIndex(0);
    	  countryCode.click();
    	  System.out.print("Country code present");   	
    	}else {
    	  System.out.print("Country code not present");
    		
    	}
    	
    	if(PhoneNumber.isDisplayed()) {
    	  PhoneNumber.sendKeys(Phone);
    	  System.out.print("Phone Number present");
    	}else {
    	  System.out.print("Phone Num,ber not present");
    		
    	}
    	
        if(LoginVIAOTPbutton.isDisplayed()) {
          LoginVIAOTPbutton.click();
          System.out.print("LoginVIAotp button present");
        }else {
          System.out.print("LoginVIAotp button not present");
          Thread.sleep(3000);
        }
  
    	
    }
    
    	
    public void otpdetails(String otp) throws Exception {
    	
    	if(OTP.isDisplayed()) {
    		OTP.click();
    		System.out.print("OTP is present");
    	}else {
    		System.out.print("OTP is not present");
    	}
    	if(OTP.isDisplayed()) {
    		OTP.sendKeys(otp);
    		System.out.print("OTP is present");
    	}else {
    		System.out.print("OTP is not present");
    	}
    	if(LoginButton.isDisplayed()) {
    		LoginButton.click();
    		System.out.print("Loginbutton present");
    	}else {
    		System.out.print("Loginbutton not present");
    		Thread.sleep(3000);
    	}
    		
    
       }
    	
    }
    
    
    

  
