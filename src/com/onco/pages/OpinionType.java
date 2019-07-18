package com.onco.pages;


import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onco.testbase.BaseClass;

/**
 * Locators and methods for opinion page
 * @author manjunathdj
 *
 */
public class OpinionType extends BaseClass {

    
    private static final Logger logger = Logger.getLogger(OpinionType.class);
    
    @FindBy(xpath = "/html/body/app-root/select-opinion-type/div[2]/div[2]/section/div[3]/div[1]/section/div/div/div[1]/div/div[2]/div/div[2]")
    WebElement selectIndianPanelButton;
    
    @FindBy(xpath="//div[@class='col-md-4 col-lg-4 col-xl-4 flex-justify-center']//div//div[@class='orange-rounded-inner-btn'][contains(text(),'SELECT US PANEL')]")
    WebElement selectUsPanelButton;
 
	public void Opiniontype() {
		PageFactory.initElements(driver, this);
	}
    
    public void indianPanelButton() {
  
         
		   if (logger.isDebugEnabled()) {
			logger.debug("entering appointment()");
		}
		try {
			
		     selectIndianPanelButton.click();
	    		 
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting appointment()");		
    }
    
  }
    
  
		          
		             
}
			 
		
			
			
		
    	
    	
       
          
     
 
    
 
    	
    
    
    
    
    

    


  
