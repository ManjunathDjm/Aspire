package com.onco.pages;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;
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

	@FindBy(xpath = "//*[@id=\"form-common\"]/div[1]/div/div/div[2]/div/div/button[3]/div/i")
	@CacheLookup
	WebElement netBanking1;
	
	@FindBy(xpath = "//body//payment-summary//div//div//div//div//div[2]")
	@CacheLookup
	WebElement netBanking2;
	
	@FindBy(xpath = "//*[@id=\"form-common\"]/div[1]/div/div/div[2]/div[1]/div/button[1]")
	@CacheLookup
	WebElement phonepe;
	
	@FindBy(xpath = "//*[@id=\"form-common\"]/div[1]/div/div/div[2]/div[1]/div/button[2]")
	@CacheLookup
	WebElement sbinet;
	
	@FindBy(xpath ="//*[@id=\"footer-cta\"]")
	@CacheLookup
	WebElement pay;
	
	
	
	@FindBy(xpath = "//*[@id=\"modal-close\"]")
	@CacheLookup
	WebElement close;

	@FindBy(xpath = "//*[@id=\"form-netbanking\"]/div[2]")
	@CacheLookup
	WebElement selectBank;

	@FindBy(xpath = "//button[@class='success']")
	@CacheLookup
	WebElement successButton;

	@FindBy(xpath = "//*[@id=\"bank-item-SBIN\"]/label")
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
	
			if(netBanking1.isDisplayed()) {
				netBanking1.click();
				logger.info("Clicked on netbanking one");
			} else {
				netBanking2.click();
				logger.info("Clicked on netbanking two");
			}

			sbiNetbanking.click();
			logger.info("Clicked on SBI");
			payNow.click();
			logger.info("Clicked on pay now");
			
			// Switch to child window and click on success button
			String winHandleBefore = ldriver.getWindowHandle();
			for (String windowHandle : ldriver.getWindowHandles()) {
				//ldriver.getWindowHandle();
				ldriver.switchTo().window(windowHandle); 
			}
		
			successButton.click();
			logger.info("Clicked on success button");
			ldriver.switchTo().window(winHandleBefore);
			logger.info("Successfully switch to parent window");
		} catch (NoSuchElementException e) {
			e.printStackTrace();

		}
	}

}
