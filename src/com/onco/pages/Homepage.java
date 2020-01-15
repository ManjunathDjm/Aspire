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
			      
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[2]/input[1]")
	private WebElement nameField;
	
    @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[4]/input[1]")
    private WebElement emailField;
    
    @FindBy(name = "/html/body/app-root/home/div[1]/div/div[2]/div[2]/start-case-form/form/div[7]/select")
    private WebElement countryCode;
    
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[8]/input[1]")
    private WebElement phoneFiled;
    
    @FindBy(xpath ="/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[10]/div[1]/button[1]/span[1]")
    private WebElement patientChoice;
    
    @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[10]/div[1]/ul[1]/li[1]/a[1]")
    private WebElement dropOption1;
    
    @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[13]/input[1]")
    private WebElement selectTerms;
    
    @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[15]/button[1]")
    private WebElement submit;
	
 public Homepage() {
		PageFactory.initElements(driver, this);
	}
    
    public void formfill (String patientname, String email,String phone) {
    	
		try {
			    logger.info(nameField.isDisplayed());
			    nameField.sendKeys(patientname);
			    
			    logger.info(emailField.isDisplayed());
				emailField.sendKeys(email);	
				
				logger.info(phoneFiled.isDisplayed());
				phoneFiled.sendKeys(phone);
				
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}

		} 	
  
 public void patientquery() {

	    try {
	    	 
	    	 logger.info(patientChoice.isDisplayed());
	    	 patientChoice.click();
	    	 
	    	 logger.info(dropOption1.isDisplayed());
		     dropOption1.click();
		     
		     logger.info(selectTerms.isSelected());
		     selectTerms.click();
	     } catch (NoSuchElementException e) {
		    e.printStackTrace();
	}

 }
 public void submit() {
	
	    try {
	    	 logger.info(submit.isDisplayed());
	    	 submit.click();
	     } catch (NoSuchElementException e) {
	    	e.printStackTrace(); 
	}
 }

}
       
    	
    	    


    



    	
    
    

    
 

  
