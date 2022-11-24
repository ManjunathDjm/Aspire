package com.aakash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.aakash.utils.PropertiesData;

import org.apache.log4j.Logger;

/**
 * Locators and methods for TP student login page.We will call these locator and
 * methods to create test cases in webtests packege
 *
 * @author manjunathdj
 *
 */

public class StudentLogin {

	WebDriver ldriver;

	private static final Logger logger = Logger.getLogger(StudentLogin.class);

	@FindBy(id = "edit-user-rollnumber")
	WebElement Rollnumber;

	@FindBy(id = "edit-user-dob")
	WebElement Dateofbirth;

	@FindBy(xpath = "//option[@value='5']")
	WebElement Selectmonth;

	@FindBy(xpath = "//option[@value='1990']")
	WebElement Selectyear;

	@FindBy(xpath = "//a[normalize-space()='11']")
	WebElement Selectday;

	@FindBy(id = "edit-submit")
	WebElement Signinbutton;

	@FindBy(partialLinkText = "Forgot password")
	WebElement forgotpassword;

	public StudentLogin(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	public void rollnumber(String rollnumber) throws Exception {

		Rollnumber.isDisplayed();
		Rollnumber.click();
		Reporter.log("Clicked roll number");
		Rollnumber.sendKeys(PropertiesData.getObject("rollnumber"));
		Reporter.log("Entered roll number");

	}

	public void Dateofbirth() throws Exception {

		Dateofbirth.isDisplayed();
		Dateofbirth.click();
		Reporter.log("Clicked on Date of birth dropdown");
		Selectmonth.isDisplayed();
		Selectmonth.click();
		Reporter.log("Selected date of birth month");
		Selectyear.isDisplayed();
		Selectyear.click();
		Reporter.log("Selected date of birth year");
		Selectday.isDisplayed();
		Selectday.click();
		Reporter.log("Selected date of birth day");
		Signinbutton.isDisplayed();
		Signinbutton.click();
		Reporter.log("Clicked on signin button");

	}

	public void forgotpassword() throws Exception {

		forgotpassword.click();
		Reporter.log("Clicked on forgot password");
	}
}
