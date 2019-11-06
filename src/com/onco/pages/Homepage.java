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
import org.apache.log4j.Logger;

/**
 * Locators and methods for Homepage page
 * We will call these locator and methods to create test cases in webtests packege
 * @author manjunathdj
 *
 */
public class Homepage extends BaseClass {

	
	private static final Logger logger = Logger.getLogger(Homepage.class);
			      
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[2]/input[1]")
	WebElement nameField;
	
    @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[4]/input[1]")
    WebElement emailField;
    
    @FindBy(name = "/html/body/app-root/home/div[1]/div/div[2]/div[2]/start-case-form/form/div[7]/select")
    WebElement countryCode;
    
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[8]/input[1]")
    WebElement phoneFiled;
    
    @FindBy(xpath ="/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[10]/div[1]/button[1]/span[1]")
    WebElement patientChoice;
    
    @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[10]/div[1]/ul[1]/li[1]/a[1]")
    WebElement dropOption1;
    
    @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[13]/input[1]")
    WebElement selectTerms;
    
    @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[15]/button[1]")
    WebElement submit;
	
 public Homepage() {
		PageFactory.initElements(driver, this);
	}
    
    public void formfill (String name, String email,String phone) {
    	
    	if (logger.isDebugEnabled()) {
			logger.debug("entering formfill(String,String,String)");
			logger.debug("name: \"" + name + "\"");
			logger.debug("email: \"" + email + "\"");
			logger.debug("contact: \"" + phone + "\"");
		}
		try {
			    nameField.sendKeys(name);
			    Assert.assertEquals(true, nameField.isDisplayed());
				emailField.sendKeys(email);	
				Assert.assertEquals(true, emailField.isDisplayed());
				phoneFiled.sendKeys(phone);
				Assert.assertEquals(true, phoneFiled.isDisplayed());
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting formfill()");
		}
		} 	
  
 public void patientquery() {
      
	    if (logger.isDebugEnabled()) {
		   logger.debug("entering patientq()");
	    }
	    try {
	    	 patientChoice.click();
	    	 Assert.assertEquals(true, patientChoice.isDisplayed());
		     dropOption1.click();
		     selectTerms.click();
		     Assert.assertEquals(true, selectTerms.isDisplayed());
	     } catch (NoSuchElementException e) {
		    e.printStackTrace();
	}
	if (logger.isDebugEnabled()) {
		logger.debug("exiting patientq()");
	}
 }
 public void submit() {
	  
	   if (logger.isDebugEnabled()) {
		logger.debug("entering Submit()");
	  }
	    try {
	    	submit.click();
            Assert.assertEquals(true, submit.isDisplayed());
	     } catch (NoSuchElementException e) {
	    	e.printStackTrace(); 
	}
	    if (logger.isDebugEnabled()) {
		logger.debug("exiting Submit()");
	} 
 }

}
       
    	
    	    


    



    	
    
    

    
 

  
