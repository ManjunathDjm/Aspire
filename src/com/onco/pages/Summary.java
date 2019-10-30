package com.onco.pages;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.onco.testbase.BaseClass;
import org.apache.log4j.Logger;
/**
 * Locators and methods for Summary page
 * We will call these locator and methods to create test cases webtests package
 * @author manjunathdj
 *
 */
public class Summary extends BaseClass {

	
	private static final Logger logger = Logger.getLogger(Summary.class);

	@FindBy(xpath="/html/body/app-root/case-summary/div[2]/div/section/div[2]/div[1]/payment-summary/div[1]/div/div[1]/div/div[1]/input")
	WebElement couponCode;
	
    @FindBy(xpath="/html/body/app-root/case-summary/div[2]/div/section/div[2]/div[1]/payment-summary/div[1]/div/div[4]/label/span")
    WebElement checkbox;
    
    @FindBy(xpath="/html[1]/body[1]/app-root[1]/case-summary[1]/div[1]/div[2]/div[1]/section[1]/div[2]/div[1]/payment-summary[1]/div[1]/div[1]/div[4]/button[1]")
    WebElement payNow;
    
    
	public Summary() {
		PageFactory.initElements(driver, this);
	}
    
    public void summary() {
    	
    		
    	if (logger.isDebugEnabled()) {
			logger.debug("entering Summary()");
		}
			try {
				
				//WebDriverWait wait = new WebDriverWait(driver, 20000);
				//wait.until(ExpectedConditions.elementToBeClickable(payNow));
				payNow.click();
				Assert.assertEquals(true, payNow.isDisplayed());
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		if (logger.isDebugEnabled()) {
				logger.debug("exiting Summary()");
			}
  
    	}
    
    }
    

    
    

  
