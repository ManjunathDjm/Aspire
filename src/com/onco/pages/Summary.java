package com.onco.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.Logger;

/**
 * Locators and methods for Summary page We will call these locator and methods
 * to create test cases webtests package
 * 
 * @author manjunathdj
 *
 */
public class Summary {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(Summary.class);

	@FindBy(xpath = "/html/body/app-root/case-summary/div[2]/div/section/div[2]/div[1]/payment-summary/div[1]/div/div[1]/div/div[1]/input")
	@CacheLookup
	WebElement couponCode;

	@FindBy(xpath = "//i[@class='fa fa-times']")
	@CacheLookup
	WebElement deletecoupon;

	@FindBy(xpath = "//input[@placeholder='Enter coupon code']")
	@CacheLookup
	WebElement couponcodefield;

	@FindBy(xpath = "/html/body/app-root/case-summary/div[2]/div/section/div[2]/div[1]/payment-summary/div[1]/div/div[4]/label/span")
	@CacheLookup
	WebElement checkbox;

	@FindBy(xpath = "//button[@class='coupon-btn']")
	@CacheLookup
	WebElement couponapply;;

	@FindBy(xpath = "//button[contains(text(),'PAY AT HOSPITAL')]")
	@CacheLookup
	WebElement payathospital;

	@FindBy(xpath = "//button[contains(text(),'PAY VIA CARD')]")
	@CacheLookup
	WebElement netbankingpaynow;

	// @FindBy(xpath="/html/body/app-root/case-summary/div/div[2]/div/section/div[2]/div[1]/payment-summary/div[1]/div/div[1]/div/div/div[2]/i")
	// WebElement deletecoupon;

	public Summary(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void deletecouponcode() {

		try {
			deletecoupon.click();
			logger.info("Delete coupon clicked");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void applycoupon(String UScoupon) {

		try {
			couponcodefield.sendKeys(UScoupon);
			logger.info("Coupon code entered");
			couponapply.click();
			logger.info("Coupon colde applied");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}

	public void summary() {

		try {

			payathospital.click();
			logger.info("pay at hospital clicked");

		} catch (NoSuchElementException e) {
			e.printStackTrace();

		}
	}

	public void netbanking() {

		try {

			netbankingpaynow.click();
			logger.info("Clicked on netbankingpaynow");
		} catch (NoSuchElementException e) {
			e.printStackTrace();

		}
	}

}
