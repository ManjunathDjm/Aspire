package com.onco.pages;


import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onco.testbase.BaseClass;

/**
 * Locators and methods for opinion page
 * We will call these locator and methods to create test cases in webtests package
 * @author manjunathdj
 *
 */
public class OpinionType extends BaseClass {

    
    private static final Logger logger = Logger.getLogger(OpinionType.class);
    
    @FindBy(xpath = "/html/body/app-root/select-opinion-type/div[2]/div[2]/section/div[3]/div[1]/section/div/div/div[1]/div/div[2]/div/div[2]")
    WebElement selectIndianPanelButton;
    
    @FindBy(xpath="/html[1]/body[1]/app-root[1]/select-opinion-type[1]/div[2]/div[2]/section[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]")
    WebElement selectUsPanelButton;
    
 
	public void Opiniontype() {
		if (logger.isDebugEnabled()) {
			logger.debug("entering Opiniontype()");
		}
		PageFactory.initElements(driver, this);
		if (logger.isDebugEnabled()) {
			logger.debug("exiting Opiniontype()");
		}
	}
    
    public void indianPanelButton() {
		
		if (logger.isDebugEnabled()) {
			logger.debug("entering indianPanelButton()");
		}
		try {
		     selectIndianPanelButton.click();	 
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting indianPanelButton()");
		}
			
    } 	
 
    public void USPanalButton() {
    	
    	
    	if (logger.isDebugEnabled()) {
			logger.debug("entering USPanal()");
		}
		try {
			selectUsPanelButton.click();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting USPanal()");
		}
    }
}
  
		          
		             

			 
		
			
			
		
    	
    	
       
          
     
 
    
 
    	
    
    
    
    
    

    


  
