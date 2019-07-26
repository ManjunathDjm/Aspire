package com.onco.pages;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument;

import com.onco.testbase.BaseClass;
import org.apache.log4j.Logger;

/**
 * Locators and methods for InitialAssessment Model 
 * We will call these locator and methods to create test cases in webtests package
 * @author manjunathdj
 *
 */
public class InitialAssessment extends BaseClass {

    
    private static final Logger logger = Logger.getLogger(InitialAssessment.class);

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/select-service[1]/initial-assessment-modal[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
    WebElement initiAlassessmentClose;
    
    @FindBy(partialLinkText = "VIEW ASSESSME")
    WebElement viewAssessment;
    
    @FindBy(xpath="//div[@class='download-assessment cursor-pointer']")
    WebElement downloadAssessment;
     
  public InitialAssessment() {
		PageFactory.initElements(driver, this);
	
	}
       
   public void initialAssessmentClose() {
	   
	   if (logger.isDebugEnabled()) {
		logger.debug("entering initialAssessmentClose()");
	}
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	   driver.switchTo().defaultContent();
	   initiAlassessmentClose.click();
	if (logger.isDebugEnabled()) {
		logger.debug("exiting initialAssessmentClose()");
	}
  }
   
   public void ViewAssessment() {
	   
	    if (logger.isDebugEnabled()) {
		logger.debug("entering viewAssessment()");
	}
		try {
	        	viewAssessment.click();
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting viewAssessment()");
		}
   }
	 
   public void downloadAssessment() {
	   
	 
		if (logger.isDebugEnabled()) {
		logger.debug("entering downloadAssessment()");
	}
		try {
			   downloadAssessment.click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting downloadAssessment()");
		}
	  }
   }
   
 
	  
   
     
    	
    	

    

    
   

  
