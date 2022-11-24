package com.aakash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.aakash.utils.PropertiesData;

/**
 * Locators and methods for Registration Home will call these locator and
 * methods to create test cases in webtests packege
 *
 * @author manjunathdj
 *
 */

public class RegistrationHome {

	WebDriver ldriver;

	@FindBy(name = "mobile_no")
	WebElement Mobilenumber;

	@FindBy(xpath = "//a[normalize-space()='Get OTP']")
	WebElement GetOTPButton;

	@FindBy(id = "edit-next")
	WebElement VerifyOTP;

	@FindBy(id = "otp")
	WebElement Otp;

	@FindBy(name = "student_name")
	WebElement Studentname;

	@FindBy(name = "father_name")
	WebElement Fathername;

	@FindBy(name = "student_email")
	WebElement Email;

	@FindBy(name = "student_dob")
	WebElement Dateofbirth;

	@FindBy(xpath = "//option[@value='5']")
	WebElement Selectmonth;

	@FindBy(xpath = "//option[@value='1990']")
	WebElement Selectyear;

	@FindBy(xpath = "//a[normalize-space()='11']")
	WebElement Selectday;

	@FindBy(name = "classtream")
	WebElement classandstream;

	@FindBy(name = "exam_mode")
	WebElement exammodetime;

	@FindBy(name = "exam_state")
	WebElement selectstate;

	@FindBy(name = "branch_code")
	WebElement selectcentre;

	@FindBy(name = "exam_date")
	WebElement examdatedropdown;

	@FindBy(name = "student_city")
	WebElement studentcity;

	@FindBy(linkText = "Delhi-Delhi")
	WebElement studentcityvalue;

	@FindBy(xpath = "/html/body/div[2]/div/div/section[1]/div[2]/div/div/div/article/section[2]/form/div[2]/div/div[12]/input[2]")
	WebElement completeregistration;

	public RegistrationHome(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	public void Mobile(String mobilenumber) throws Exception {

		long randomMob = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		Mobilenumber.sendKeys("" + randomMob);
		// Mobilenumber.sendKeys(PropertiesData.getObject("mobilenumber"));
		Mobilenumber.isDisplayed();
		Reporter.log("Entered mobile number");
		GetOTPButton.click();
		Reporter.log("Clicked on GetOTP");

	}

	public void Otp(String otp) throws Exception {

		Otp.sendKeys(PropertiesData.getObject("otp"));
		Reporter.log("Entered otp");
	}

	public void verifyOtp() throws Exception {

		VerifyOTP.click();
		Reporter.log("Clicked on verify otp button");

	}

	public void Studentname(String studentname) throws Exception {

		Studentname.sendKeys(PropertiesData.getObject("studentname"));
		Reporter.log("Entered student name");
		Thread.sleep(10000);

	}

	public void Fathername(String fathername) throws Exception {

		Fathername.sendKeys(PropertiesData.getObject("fathername"));
		Reporter.log("Entered father name");

	}

	public void Email(String email) throws Exception {

		Email.sendKeys(PropertiesData.getObject("email"));
		Reporter.log("Entered email");
		Thread.sleep(10000);

	}

	public void dateofbirth() throws Exception {

		Dateofbirth.isDisplayed();
		Dateofbirth.click();
		Reporter.log("Clicked on Date of birth dropdown");
		Selectmonth.isDisplayed();
		Selectmonth.click();
		Reporter.log("Selected date of birth month");
		Selectyear.isDisplayed();
		Selectyear.click();
		Reporter.log("Selected date of birth year");
		Selectday.isDisplayed();
		Selectday.click();
		Reporter.log("Selected date of birth day");

	}

	public void classAndStream() throws Exception {

		classandstream.isDisplayed();
		classandstream.click();
		Reporter.log("Clicked on class and stream");

		classandstream.isSelected();
		Select exam = new Select(classandstream);
		exam.selectByIndex(7);
		Reporter.log("Selected classstream");
		Thread.sleep(10000);

	}

	public void exammode() throws Exception {

		exammodetime.isDisplayed();
		exammodetime.click();
		Reporter.log("Clicked on class and stream");

		exammodetime.isSelected();
		Select exam = new Select(exammodetime);
		exam.selectByIndex(2);
		Reporter.log("Selected classstream");
		Thread.sleep(10000);

	}

	public void Selectstate() throws Exception {

		selectstate.isDisplayed();
		selectstate.click();
		Reporter.log("Clicked on select state dropdown");

		selectstate.isSelected();
		Select examstate = new Select(selectstate);
		examstate.selectByIndex(1);
		Reporter.log("Selected state");
		Thread.sleep(10000);
	}

	public void selectcentre() throws Exception {

		selectcentre.isDisplayed();
		selectcentre.click();
		Reporter.log("Clicked on selectcentre");

		selectcentre.isSelected();
		Select exam = new Select(selectcentre);
		exam.selectByIndex(1);
		Reporter.log("Selected centre");
		Thread.sleep(10000);
	}

	public void examdate() throws Exception {

		examdatedropdown.isDisplayed();
		examdatedropdown.click();
		Reporter.log("Clicked on exam date");

		examdatedropdown.isSelected();
		Thread.sleep(10000);
		Select exam = new Select(examdatedropdown);
		exam.selectByIndex(1);
		Reporter.log("Selected exam date");
		Thread.sleep(10000);

	}

	public void citystate() throws Exception {

		studentcity.sendKeys(PropertiesData.getObject("citystate"));
		studentcity.click();
		studentcityvalue.click();

	}

	public void completeregistration() throws Exception {

		completeregistration.click();
		Thread.sleep(10000);
	}
}
