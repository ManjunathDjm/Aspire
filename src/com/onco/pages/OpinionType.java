package com.onco.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Locators and methods for opinion page We will call these locator and methods
 * to create test cases in webtests package
 * 
 * @author manjunathdj
 *
 */
public class OpinionType {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(OpinionType.class);

	@FindBy(xpath = "//html//body//app-root//select-opinion-type//div//div//div//div//div//div//div//div//div[contains(text(),'SELECT INDIA PANEL')]")
	@CacheLookup
	WebElement indianPanelButton;
	
	
	@FindBy(xpath = "/html/body/app-root/select-opinion-type/div/div[3]/div[1]/div/div[2]/div[4]/div[2]/div/div[3]")
	@CacheLookup
	WebElement selectUsPanelButton;

	public OpinionType(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void indianPanelButton() {

		try {

			indianPanelButton.click();
			logger.info("Successfullt clicked on India Panal button");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		}

	}

	public void USPanalButton() {

		try {

			selectUsPanelButton.click();
			logger.info("Successfullt clicked on US Panal button");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
}
