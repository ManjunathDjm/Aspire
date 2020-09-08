package com.onco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.math3.analysis.function.Exp;
import org.apache.log4j.Logger;

/**
 * Locators and methods for Homepage page We will call these locator and methods
 * to create test cases in webtests packege
 * 
 * @author manjunathdj
 *
 */
public class Homepage {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(Homepage.class);
	
	@FindBy(xpath = "//button[contains(text(),'SCHEDULE A CALL')]")
	@CacheLookup
	WebElement scheduleacallbanner;
	
	@FindBy(name = "name")
	@CacheLookup
	WebElement patientname;
	
	@FindBy(name = "mail")
	@CacheLookup
	WebElement mail;
	
	@FindBy(name = "contact")
	@CacheLookup
	WebElement contact;
	
	@FindBy(id = "book-appt-landing-signup")
	@CacheLookup
	WebElement startnow;
	
	@FindBy(id = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/get-free-opinion-strip[1]/section[1]/div[1]/div[1]/div[2]/button[1]")
	@CacheLookup
	WebElement getnow;
		
	

	public Homepage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	public void formfill(String name, String email, String phone) {

		try {

			scheduleacallbanner.click();
			logger.info("Successfully clicked on banner");
			patientname.sendKeys(name);
			logger.info("Successfully entered name in to form");
			mail.sendKeys(email);
			logger.info("Successfully entered mail in to form");
			contact.sendKeys(phone);
			logger.info("Successfully entered phone in to form");
			startnow.click();
			logger.info("Successfully clicked on starnow button");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

   public void getfreeopinion() {
	   
	    getnow.click();
	    logger.info("Successfully clicked on getnow button");
	   
		Select TypeofCancer = new Select(ldriver.findElement(By.xpath("//div//div//div//div//div[1]//div[2]//ng-select[1]//div[1]//div[1]//div[2]")));
		TypeofCancer.selectByIndex(1);
		logger.info("Successfully selected type of cancer");
	   
	   
   }
   
}