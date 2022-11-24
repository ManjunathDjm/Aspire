package com.aakash.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.Logger;

/**
 * Locators and methods for Leave test popup We will call these locator and
 * methods to create test cases in webtests packege
 *
 * @author manjunathdj
 *
 */

public class LeaveTestPopup {

	WebDriver ldriver;

	private static final Logger logger = Logger.getLogger(LeaveTestPopup.class);

	@FindBy(xpath = "//*[contains(text(),'Resume')]")
	WebElement Resumebutton;

	public LeaveTestPopup(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	public void resume() throws Exception {

		ldriver.navigate().refresh();
		logger.info("Refreshing browser");
		Thread.sleep(10000);
		ldriver.switchTo().defaultContent();
		Resumebutton.click();
		Resumebutton.isDisplayed();
		logger.info("Clicked on Resume button");
		WebElement l = ldriver.findElement(By.tagName("body"));
		System.out.println("Text content: " + l.getText());

	}
}
