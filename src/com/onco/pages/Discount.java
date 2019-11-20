package com.onco.pages;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.onco.testbase.BaseClass;
import org.apache.log4j.Logger;

/**
 * Locators and methods for Homepage page
 * We will call these locator and methods to create test cases in webtests packege
 * @author manjunathdj
 *
 */
public class Discount extends BaseClass {

	
	private static final Logger logger = Logger.getLogger(Discount.class);
			      
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-cashback[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]")
	WebElement claimdiscountbutton;
	
	@FindBy(name="hospitalName")
	WebElement hospitalname;
	
	@FindBy(name="city")
	WebElement cityname;
	
  
 public Discount() {
		PageFactory.initElements(driver, this);
	}
    
    public void claimdiscountbutton () {
 
		try {
			   claimdiscountbutton.click();
			} catch (NoSuchElementException e) {
				e.printStackTrace();
	
		} 	
    }
    public void userdetailsform(String hospitalName, String cityName) {
    	
    	  hospitalname.sendKeys(hospitalName);
    	  cityname.sendKeys(cityName);
    	  
    	
    }
    
    
    }