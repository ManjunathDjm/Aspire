package com.aakash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.aakash.utils.PropertiesData;

import org.apache.log4j.Logger;

/**
 * Locators and methods for Exam Details page.We will call these locator and
 * methods to create test cases in webtests packege
 *
 * @author manjunathdj
 *
 */

public class ExamDetailsPage {

	WebDriver ldriver;

	private static final Logger logger = Logger.getLogger(ExamDetailsPage.class);

	@FindBy(name = "title[0][value]")
	WebElement Rollnumberdisabled;

	@FindBy(id = "edit-field-exam-detail-class-stream")
	WebElement StudyingClassAndStream;

	@FindBy(id = "edit-custom-exam-mode")
	WebElement ExamModeAndSlot;

	@FindBy(name = "field_state")
	WebElement State;

	@FindBy(id = "edit-custom-user-cbt-centre")
	WebElement NearestCenter;

	@FindBy(id = "edit-custom-user-exam-date")
	WebElement examdate;

	@FindBy(id = "otp")
	WebElement otp;

	@FindBy(id = "exam-update")
	WebElement GetOTP;

	@FindBy(xpath = "//a[normalize-space()='Cancel']")
	WebElement CancelButton;

	@FindBy(name = "op")
	WebElement Submit;

	@FindBy(xpath = "dropdown-heading")
	WebElement languageselection;

	@FindBy(xpath = "//label[normalize-space()='Hindi(Hi)']")
	WebElement hindilanguageradiobutton;

	@FindBy(xpath = "//label[normalize-space()='English(En)']")
	WebElement englishlanguagebutton;

	public ExamDetailsPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	public void rollnumber(String OTP) throws Exception {

		Rollnumberdisabled.isEnabled();
		Reporter.log("Roll number disabled");
		StudyingClassAndStream.isSelected();

		Select classstream = new Select(StudyingClassAndStream);
		classstream.selectByIndex(1);
		Reporter.log("Class stream selected");

		Select modeandslot = new Select(ExamModeAndSlot);
		modeandslot.selectByIndex(1);
		Reporter.log("ModeSlot selected");

		Select state = new Select(State);
		state.selectByIndex(1);
		Reporter.log("State selected");

		Select nearestcenter = new Select(NearestCenter);
		nearestcenter.selectByIndex(1);
		Reporter.log("Nearest center selected");

		Select examdate = new Select(NearestCenter);
		examdate.selectByIndex(1);
		Reporter.log("Exam date selected");

		otp.sendKeys(PropertiesData.getObject("otp"));

	}

	public void getotp() throws Exception {

		GetOTP.click();
		Reporter.log("Clicked on GetOTP button");
	}

	public void cancelbutton() throws Exception {

		CancelButton.click();
		Reporter.log("Clicked on cncel button");
	}

	public void submitbutton() throws Exception {

		Submit.click();
		Reporter.log("Clicked on submit button");
	}

	public void languageselection() {

		hindilanguageradiobutton.click();
		englishlanguagebutton.click();
	}
}
