package com.onco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.onco.testbase.BaseClass;

import org.apache.log4j.Logger;

/**
 * Locators and methods for signup page We will call these locator and methods
 * to create test cases webtests package
 * 
 * @author manjunathdj
 *
 */
public class SignUp {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(SignUp.class);

	@FindBy(xpath = "//li[@class='ng-tns-c1-0 ng-star-inserted']//a[1]")
	WebElement signUpIcon;

	@FindBy(xpath = "/html/body/app-root/login/div/div[2]/div[2]/a")
	WebElement signUplink;

	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement yourName;

	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement yourEmail;

	@FindBy(xpath = "//select[@name='countryCode']")
	WebElement countryCode;

	@FindBy(xpath = "//input[@placeholder='Phone No']")
	WebElement phoneNumber;

	@FindBy(name = "patientQueryId")
	WebElement patientQuery;

	@FindBy(xpath = "//body//form//button[1]")
	WebElement startNowButton;

	public SignUp(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public String verifyHomeTitle() {

		return ldriver.getTitle();
	}

	public void signupicon() {

		try {

			signUpIcon.click();
			logger.info("Signup icon clicked");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void signuppage(String name, String email, String phone) {

		try {

			signUplink.click();
			logger.info("signUP link clicked");

			yourName.sendKeys(name);
			logger.info("your name is entered ");

			logger.info(yourEmail.isDisplayed());
			yourEmail.sendKeys(email);
			logger.info("Email is entered ");

			phoneNumber.sendKeys(phone);
			logger.info("Phone number is entered");

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void countryCode() {

		try {

			Select countrycode = new Select(ldriver.findElement(
					By.xpath("/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[3]/div[1]/select")));
			countrycode.selectByIndex(0);
			countryCode.click();
			logger.info("Country code selected");

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}

	public void patientQuery() {

		try {

			Select patientquery = new Select(ldriver.findElement(By.name("patientQueryId")));
			patientquery.selectByIndex(1);
			patientQuery.click();
			logger.info("Country code selected");
			startNowButton.click();
			logger.info("Start now button clicked");

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	
	}
}
