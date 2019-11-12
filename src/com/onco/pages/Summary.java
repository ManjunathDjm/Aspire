package com.onco.pages;


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
 * Locators and methods for Summary page
 * We will call these locator and methods to create test cases webtests package
 * @author manjunathdj
 *
 */
public class Summary extends BaseClass {

	
	private static final Logger logger = Logger.getLogger(Summary.class);

	@FindBy(xpath="/html/body/app-root/case-summary/div[2]/div/section/div[2]/div[1]/payment-summary/div[1]/div/div[1]/div/div[1]/input")
	WebElement couponCode;
	
	@FindBy(xpath="//i[@class='fa fa-times']")
	WebElement deletecoupon;
	
	@FindBy(xpath="//input[@placeholder='Enter coupon code']")
	WebElement couponcodefield;
	
    @FindBy(xpath="/html/body/app-root/case-summary/div[2]/div/section/div[2]/div[1]/payment-summary/div[1]/div/div[4]/label/span")
    WebElement checkbox;
    
    @FindBy(xpath="//button[@class='coupon-btn']")
    WebElement couponapply;;
    
  
    
    @FindBy(xpath="//button[@class='case-data-btn continue-btn col-md-12 continue-btn-active']")
    WebElement payathospital;
    
    @FindBy(xpath="//button[@class='case-data-btn continue-btn pay-now-btn continue-btn-active']")
    WebElement paynow;
    
    //@FindBy(xpath="/html/body/app-root/case-summary/div/div[2]/div/section/div[2]/div[1]/payment-summary/div[1]/div/div[1]/div/div/div[2]/i")
    //WebElement deletecoupon;
    
	public Summary() {
		PageFactory.initElements(driver, this);
	}
    
	
	public void deletecouponcode() {
    	
		
    	if (logger.isDebugEnabled()) {
			logger.debug("couponcode Summary()");
		}
			try {
				   
				   deletecoupon.click();
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
	}
	
	public void applycoupon(String UScoupon) {
				  
		try {
				   couponcodefield.sendKeys(UScoupon);
				   couponapply.click();
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		if (logger.isDebugEnabled()) {
				logger.debug("couponcode Summary()");
			}
  
	}
	
	public void summary() {
    	
    		
    	if (logger.isDebugEnabled()) {
			logger.debug("entering Summary()");
		}
			try {
				if(payathospital.isEnabled())
				{
				    try {
						Thread.sleep(20000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					payathospital.click();
				}
				else { 
					
					paynow.click();
				}
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
		if (logger.isDebugEnabled()) {
				logger.debug("exiting Summary()");
			}
  
    	}
    
    }
    

    
    

  
