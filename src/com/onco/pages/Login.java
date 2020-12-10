
package com.onco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.net.io.FromNetASCIIOutputStream;
import org.apache.log4j.Logger;

/**
 * Locators and methods for Login page We will call these locator and methods to
 * create test cases in webtests package
 * 
 * @author manjunathdj
 *
 */
public class Login {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(Login.class);

	@FindBy(name = "countryCode")
	WebElement countryCode;

	@FindBy(name = "contact")
	@CacheLookup
	WebElement phoneNumber;

	@FindBy(xpath = "/html/body/app-root/login/div/div[2]/div[1]/div/form/div[2]/div[3]/button")
	@CacheLookup
	WebElement loginVIAOTPbutton;

	@FindBy(xpath = "//body//input[1]")
	@CacheLookup
	WebElement Otp;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/banner-strip-component[1]/forms-main-modal[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-start-form[1]/div[1]/form[1]/div[2]/div[1]/otpinput[1]/input[1]")
	@CacheLookup
	WebElement formotp;

	@FindBy(xpath = "//*[@type='submit']")
	@CacheLookup
	WebElement proceedButton;

	// free opinion otp

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/get-free-opinion-strip[1]/app-free-opinion-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/otpinput[1]/input[1]")
	@CacheLookup
	WebElement formotp1;

	@FindBy(xpath = "//body/app-root/div/div/home/div/get-free-opinion-strip/app-free-opinion-form/div[@id='freeOpinionFormModal']/div/div/div/div/form/div/div/button[1]")
	@CacheLookup
	WebElement startnowbutton;

	@FindBy(xpath = "//body/app-root/patient-dashboard-component[@class='ng-tns-c3-16 ng-star-inserted']/div[@class='dashboard-container']/div[@class='ng-tns-c3-16']/div[@class='col-md-3 hidden-sm hidden-xs dashboard-col-left onboarding-nav-container']/div/div[@class='col-md-12 dashboard-left-separator']/onboarding-nav[@class='ng-tns-c3-16']/div[@class='row']/div[@class='onboarding-nav-container']/div[@class='footer-links-ctn']/a[1]")
	@CacheLookup
	private WebElement delete;

	public Login(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void login(String phone) {

		try {

			Select countrycode = new Select(ldriver.findElement(By.name("countryCode")));
			countrycode.selectByIndex(0);
			// countryCode.click();
			logger.info("Successfully selected country code");
			phoneNumber.sendKeys(phone);
			logger.info("Successfully selected phone number");
			loginVIAOTPbutton.click();
			logger.info("Successfully clicked on Login via OTP clicked");

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}

	public void formotp(String otp) {

		try {

			formotp.sendKeys(otp);
			proceedButton.click();

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void freeopinionotp(String otp) {

		formotp1.sendKeys(otp);
		startnowbutton.click();

	}

	public void otpDetails(String otp) {

		try {

			Otp.click();
			logger.info("Successfully clicked on OTP ");
			Otp.sendKeys(otp);
			logger.info("Successfully entered OTP ");
			proceedButton.click();
			logger.info("Successfully clicked on proceed Button");

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}
}
