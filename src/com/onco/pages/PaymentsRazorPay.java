package com.onco.pages;


import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.onco.testbase.BaseClass;

/**
 * Locators and methods for Payments page
 * We will call these locator and methods to create test cases webtests package
 * @author manjunathdj
 *
 */
public class PaymentsRazorPay extends BaseClass {

	WebDriver ldriver;
    private static final Logger logger = Logger.getLogger(PaymentsRazorPay.class);
    
    @FindBy(xpath = "//*[@id=\"payment-options\"]/div[2]/label")
    @CacheLookup
    WebElement netBanking;
    
    @FindBy(xpath ="//*[@id=\"modal-close\"]")
    @CacheLookup
    WebElement close;
    
    @FindBy(xpath="//*[@id=\"form-netbanking\"]/div[2]")
    @CacheLookup
    WebElement selectBank;
    
    @FindBy(xpath="//button[@class='success']")
    @CacheLookup
    WebElement successButton;
    
    @FindBy(xpath="//*[@id=\"netb-banks\"]/div[1]/label")
    @CacheLookup
    WebElement sbiNetbanking;
    
    @FindBy(id="footer")
    private WebElement payNow;
    
 
	public PaymentsRazorPay(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
    
    public void netbanking() throws InterruptedException {
  
		try {
			
			driver.switchTo().frame(driver.findElement(By.className("razorpay-checkout-frame")));
			logger.info(netBanking.isDisplayed());
		    netBanking.click();
		    
		    logger.info(sbiNetbanking.isDisplayed());
		    sbiNetbanking.click();
		    
		    logger.info(payNow.isDisplayed());
		    payNow.click(); 
		    //Switch to child window and click on success button 
		    Set <String> windowhandles=driver.getWindowHandles();
		    for(String windowHandle:windowhandles){
		    	driver.getWindowHandle();
				driver.switchTo().window(windowHandle);
    }
            logger.info(successButton.isDisplayed());
		    successButton.click();
		     
			} catch (NoSuchElementException e) {
				e.printStackTrace();
	
			}
     }
 
    }

			 
		
			
			
		
    	
    	
       
          
     
 
    
 
    	
    
    
    
    
    

    


  
