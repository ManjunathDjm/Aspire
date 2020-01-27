package com.onco.pages;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument;
import org.testng.Assert;

import com.onco.testbase.BaseClass;
import org.apache.log4j.Logger;

/**
 * Locators and methods for InitialAssessment Model 
 * We will call these locator and methods to create test cases in webtests package
 * @author manjunathdj
 *
 */
public class InitialAssessment extends BaseClass {

	WebDriver ldriver;
    private static final Logger logger = Logger.getLogger(InitialAssessment.class);

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/select-service[1]/initial-assessment-modal[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
	@CacheLookup
	private WebElement initiAlassessmentClose;
    
    @FindBy(partialLinkText = "VIEW ASSESSMENT")
    @CacheLookup
    private WebElement viewAssessment;
    
    @FindBy(xpath="//div[@class='orange-rounded-inner-btn float-right']")
    @CacheLookup
    private WebElement exploremoreoptions;
    
    @FindBy(xpath="//div[@class='download-assessment cursor-pointer']")
    @CacheLookup
    private WebElement downloadAssessment;
     
  public InitialAssessment(WebDriver rdriver) {
	    ldriver=rdriver;
		PageFactory.initElements(driver, this);
	
	}
       
   public void initialAssessmentClose() {

	try {
		   driver.switchTo().defaultContent();
		   logger.info(initiAlassessmentClose.isDisplayed());
		   initiAlassessmentClose.click();
		   
	} catch (NoSuchElementException e) {
		e.printStackTrace();
	}
	
  }
   
   public void ViewAssessment() {
	
		try {  
			   logger.info(viewAssessment.isDisplayed());
			   viewAssessment.click();
			   
			   logger.info(exploremoreoptions.isDisplayed());
			   exploremoreoptions.click();
			   
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
   }
	 
   public void downloadAssessment() {
	 
		try {
			   
			logger.info(downloadAssessment.isDisplayed());
			downloadAssessment.click();
			
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	  }
   }
   
 
	  
   
     
    	
    	

    

    
   

  
