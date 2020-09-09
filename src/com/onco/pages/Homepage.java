package com.onco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

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

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/get-free-opinion-strip[1]/section[1]/div[1]/div[1]/div[2]/button[1]")
	@CacheLookup
	WebElement getnow;

	@FindBy(className = "ng-arrow-wrapper")
	@CacheLookup
	WebElement cancertypedropdown;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/get-free-opinion-strip[1]/section[1]/div[1]/div[2]/div[3]/div[2]/div[2]/ng-select[1]/div[1]/span[1]")
	@CacheLookup
	WebElement cancerstagedropdoen;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/get-free-opinion-strip[1]/section[1]/div[1]/div[2]/div[3]/div[3]/div[2]/ng-select[1]/div[1]/span[1]")
	@CacheLookup
	WebElement generalconditiondropdown;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/get-free-opinion-strip[1]/section[1]/div[1]/div[2]/div[3]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")
	@CacheLookup
	WebElement bloodcancer;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/get-free-opinion-strip[1]/section[1]/div[1]/div[2]/div[3]/div[2]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")
	@CacheLookup
	WebElement cancerstage;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/get-free-opinion-strip[1]/section[1]/div[1]/div[2]/div[3]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")
	@CacheLookup
	WebElement generalcondition;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/get-free-opinion-strip[1]/section[1]/div[1]/div[2]/div[4]/div[1]/div[2]/div[1]/label[1]/span[2]")
	@CacheLookup
	WebElement treatmentrecived;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/get-free-opinion-strip[1]/section[1]/div[1]/div[2]/div[4]/div[2]/button[1]")
	@CacheLookup
	WebElement getfreeopinionbutton;

	public Homepage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	public void bannar() {

		try {

			scheduleacallbanner.click();
			logger.info("Successfully clicked on banner");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		}
	}

	public void formfill(String name, String email, String phone) {

		try {
          
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

	public void getfreeopinion() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(20000);
		getnow.click();

	}

	public void cancertype() throws InterruptedException {

		cancertypedropdown.click();
		logger.info("Successfully clicked on cancer type dropdown" );
		bloodcancer.click();
		logger.info("Successfully clicked on blood cancer" );
		Thread.sleep(20000);

	}

	public void cancerstage() {

		cancerstagedropdoen.click();
		logger.info("Successfully clicked on cancer stage dropdown" );
		cancerstage.click();
		logger.info("Successfully clicked on cancer stage" );

	}

	public void generalcondition() {
		generalconditiondropdown.click();
		logger.info("Successfully clicked on general condtion dropdown");
		generalcondition.click();
		logger.info("Successfully selected general condition");
		treatmentrecived.click();
		logger.info("Successfully clicked on treatment recived");
		getfreeopinionbutton.click();
		logger.info("Successfully clicked on get free opinion button"); 

	}
}
