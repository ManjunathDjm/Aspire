package com.onco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.onco.testbase.BaseClass;

import org.apache.bcel.generic.LoadClass;
import org.apache.log4j.Logger;

/**
 * Locators and methods for Request doctor appointment page We will call these
 * locator and methods to create test cases webtests package
 * 
 * @author manjunathdj
 *
 */
public class RequestDoctorAppointment {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(RequestDoctorAppointment.class);

	@FindBy(xpath = "//html//body//app-root//req-doc-appointment//div//div//div//div//div//div//input[@placeholder='Select Location']")
	@CacheLookup
	WebElement location;
	
	@FindBy(xpath = "//html//body//app-root//req-doc-appointment//div//div//div//div//div//div//div//div//div[contains(text(),'Bengaluru, Karnataka')]")
	@CacheLookup
	WebElement bangalore;
	
	@FindBy(xpath = "//body/app-root/req-doc-appointment/div/div[3]/div[1]/div[1]/div[2]")
	@CacheLookup
	WebElement specialisationDropdownSurgicalOncologist;
	
	@FindBy(xpath = "//div[contains(text(),'Surgical Oncologist')]")
	@CacheLookup
	WebElement Surgicaloncologist;

	@FindBy(xpath = "//input[@placeholder='Any specific requirements']")
	@CacheLookup
	WebElement specific_test;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/req-doc-appointment[1]/div[1]/div[3]/div[1]/div[1]/div[4]/div[1]")
	@CacheLookup
	WebElement findoncologist;
	
	@FindBy(xpath = "//body/app-root/req-doc-appointment/div/div/div/div/div/div/div/div[2]")
	@CacheLookup
	WebElement requestcallonco;


	public RequestDoctorAppointment(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void appointment() {

		try {
			location.click();
			logger.info("Successfully clicked on location");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			location.sendKeys("Bengaluru, Karnataka");
			logger.info("Successfully typed location");
			bangalore.click();
			logger.info("Successfully clicked on location");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}

	public void surgicalOncologist() {

		try {
		
			specialisationDropdownSurgicalOncologist.click();
			logger.info("Successfully selected specialisationDropdownSurgicalOncologist");
			Surgicaloncologist.click();
			logger.info("Successfully selected Surgicaloncologist");

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void radiationOncologist() throws InterruptedException {

		try {
			
			Thread.sleep(20000);
			logger.info(specialisationDropdownSurgicalOncologist.isDisplayed());
			Select specialisation = new Select(ldriver.findElement(By.xpath(
					"//div[@class='col-md-6 col-lg-6 col-xl-6']//select[@placeholder='Select Specialisation']")));
			specialisationDropdownSurgicalOncologist.click();
			logger.info("Successfully clicked on Surgicaloncologist");
			specialisation.selectByIndex(2);
			specialisationDropdownSurgicalOncologist.click();
			logger.info("Successfully selected Surgicaloncologist");

		} catch (NoSuchElementException e) {
			e.printStackTrace();

		}
	}

	public void button() throws InterruptedException {

		try {
			Thread.sleep(20000);
			findoncologist.click();
			logger.info("Successfully clicked on FindOncologist");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}
	
	public void requestcallonco() {
		
		location.click();
		logger.info("Successfully clicked on location");
		requestcallonco.click();
		logger.info("Successfully selected request call onco");
	}
	
}
