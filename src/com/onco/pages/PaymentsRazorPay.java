package com.onco.pages;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Locators and methods for Payments page We will call these locator and methods
 * to create test cases webtests package
 * 
 * @author manjunathdj
 *
 */
public class PaymentsRazorPay {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(PaymentsRazorPay.class);

	@FindBy(xpath = "//*[@id=\"form-common\"]/div/div[1]/div[3]/div/div/div[2]/div/button[2]/div")
	@CacheLookup
	WebElement netBanking;

	@FindBy(xpath = "//*[@id=\"modal-close\"]")
	@CacheLookup
	WebElement close;

	@FindBy(xpath = "//*[@id=\"form-netbanking\"]/div[2]")
	@CacheLookup
	WebElement selectBank;

	@FindBy(xpath = "//button[@class='success']")
	@CacheLookup
	WebElement successButton;

	@FindBy(xpath = "//*[@id=\"netb-banks\"]/div[1]/label")
	@CacheLookup
	WebElement sbiNetbanking;

	@FindBy(id = "footer")
	private WebElement payNow;

	public PaymentsRazorPay(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void netbanking() throws InterruptedException {

		try {

			ldriver.switchTo().frame(ldriver.findElement(By.className("razorpay-checkout-frame")));
			netBanking.click();
			logger.info("Clicked on netbanking");

			sbiNetbanking.click();
			logger.info("Clicked on SBI");

			payNow.click();
			logger.info("Clicked on pay now");
			// Switch to child window and click on success button
			Set<String> windowhandles = ldriver.getWindowHandles();
			for (String windowHandle : windowhandles) {
				ldriver.getWindowHandle();
				ldriver.switchTo().window(windowHandle);
			}
			successButton.click();
			logger.info("Clicked on success button");

		} catch (NoSuchElementException e) {
			e.printStackTrace();

		}
	}

}
