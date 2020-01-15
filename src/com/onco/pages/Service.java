package com.onco.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.onco.testbase.BaseClass;
import org.apache.log4j.Logger;

/**
 * Locators and methods for Service page
 * We will call these locator and methods to create test cases webtests package
 * @author manjunathdj
 *
 */
public class Service extends BaseClass {

	
	private static final Logger logger = Logger.getLogger(Service.class);

	@FindBy(xpath="//div[@class='row']//div[1]//div[1]//div[2]")
	private WebElement appointment;
	
    @FindBy(xpath="//body//div[@class='bg-color-mob']//div//div[2]//div[1]//div[2]")
    private WebElement opinion;
    
    @FindBy(xpath="//div[@class='container']//div[3]//div[1]//div[2]")
    private WebElement labtest;
    
    @FindBy(xpath="//div[@class='row']//button[@class='close']")
    private WebElement initialAssessmentClose;
    
   
	public Service() {
		PageFactory.initElements(driver, this);
	}
    
    public void appointment()   {
 
			try {
				
        		try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
        		logger.info(appointment.isDisplayed());
        		appointment.click();
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
  
    }
     
   public void opinion() {
   
		try {
			   try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   logger.info(opinion.isDisplayed());
			   opinion.click();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }
      
   public void labtest() { 
	   
			try {
        		try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		logger.info(labtest.isDisplayed());
        		labtest.click();
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
        }
   }
   
}
  	   

     
    	
    	
  
    

    
   

  
