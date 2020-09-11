
package com.onco.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.Logger;

/**
 * Locators and methods for Login page We will call these locator and methods to
 * create test cases in webtests package
 * 
 * @author manjunathdj
 *
 */
public class Iamconfused {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(Iamconfused.class);

	@FindBy(xpath = "//div[@class='flex-center opt-ctn']//img[@class='cursor-pointer ng-star-inserted']")
	WebElement noiamexperiencingsymptoms;

	@FindBy(xpath = "//div[@class='flex-center']//img[@class='cursor-pointer ng-star-inserted']")
	WebElement yesiamiagnoisedwithcancer;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/confused[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/span[1]")
	WebElement requestcallback;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/confused[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]")
	WebElement getfreeopinionbutton;

	public Iamconfused(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void iamexperiencingsymptoms() {

		try {
			noiamexperiencingsymptoms.click();
			logger.info("Successfuly clicked on no i am experiencing symptoms radio button");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}

	public void iamdiagnoisedwithcancer() {
		try {
			yesiamiagnoisedwithcancer.click();
			logger.info("Successfuly clicked on yes i am giagnoised with cancer radio button");
		} catch (NoSuchElementException e) {
		}
	}

	public void requestcallback() {
		try {
			requestcallback.click();
			logger.info("Successfuly clicked on request call back button");
		} catch (NoSuchElementException e) {
		}
	}

	public void getfreeopinion() {
		try {
			getfreeopinionbutton.click();
			logger.info("Successfuly clicked on get free opinion button");
		} catch (NoSuchElementException e) {
		}
	}

}