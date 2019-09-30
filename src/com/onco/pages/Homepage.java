package com.onco.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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

	@FindBy(xpath="/html/body/app-root/home/div[1]/div/div[2]/div[2]/start-case-form/form/div[2]/input")
	WebElement nameField;
	
    @FindBy(xpath="/html/body/app-root/home/div[1]/div/div[2]/div[2]/start-case-form/form/div[4]/input")
    WebElement emailField;
    
    @FindBy(name = "/html/body/app-root/home/div[1]/div/div[2]/div[2]/start-case-form/form/div[7]/select")
    WebElement countryCode;
    
    @FindBy(name = "contact")
    WebElement phone;
    
    @FindBy(xpath ="/html/body/app-root/home/div[1]/div/div[2]/div[2]/start-case-form/form/div[10]")
    WebElement patientChoice;
    
    @FindBy(xpath="/html/body/app-root/home/div[1]/div/div[2]/div[2]/start-case-form/form/div[10]/div/ul/li[1]/a")
    WebElement dropOption1;
    
    @FindBy(name="tAndC")
    WebElement selectTerms;
    
    @FindBy(xpath="/html/body/app-root/home/div[1]/div/div[2]/div[2]/start-case-form/form/div[15]/button")
    WebElement submit;
	
 public Homepage() {
		PageFactory.initElements(driver, this);
	}
    
    public void formfill(String name, String email,String contact) {
    	
    	if (logger.isDebugEnabled()) {
			logger.debug("entering formfill(String,String,String)");
			logger.debug("name: \"" + name + "\"");
			logger.debug("email: \"" + email + "\"");
			logger.debug("contact: \"" + contact + "\"");
		}
		try {
				nameField.sendKeys(name);
				emailField.sendKeys(email);	
				phone.sendKeys(contact);
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
		   dropOption1.click();
		   selectTerms.click();
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
	     } catch (NoSuchElementException e) {
	    	e.printStackTrace(); 
	}
	    if (logger.isDebugEnabled()) {
		logger.debug("exiting Submit()");
	} 
 }

}
       
    	
    	    


    



    	
    
    

    
 

  
