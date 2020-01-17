
package com.onco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.onco.testbase.BaseClass;

import java.util.List;

import org.apache.log4j.Logger;

/**
 * Locators and methods for Login page
 * We will call these locator and methods to create test cases in webtests package
 * @author manjunathdj
 *
 */
public class Login extends BaseClass {

	
	private static final Logger logger = Logger.getLogger(Login.class);

	@FindBy(name="countryCode")
	private WebElement countryCode;
	
    @FindBy(name="contact")
    private WebElement phoneNumber;
    
    @FindBy(xpath="/html/body/app-root/login/div/div[2]/div[1]/div/form/div[2]/div[3]/button")
    private WebElement loginVIAOTPbutton;
    
    @FindBy(xpath="/html/body/app-root/app-confirm-otp/div/div[2]/div/div/form/div[1]/otpinput/input[1]")
    private WebElement otp;
    
    @FindBy(xpath="/html/body/app-root/app-confirm-otp/div/div[2]/div/div/form/div[3]/button")
    private WebElement proceedButton;
    
    @FindBy(xpath="//body/app-root/patient-dashboard-component[@class='ng-tns-c3-16 ng-star-inserted']/div[@class='dashboard-container']/div[@class='ng-tns-c3-16']/div[@class='col-md-3 hidden-sm hidden-xs dashboard-col-left onboarding-nav-container']/div/div[@class='col-md-12 dashboard-left-separator']/onboarding-nav[@class='ng-tns-c3-16']/div[@class='row']/div[@class='onboarding-nav-container']/div[@class='footer-links-ctn']/a[1]")
    private WebElement delete;
    
	public Login() {
		PageFactory.initElements(driver, this);
	}
    
    public void login(String phone) {
    	 
    	try {
    	   
    	  logger.info(countryCode.isDisplayed());
    	  Select countrycode = new Select(driver.findElement(By.name("countryCode")));
    	  countrycode.selectByIndex(0);
    	  countryCode.click();  
    	  
    	  logger.info(phoneNumber.isDisplayed());
    	  phoneNumber.sendKeys(phone); 
    	  
    	  logger.info(loginVIAOTPbutton.isDisplayed());
    	  loginVIAOTPbutton.click();
    	  
    	} catch (NoSuchElementException e) {
			// TODO: handle exception
    	}
    	
    }
     	
    public void otpDetails(String Otp) {
    	
			try {
			  
			  logger.info(otp.isDisplayed());
			  otp.click(); 
    		  otp.sendKeys(Otp);
    		  
    		  logger.info(proceedButton.isDisplayed());
    		  proceedButton.click();
    		  
			} catch (NoSuchElementException e) {
				// TODO: handle exception
			}
	
    	}
    
	}


    

  
