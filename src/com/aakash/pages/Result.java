package com.aakash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.apache.log4j.Logger;

/**
 * Locators and methods for TP Result page We will call these locator and
 * methods to create test cases in webtests packege
 *
 * @author manjunathdj
 *
 */

public class Result {

	WebDriver ldriver;

	private static final Logger logger = Logger.getLogger(Result.class);

	@FindBy(xpath = "//a[normalize-space()='Result']")
	WebElement Resulttab;

	@FindBy(name = "exam_details")
	WebElement Examnamedropdown;

	@FindBy(xpath = "//a[normalize-space()='Begin Test']")
	WebElement Begintestbutton;

	@FindBy(xpath = "//a[normalize-space()='Edit']")
	WebElement Editbutton;

	public Result(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	public void result() throws Exception {

		Resulttab.click();
		Resulttab.isSelected();
		logger.info("Clicked on Result section");

	}

	public void selectexam() throws Exception {

		Examnamedropdown.isDisplayed();
		Examnamedropdown.click();
		logger.info("Clicked on select exam dropdown");

		Examnamedropdown.isSelected();
		Select exam = new Select(Examnamedropdown);
		exam.selectByIndex(1);
		logger.info("Selected exam");

		Boolean b = Begintestbutton.isEnabled();
		if (b) {
			System.out.println("Yes ! Element is enabled");
		} else {
			System.out.println("NO ! Element is disabled");
		}
		Begintestbutton.click();
		logger.info("Clicked on begin test button");

	}

	public void examdetails() throws Exception {

		Editbutton.click();
		Reporter.log("Clicked on edit button");

	}
}
