package com.onco.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Locators and methods for Dsahboard page We will call these locator and
 * methods to create test cases in webtests packege
 * 
 * @author manjunathdj
 *
 */
public class Dashboard {

	WebDriver ldriver;

	@FindBy(xpath = "/html/body/app-root/patient-dashboard-component/div[2]/div/div[2]/div/div/div[3]/div[3]/div[2]/div/div[2]/div/button")
	@CacheLookup
	WebElement continuebutton;

	@FindBy(xpath = "/html/body/app-root/app-reports/div[2]/div[1]/onboarding-nav/div/div/div[1]/ul/li[2]/a")
	@CacheLookup
	WebElement reports;

	@FindBy(xpath = "/html/body/app-root/app-reports/div[2]/div[1]/onboarding-nav/div/div/div[1]/ul/li[3]/a")
	@CacheLookup
	WebElement history;

	@FindBy(xpath = "//a[@class='logout item ng-star-inserted']")
	@CacheLookup
	WebElement logout;

	@FindBy(xpath = "1")
	@CacheLookup
	WebElement deleteuser;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/patient-dashboard-component[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[3]/div[2]/div[1]/div[1]/div[1]/pricing[1]/div[1]/div[1]/div[3]/a[1]")
	@CacheLookup
	WebElement selectindiapanal;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/patient-dashboard-component[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]")
	@CacheLookup
	WebElement proceedbutton;

	public Dashboard(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void selectindiapanalbutton() {
		try {

			selectindiapanal.click();
			proceedbutton.click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void dashboard() {
		try {
			continuebutton.click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void logout() {
		try {
			logout.click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
}
