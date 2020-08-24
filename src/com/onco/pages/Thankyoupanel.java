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
public class Thankyoupanel {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(Thankyoupanel.class);

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/thank-you[1]/div[1]/div[3]/div[2]/div[1]/span[1]/u[1]")
	@CacheLookup
	WebElement takemetohomepage;

	public Thankyoupanel(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void takemetohomepage() {

		try {
			takemetohomepage.click();
			logger.info("Successfully clicked on Take me to home page link");
			Thread.sleep(20000);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}