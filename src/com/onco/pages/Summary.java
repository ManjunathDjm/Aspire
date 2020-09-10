package com.onco.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import groovyjarjarasm.asm.tree.TryCatchBlockNode;

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

	@FindBy(xpath = "//body//payment-summary//div//div//div//div//div[2]")
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

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/case-summary[1]/div[1]/div[2]/div[1]/section[1]/div[2]/div[1]/payment-summary[1]/div[1]/div[1]/div[4]/button[1]")
	@CacheLookup
	WebElement labbook;

	@FindBy(xpath = "//button[contains(text(),'PAY VIA CARD')]")
	@CacheLookup
	WebElement netbankingpaynow;

	@FindBy(xpath = "//button[contains(text(),'Pay Using UPI')]")
	@CacheLookup
	WebElement payusingUPI;

	@FindBy(xpath = "//button[contains(text(),'Pay Using PAYTM')]")
	@CacheLookup
	WebElement paytm;

	// @FindBy(xpath="/html/body/app-root/case-summary/div/div[2]/div/section/div[2]/div[1]/payment-summary/div[1]/div/div[1]/div/div/div[2]/i")
	// WebElement deletecoupon;

	public Summary(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void deletecouponcode() {

		try {
			deletecoupon.click();
			logger.info("Successfully Delete coupon ");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void applycoupon(String UScoupon) {

		try {
			couponcodefield.sendKeys(UScoupon);
			logger.info("Successfully entered coupon");
			couponapply.click();
			logger.info("Successfully applied coupon");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}

	public void summary() {

		try {
			payathospital.click();
			logger.info("Successfully clicked on pay at hospital");

		} catch (NoSuchElementException e) {
			e.printStackTrace();

		}
	}

	public void netbanking() {

		try {

			netbankingpaynow.click();
			logger.info("Successfully clicked on netbanking button");
		} catch (NoSuchElementException e) {
			e.printStackTrace();

		}
	}

	public void labbook() {
        try {
        	labbook.click();
    		logger.info("Successfully clicked on book appointment button");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void upi() {

		payusingUPI.click();
		logger.info("Successfully clicked on book UPI payment button");
	}

	public void paytm() {

		paytm.click();
		logger.info("Successfully clicked on book paytm payment button");
	}

}
