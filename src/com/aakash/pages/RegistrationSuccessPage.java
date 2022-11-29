package com.aakash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.apache.log4j.Logger;

/**
 * Locators and methods for Registration Success We will call these locator and
 * methods to create test cases in webtests packege
 *
 * @author manjunathdj
 *
 */

public class RegistrationSuccessPage {

	WebDriver ldriver;

	private static final Logger logger = Logger.getLogger(RegistrationSuccessPage.class);

	@FindBy(tagName = "strong")
	WebElement RegisterNumberText;

	@FindBy(xpath = "/html/body/div[2]/div/div/section[1]/div[2]/div/div/div/article/section[2]/form/div[2]/div/div[2]/a")
	WebElement Begintest;

	public RegistrationSuccessPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	public void begintest() throws Exception {

		Begintest.click();
		Reporter.log("Clicked on begin test");

	}
}