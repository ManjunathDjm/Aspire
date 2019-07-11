package com.onco.pages;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.onco.testbase.BaseClass;

public class PaymentsRazorPay extends BaseClass {

    
    private static final Logger logger = Logger.getLogger(PaymentsRazorPay.class);
    
    @FindBy(xpath = "//*[@id=\"payment-options\"]/div[2]/label")
    WebElement netBanking;
    
    @FindBy(xpath ="//*[@id=\"modal-close\"]")
    WebElement close;
    
    @FindBy(xpath="//*[@id=\"form-netbanking\"]/div[2]")
    WebElement selectBank;
    
 
	public PaymentsRazorPay() {
		PageFactory.initElements(driver, this);
	}
    
    public void netbanking()   {
  
         
		   if (logger.isDebugEnabled()) {
			logger.debug("entering appointment()");
		}
		try {
			driver.switchTo().frame(driver.findElement(By.className("razorpay-checkout-frame")));
		    netBanking.click();
		    driver.findElement(By.xpath("//*[@id=\"netb-banks\"]/div[1]/label")).click();
		    driver.findElement(By.id("footer")).click(); 
		    driver.switchTo().defaultContent();
		    driver.findElement(By.xpath("//button[@class='success']")).click();
	    		 
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting appointment()");
		}
		  
    }
    
  
		          
		             
}
			 
		
			
			
		
    	
    	
       
          
     
 
    
 
    	
    
    
    
    
    

    


  
