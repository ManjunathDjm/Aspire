package com.onco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Locators and methods for appointment page We will call these locator and
 * methods to create test cases in webtests packege
 *
 * @author manjunathdj
 *
 */

public class FreeOpinion {

	WebDriver ldriver;

	private static final Logger logger = Logger.getLogger(FreeOpinion.class);

	@FindBy(xpath = "//html//body//app-root//initial-assessment//div//div//div//div//span[contains(text(),'Download Free Opinion')]")
	WebElement downloadfreeopinion;
	
	@FindBy(xpath = "//span[contains(text(),'CONTINUE')]")
	WebElement continuebutton;


	public FreeOpinion(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	public void downloadopinionlink() {

		try {
			
			downloadfreeopinion.click();
			logger.info("calendar date clicked");

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	public void continuebutton() {
		
		try {
			continuebutton.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}