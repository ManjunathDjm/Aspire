package com.onco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Locators and methods for appointment page We will call these locator and
 * methods to create test cases in webtests packege
 *
 * @author manjunathdj
 *
 */

public class Appointment {

	WebDriver ldriver;

	private static final Logger logger = Logger.getLogger(Appointment.class);

	@FindBy(xpath = "/html/body/app-root/book-appointment/section/div/div/div/div[2]/div/div[3]/div/div[2]/div/div[2]/button")
	@CacheLookup
	WebElement bookappointment;

	@FindBy(xpath = "//button[contains(text(),'BOOK ON PRIORITY')]")
	@CacheLookup
	WebElement bookonpriority;

	public Appointment(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	public void appointment() {

		try {

			bookappointment.click();
			logger.info("Book appointment clicked");

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}
	public void bookonpriority() {
		
		try {
			bookonpriority.click();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
