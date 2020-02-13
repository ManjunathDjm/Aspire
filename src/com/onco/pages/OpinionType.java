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

	@FindBy(xpath = "/html/body/app-root/select-opinion-type/div/div[2]/div[2]/section/div[3]/div[1]/section/div/div/div[1]/div/div[2]/div/div[2]")
	@CacheLookup
	WebElement indianPanelButton;

	@FindBy(xpath = "//div[@class='col-md-4 col-lg-4 col-xl-4 flex-justify-center']//div//div[@class='orange-rounded-inner-btn'][contains(text(),'SELECT US PANEL')]")
	@CacheLookup
	WebElement selectUsPanelButton;

	public OpinionType(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void indianPanelButton() {

		try {

			indianPanelButton.click();
			logger.info("India Panal button clicked");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		}

	}

	public void USPanalButton() {

		try {

			selectUsPanelButton.click();
			logger.info("US Panal button clicked");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
}
