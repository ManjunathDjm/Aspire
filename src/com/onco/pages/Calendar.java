package com.onco.pages;

import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Locators and methods for Dsahboard page We will call these locator and
 * methods to create test cases in webtests packege
 * 
 * @author manjunathdj
 *
 */
public class Calendar {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(Calendar.class);

	@FindBy(xpath = "//body//book-appt-datetime-modal//div//div//div//div//div[2]")
	WebElement date;

	@FindBy(xpath = "//body//book-appt-datetime-modal//div//div//div//div//div//div//div//div//div[1]")
	WebElement timeslot;
	
	@FindBy(xpath = "//body//call-datetime-modal//div//div//div//div//div[2]")
	WebElement dateforcallonco;
	
	@FindBy(xpath = "//body//div//div//div//div//div//div//div//div[1]")
	WebElement timeslotforcallonco;
	
	@FindBy(xpath = "//body//div//div//div//div//div//div//div//div//div//div[1]")
	WebElement subtimeslotforcallonco;
	

public Calendar(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void date() {

		try {
			date.click();
			logger.info("Successfully selected date");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void time() {

		try {
			
			timeslot.click();
			logger.info("Successfully selected timeslot");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void calloncotime() {
		
		dateforcallonco.click();
		logger.info("Successfully selected date for call onco");
		timeslotforcallonco.click();
		logger.info("Successfully selected timeslot");
		subtimeslotforcallonco.click();
		logger.info("Successfully selected subtime slot");
		
	}
}