package com.onco.pages;

import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
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
public class Calendar {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(Calendar.class);

	@FindBy(xpath = "/html/body/app-root/book-appointment/book-appt-datetime-modal/div/div/div")
	@CacheLookup
	WebElement calendarmodal;

	@FindBy(xpath = "//button[contains(text(),'Thursday, August 27')]")
	WebElement thursday;

	@FindBy(xpath = "//button[contains(text(),'9:00 AM - 12:00 PM')]")
	WebElement timeslot1;

	@FindBy(xpath = "//button[contains(text(),'12:00 PM - 3:00 PM')]")
	WebElement timeslot2;

	@FindBy(xpath = "//button[contains(text(),'3:00 PM - 6:00 PM')]")
	WebElement timeslot3;

	@FindBy(xpath = "//button[contains(text(),'6:00 PM - 9:00 PM')]")
	WebElement timeslot4;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/book-appointment[1]/book-appt-datetime-modal[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
	WebElement friday;

	@FindBy(xpath = "//button[contains(text(),'Saturday, August 22')]")
	WebElement saturday;

	@FindBy(xpath = "//button[contains(text(),'Sunday, August 23')]")
	WebElement sunday;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/book-appointment[1]/book-appt-datetime-modal[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/button[1]")
	WebElement monday;

	@FindBy(xpath = "//span[contains(text(),'Select')]")
	WebElement selectprefereddatetime;
	
	@FindBy(xpath = "//button[contains(text(),'Saturday, August 29')]")
	WebElement  day;
	
	@FindBy(xpath = "//button[contains(text(),'10:00 AM - 11:00 AM')]")
	WebElement  timeslot;
	
	@FindBy(xpath = "//button[contains(text(),'10:00 AM - 10:20 AM')]")
	WebElement  subtimeslot;
	
	

	public Calendar(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void prefereddatetime() {

		try {
		    selectprefereddatetime.click();
			day.click();
			timeslot.click();
			Thread.sleep(20000);
			subtimeslot.click();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void dayone() {

		try {
			ldriver.switchTo().activeElement();
			thursday.click();
			timeslot1.click();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}