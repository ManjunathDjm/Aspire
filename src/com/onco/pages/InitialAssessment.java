package com.onco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.apache.log4j.Logger;

/**
 * Locators and methods for InitialAssessment Model We will call these locator
 * and methods to create test cases in webtests package
 * 
 * @author manjunathdj
 *
 */
public class InitialAssessment {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(InitialAssessment.class);

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/select-service[1]/initial-assessment-modal[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
	@CacheLookup
	private WebElement initiAlassessmentClose;

	@FindBy(partialLinkText = "VIEW ASSESSMENT")
	@CacheLookup
	private WebElement viewAssessment;

	@FindBy(xpath = "//div[@class='orange-rounded-inner-btn float-right']")
	@CacheLookup
	private WebElement exploremoreoptions;

	@FindBy(xpath = "//div[@class='download-assessment cursor-pointer']")
	@CacheLookup
	private WebElement downloadAssessment;

	public InitialAssessment(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);

	}

	public void initialAssessmentClose() {

		try {

			for (int i = 0; i <= 2; i++) {
				try {

					ldriver.switchTo().defaultContent();
					initiAlassessmentClose.click();
					break;
				} catch (Exception e) {

				}
			}

			logger.info("Initial Assessment Window closed");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void ViewAssessment() {

		try {

			for (int i = 0; i <= 2; i++) {
				try {

					viewAssessment.click();
					exploremoreoptions.click();
					break;

				} catch (Exception e) {

				}
			}

			logger.info("View Assessment clicked");
			logger.info("Explore More Option clicked");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void downloadAssessment() {

		try {

			downloadAssessment.click();
			logger.info("Download Assessment clicked");

		} catch (NoSuchElementException e) {
			// TODO: handle exception
		}
	}

}
