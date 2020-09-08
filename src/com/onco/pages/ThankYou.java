package com.onco.pages;

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
public class ThankYou {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(ThankYou.class);

	@FindBy(xpath = "//div[contains(text(),'GET NOW')]")
	@CacheLookup
	WebElement getnow;

	@FindBy(xpath = "//u[contains(text(),'Take me to Home Page')]")
	@CacheLookup
	WebElement takemetohomepage;

	public ThankYou(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void getnow() {

		try {
			getnow.click();
			logger.info("Succesfully clicked on get now button");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Takemetohomepage() {

		try {
			takemetohomepage.click();
			logger.info("Succesfully clicked on take me to home page link");
			Thread.sleep(20000);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}