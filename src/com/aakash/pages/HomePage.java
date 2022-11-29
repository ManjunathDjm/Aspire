package com.aakash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.apache.log4j.Logger;

/**
 * Locators and methods for TP Home page We will call these locator and methods
 * to create test cases in webtests packege
 *
 * @author manjunathdj
 *
 */

public class HomePage {

	WebDriver ldriver;

	private static final Logger logger = Logger.getLogger(HomePage.class);

	@FindBy(linkText = "Login now")
	WebElement Loginnow;

	@FindBy(xpath = "//a[@id='user.logout']")
	WebElement Logout;

	@FindBy(partialLinkText = "My account")
	WebElement MyAccount;

	public HomePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	public void loginlink() throws Exception {

		Loginnow.click();
		Loginnow.isDisplayed();
		org.testng.Reporter.log("Clicked on login link");
	}

	public void Logout() throws Exception {

		Logout.click();
		org.testng.Reporter.log("Clicked on logout");

	}

	public void MyAccount() throws Exception {

		MyAccount.click();
		org.testng.Reporter.log("Clicked on My account");
	}
}
