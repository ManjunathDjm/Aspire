package com.onco.pages;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
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
public class Homepage {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(Homepage.class);
			      
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[2]/input[1]")
	@CacheLookup
	WebElement nameField;
	
    @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[4]/input[1]")
    @CacheLookup
    WebElement emailField;
    
    @FindBy(name = "/html/body/app-root/home/div[1]/div/div[2]/div[2]/start-case-form/form/div[7]/select")
    @CacheLookup
    WebElement countryCode;
    
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[8]/input[1]")
    @CacheLookup
    WebElement phoneFiled;
    
    @FindBy(xpath ="/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[10]/div[1]/button[1]/span[1]")
    @CacheLookup
    WebElement patientChoice;
    
    @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[10]/div[1]/ul[1]/li[1]/a[1]")
    @CacheLookup
    WebElement dropOption1;
    
    @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[13]/input[1]")
    @CacheLookup
    WebElement selectTerms;
    
    @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[15]/button[1]")
    @CacheLookup
    WebElement submit;
	
 public Homepage(WebDriver rdriver) {
	    ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
    
 public void formfill (String patientname, String email,String phone) {
    	
		try {
		
			    nameField.sendKeys(patientname);
			    logger.info("Name field entered");
			    
				emailField.sendKeys(email);	
				logger.info("Email field entered");
			
				phoneFiled.sendKeys(phone);
				logger.info("Phone field entered");
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}

		} 	
  
 public void patientquery() {

	    try {
	    	 
	   
	    	 patientChoice.click();
	    	 logger.info("Patient choice clicked");
	    	 
		     dropOption1.click();
		     logger.info("Dropodown choice clicked");
		     
		     selectTerms.click();
		     logger.info("T&C clicked");
		     
	     } catch (NoSuchElementException e) {
		    e.printStackTrace();
	}

 }
 public void submit() {
	
	    try {
	    	 
	    	 submit.click();
	    	 logger.info("submit button clicked");
	     } catch (NoSuchElementException e) {
	    	e.printStackTrace(); 
	}
 }

}
       
    	
    	    


    



    	
    
    

    
 

  
