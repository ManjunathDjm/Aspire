package com.onco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.onco.testbase.BaseClass;
import org.apache.log4j.Logger;

/**
 * Locators and methods for patient info page
 * We will call these locator and methods to create test cases webtests package
 * @author manjunathdj
 *
 */
public class PatientInfo extends BaseClass{


	
	private static final Logger logger = Logger.getLogger(PatientInfo.class);

	@FindBy(name = "patientName")
	WebElement patientName;
	
	@FindBy(xpath="/html/body/app-root/patient-info/div[2]/div[2]/div/div[1]/div/div[3]/div[2]/div[2]/select")
	WebElement typeofCancer;
	
	@FindBy(xpath = "/html/body/app-root/patient-info/div[2]/div[2]/div/div[1]/div/div[3]/div[3]/div[2]/select")
	WebElement cancerStage;
	
	@FindBy(xpath="/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[2]/input")
	WebElement email;
	
	@FindBy(xpath="/html/body/app-root/patient-info/div[2]/div[2]/div/div[1]/div/div[3]/div[4]/div[2]/select")
	WebElement generalCondition;

	
    @FindBy(xpath="/html/body/app-root/patient-info/div[2]/div[2]/div/div[1]/div/div[3]/div[6]/div/div/div/div/div[2]/div")
    WebElement fileupload;
    
    @FindBy(xpath="/html/body/app-root/patient-info/div[2]/div[2]/div/div[1]/div/div[3]/div[7]")
    WebElement continueButton;
    
    
    
	public PatientInfo() {
		PageFactory.initElements(driver, this);
	}
	
    public String verifyHomeTitle() {
		
		if (logger.isDebugEnabled()) {
			logger.debug("entering verifyHomeTitle()");
			logger.debug("exiting verifyHomeTitle()");
		}
		return driver.getTitle();
		
	}
	
    public void patientInfo(String patientname) {
    	
	        if (logger.isDebugEnabled()) {
			logger.debug("entering PatientInfo(String)");
			logger.debug("patientname: \"" + patientname + "\"");
		}
			try {
	        	patientName.sendKeys(patientname);
	    		
			    Select TypeofCancer = new Select(driver.findElement(By.name("cancerType")));
			    TypeofCancer.selectByIndex(1);
			    typeofCancer.click();
			
			    Select Cancerstage = new Select(driver.findElement(By.name("cancerStage")));
			    Cancerstage.selectByIndex(1);
			    cancerStage.click();
			
			    Select Condition = new Select(driver.findElement(By.name("condition")));
			    Condition.selectByIndex(2);
		        generalCondition.click();
		    
		        continueButton.click();
		        
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
			if (logger.isDebugEnabled()) {
				logger.debug("exiting PatientInfo()");
			}
        }
   }

   

    
  
   

  
