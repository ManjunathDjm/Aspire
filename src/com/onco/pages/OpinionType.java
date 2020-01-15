package com.onco.pages;


import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.onco.testbase.BaseClass;

/**
 * Locators and methods for opinion page
 * We will call these locator and methods to create test cases in webtests package
 * @author manjunathdj
 *
 */
public class OpinionType extends BaseClass {

    
    private static final Logger logger = Logger.getLogger(OpinionType.class);
    
    @FindBy(xpath = "/html/body/app-root/select-opinion-type/div/div[2]/div[2]/section/div[3]/div[1]/section/div/div/div[1]/div/div[2]/div/div[2]")
    private WebElement indianPanelButton;
    
    @FindBy(xpath="/html/body/app-root/select-opinion-type/div/div[2]/div[2]/section/div[3]/div[1]/section/div/div/div[2]/div/div[2]/div/div[2]")
    private WebElement selectUsPanelButton;
        
    public OpinionType() {
		PageFactory.initElements(driver, this);
	}
    
    public void indianPanelButton() {

		try {
              logger.info(indianPanelButton.isDisplayed());
			  indianPanelButton.click();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		}
	
}
 
    public void USPanalButton() {
    	
		try {
			
			 logger.info(selectUsPanelButton.isDisplayed());
			 selectUsPanelButton.click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
    }
}
  
		          
		             

			 
		
			
			
		
    	
    	
       
          
     
 
    
 
    	
    
    
    
    
    

    


  
