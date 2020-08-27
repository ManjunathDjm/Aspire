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
import org.apache.log4j.Logger;

/**
 * Locators and methods for labtest page We will call these locator and methods
 * to create test cases webtests package
 * 
 * @author manjunathdj
 *
 */
public class RequestLabTests {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(RequestLabTests.class);

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/req-lab-test[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement location;
	
	@FindBy(xpath = "/html/body/app-root/req-lab-test/div/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div/div[2]/div[1]/div[1]")
	@CacheLookup
	WebElement bangalore;

	@FindBy(xpath = "//div[contains(text(),'Select test type')]")
	@CacheLookup
	WebElement testtype;
	
	@FindBy(xpath = "//div[contains(text(),'CT Scan')]")
	@CacheLookup
	WebElement ctscan;
	
	@FindBy(xpath = "//html//body//app-root//req-lab-test//div//div//div//div//div//div[contains(text(),'CONTINUE')]")
	@CacheLookup
	WebElement continueButton;

	@FindBy(xpath = "//button[contains(text(),'BOOK APPOINTMENT')]")
	@CacheLookup
	WebElement booknow;
	
	@FindBy(xpath = "//body/app-root/req-lab-test/div/div/div/div/div/div/div/div/div/div/div[2]")
	@CacheLookup
	WebElement requestcallback;
	
	
	

	public RequestLabTests(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void location() throws InterruptedException {


		try {
			logger.info(location.isDisplayed());
			location.click();
			try {
				Thread.sleep(2000);
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			location.sendKeys("Bengaluru, Karnataka");
			bangalore.click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}
	public void testtype() {

		try {
           testtype.click();
           ctscan.click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void continueButton() {

		try {
			logger.info(continueButton.isDisplayed());
			continueButton.click();
			booknow.click();
			

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void requestcall() {
		location.click();
		requestcallback.click();
	}
}
