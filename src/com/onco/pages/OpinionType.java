package com.onco.pages;


import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
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

	WebDriver ldriver;
    private static final Logger logger = Logger.getLogger(OpinionType.class);
    
    @FindBy(xpath = "/html/body/app-root/select-opinion-type/div/div[2]/div[2]/section/div[3]/div[1]/section/div/div/div[1]/div/div[2]/div/div[2]")
    @CacheLookup
    WebElement indianPanelButton;
    
    @FindBy(xpath="/html/body/app-root/select-opinion-type/div/div[2]/div[2]/section/div[3]/div[1]/section/div/div/div[2]/div/div[2]/div/div[2]")
    @CacheLookup
    WebElement selectUsPanelButton;
        
    public OpinionType(WebDriver rdriver) {
    	ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
    
    public void indianPanelButton() {

		try {
             
			  indianPanelButton.click();
			  logger.info("India Panal button clicked");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		}
	
}
 
    public void USPanalButton() {
    	
		try {
			
			
			 selectUsPanelButton.click();
			 logger.info("UD Panal button clicked");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
    }
}
  
		          
		             

			 
		
			
			
		
    	
    	
       
          
     
 
    
 
    	
    
    
    
    
    

    


  
