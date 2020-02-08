package com.onco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

import org.apache.log4j.Logger;

/**
 * Locators and methods for patient info page
 * We will call these locator and methods to create test cases webtests package
 * @author manjunathdj
 *
 */
public class PatientInfo {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(PatientInfo.class);

	@FindBy(name="patientName")
	@CacheLookup
	private WebElement patientname;
	
	@FindBy(name ="cancerType")
	@CacheLookup
	private WebElement typeofCancer;
	
	@FindBy(name ="cancerStage")
	@CacheLookup
	private WebElement cancerStage;
	
	@FindBy(xpath="/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[2]/input")
	@CacheLookup
	private WebElement email;
	
	@FindBy(xpath="/html/body/app-root/patient-info/div/div[2]/div[2]/div/div[1]/div/div[3]/div[4]/div[2]/select")
	@CacheLookup
	private WebElement generalCondition;
	
    @FindBy(xpath="/html/body/app-root/patient-info/div[2]/div[2]/div/div[1]/div/div[3]/div[6]/div/div/div/div/div[2]/div")
    @CacheLookup
    private WebElement fileupload;
    
    @FindBy(xpath="//html/body/app-root/patient-info/div/div[2]/div[2]/div/div[1]/div/div[3]/div[7]")
    @CacheLookup
    private WebElement continueButton;
    
    
    
public PatientInfo(WebDriver rdriver) {
	    ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
public void patientname(String pname) {
 
    	
    try{ 
		      for(int i=0; i<=2; i++) {
	             patientname.sendKeys(pname);
	             logger.info("Patientname Entered");
    			
    			  }
    }
	             catch(NoSuchElementException e){
    			}
    }

	
public void cancertype() {		
	            
	    		  
   try {  
	    		
	   
	     for(int i=0;i<=2; i++) {
	    	 
	            Select TypeofCancer = new Select(ldriver.findElement(By.name("cancerType")));
	  			TypeofCancer.selectByIndex(1);
	  			typeofCancer.click();
	  			logger.info("CancerStage Selected");
	  			
	  			Select Cancerstage = new Select(ldriver.findElement(By.name("cancerStage")));
	 		    Cancerstage.selectByIndex(1);
	 		    cancerStage.click();
	 		    logger.info("CancerStage Selected");
	 		    
	 		    Select Condition = new Select(ldriver.findElement(By.name("condition")));
				Condition.selectByIndex(1);
			    generalCondition.click();
			    logger.info("GeneralCondition Selected");
			      
			    continueButton.click();
			    logger.info("ContinueButton Clicked");
	     }
	  			    
	           }
    			  catch(NoSuchElementException e){
    				  e.printStackTrace();
    			  }
  }
	  			    
}
	


	    		  
	    		  

