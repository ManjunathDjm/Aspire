package com.onco.pages;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.onco.testbase.BaseClass;
import org.apache.log4j.Logger;

public class Summary extends BaseClass {

	
	private static final Logger logger = Logger.getLogger(Summary.class);

	@FindBy(xpath="/html/body/app-root/case-summary/div[2]/div/section/div[2]/div[1]/payment-summary/div[1]/div/div[1]/div/div[1]/input")
	WebElement couponCode;
	
    @FindBy(xpath="/html/body/app-root/case-summary/div[2]/div/section/div[2]/div[1]/payment-summary/div[1]/div/div[4]/label/span")
    WebElement checkbox;
    
    @FindBy(xpath="/html/body/app-root/case-summary/div[2]/div/section/div[2]/div[1]/payment-summary/div[1]/div/div[5]/button")
    WebElement payNow;
    
    @FindBy(xpath="//div[@class='dashboard-container']//a[2]")
    WebElement delete;
    
	
	public Summary() {
		PageFactory.initElements(driver, this);
	}
    
    public void Summary()   {
    	
    		
    		if (logger.isDebugEnabled()) {
			logger.debug("entering Summary()");
		}
			try {
    			payNow.click();
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (logger.isDebugEnabled()) {
				logger.debug("exiting Summary()");
			}
  
    	}
    	
    	
    	
    
    }
    

    
    

  
