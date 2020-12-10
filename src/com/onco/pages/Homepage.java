package com.onco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.analysis.function.Exp;
import org.apache.log4j.Logger;

/**
 * Locators and methods for Homepage page We will call these locator and methods
 * to create test cases in webtests packege
 * 
 * @author manjunathdj
 *
 */
public class Homepage {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(Homepage.class);

	@FindBy(xpath = "//button[contains(text(),'SCHEDULE A CALL')]")
	@CacheLookup
	WebElement scheduleacallbanner;

	@FindBy(name = "name")
	@CacheLookup
	WebElement patientname;

	@FindBy(name = "mail")
	@CacheLookup
	WebElement mail;

	@FindBy(name = "contact")
	@CacheLookup
	WebElement contact;

	@FindBy(id = "book-appt-landing-signup")
	@CacheLookup
	WebElement startnow;

	// get free opinion form

	@FindBy(xpath = "//div[@id='freeOpinionFormModal']//div//div//div//div//form//div//div//div//input[@placeholder='Name']")
	@CacheLookup
	WebElement patient;

	@FindBy(xpath = "//div[@id='freeOpinionFormModal']//div//div//div//div//form//div//div//div//input[@placeholder='Email']")
	@CacheLookup
	WebElement emailid;

	@FindBy(xpath = "//div[@id='freeOpinionFormModal']//div//div//div//div//form//div//div//div//input[@placeholder='Phone No']")
	@CacheLookup
	WebElement phonenumber;

	@FindBy(xpath = "//body/app-root/div/div/home/div/get-free-opinion-strip/app-free-opinion-form/div[@id='freeOpinionFormModal']/div/div/div/div/form/div/div[2]")
	@CacheLookup
	WebElement startnow1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/get-free-opinion-strip[1]/section[1]/div[1]/div[1]/div[2]/button[1]")
	@CacheLookup
	WebElement getnow;

	@FindBy(className = "ng-arrow-wrapper")
	@CacheLookup
	WebElement cancertypedropdown;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/get-free-opinion-strip[1]/section[1]/div[1]/div[2]/div[3]/div[2]/div[2]/ng-select[1]/div[1]/span[1]")
	@CacheLookup
	WebElement cancerstagedropdoen;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/get-free-opinion-strip[1]/section[1]/div[1]/div[2]/div[3]/div[3]/div[2]/ng-select[1]/div[1]/span[1]")
	@CacheLookup
	WebElement generalconditiondropdown;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/get-free-opinion-strip[1]/section[1]/div[1]/div[2]/div[3]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")
	@CacheLookup
	WebElement breastcancer;
	

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/get-free-opinion-strip[1]/section[1]/div[1]/div[2]/div[3]/div[1]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[18]/span[1]")
	@CacheLookup
	WebElement idontknow;		
			
			
	@FindBy(xpath = "//app-free-opinion-form//div//div//div[contains(text(),'DOWNLOAD FREE OPINION')]")
	@CacheLookup
	WebElement formdownloadfreeopinion;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/get-free-opinion-strip[1]/section[1]/div[1]/div[2]/div[3]/div[2]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[2]/span[1]")
	@CacheLookup
	WebElement cancerstage;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/get-free-opinion-strip[1]/section[1]/div[1]/div[2]/div[3]/div[3]/div[2]/ng-select[1]/ng-dropdown-panel[1]/div[1]/div[2]/div[1]/span[1]")
	@CacheLookup
	WebElement generalcondition;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/get-free-opinion-strip[1]/section[1]/div[1]/div[2]/div[4]/div[1]/div[2]/div[1]/label[1]/span[2]")
	@CacheLookup
	WebElement treatmentrecived;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/get-free-opinion-strip[1]/section[1]/div[1]/div[2]/div[4]/div[2]/button[1]")
	@CacheLookup
	WebElement getfreeopinionbutton;
	
	@FindBy(xpath = "//u[contains(text(),'Download a sample report')]")
	@CacheLookup
	WebElement downloadsamplereportlink;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/what-do-we-do[1]/section[1]/div[1]/div[2]/div[2]/div[1]")
	@CacheLookup
	WebElement bookdoctorconsulationtab;
	
	@FindBy(xpath = "//div[@id='carouselExampleSlidesOnly']")
	@CacheLookup
	WebElement courosalslides;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/what-do-we-do[1]/section[1]/div[1]/div[3]/app-doctor-carousel-v2[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]")
	@CacheLookup
	WebElement doctorimage;
	
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/what-do-we-do[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/a[1]/u[1]")
	@CacheLookup
	WebElement seepricing;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/section[2]/recognition-from-media[1]/div[1]/div[1]/div[1]/div[1]")
	@CacheLookup
	WebElement yoursotory;
	
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/section[2]/recognition-from-media[1]/div[1]/div[1]/div[2]")
	@CacheLookup
	WebElement etprime;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/section[2]/recognition-from-media[1]/div[1]/div[1]/div[3]/div[1]")
	@CacheLookup
	WebElement ajtak;
	
	//talk now
	
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/talk-now-strip[1]/section[1]/div[1]/div[1]/div[2]/div[1]")
	@CacheLookup
	WebElement talknow;
	
	@FindBy(className = "material-input form-control ng-pristine ng-valid ng-touched")
	@CacheLookup
	WebElement talknowname;
	
	@FindBy(xpath = "//form[@class='loginCard ng-pristine ng-valid ng-touched']//input[@placeholder='Email']")
	@CacheLookup
	WebElement talknowemail;
	
	@FindBy(xpath = "//form[@class='loginCard ng-pristine ng-valid ng-touched']//input[@placeholder='Phone No']")
	@CacheLookup
	WebElement talknowphone;
	
	
	//diagnostic test
	@FindBy(xpath ="/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[4]/what-do-we-do[1]/section[1]/div[1]/div[2]/div[4]/div[1]")
	WebElement bookdisgnostictest;
	
	@FindBy(css="button[class='book-test-btn']")
	WebElement booknow;
	
	@FindBy(className="start-now-btn-mobile")
	WebElement disgnosticpagebooknow;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/diagnostic[1]/forms-main-modal[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-start-form[1]/div[1]/form[1]/div[2]/div[1]/div[1]/ng-select[1]/div[1]/div[1]/div[2]")
	WebElement selecttest;
	
	
	
	

	public Homepage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	public void bannar() {

		try {

			scheduleacallbanner.click();
			logger.info("Successfully clicked on banner");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		}
	}

	public void formfill(String name, String email, String phone) {

		try {

			patientname.sendKeys(name);
			logger.info("Successfully entered name in to form");
			mail.sendKeys(email);
			logger.info("Successfully entered mail in to form");
			contact.sendKeys(phone);
			logger.info("Successfully entered phone in to form");
			startnow.click();
			logger.info("Successfully clicked on starnow button");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getfreeopinion() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(20000);

	}

	public void cancertype() throws InterruptedException {

		cancertypedropdown.click();
		logger.info("Successfully clicked on cancer type dropdown");
		breastcancer.click();
		logger.info("Successfully clicked on blood cancer");
		Thread.sleep(20000);

	}

	public void cancerstage() {

		cancerstagedropdoen.click();
		logger.info("Successfully clicked on cancer stage dropdown");
		cancerstage.click();
		logger.info("Successfully clicked on cancer stage");

	}

	public void generalcondition() {
		generalconditiondropdown.click();
		logger.info("Successfully clicked on general condtion dropdown");
		generalcondition.click();
		logger.info("Successfully selected general condition");
		treatmentrecived.click();
		logger.info("Successfully clicked on treatment recived");
		getfreeopinionbutton.click();
		logger.info("Successfully clicked on get free opinion");

	}

	public void freeopinionform(String name, String email, String phone) {

		patient.sendKeys(name);
		logger.info("Successfully entered patient name");
		emailid.sendKeys(email);
		logger.info("Successfully entered email");
		phonenumber.sendKeys(phone);
		logger.info("Successfully entered phone");
		startnow1.click();
		logger.info("Successfully clicked on startnow button");
	}

	public void samplereport () {
		
		downloadsamplereportlink.click();
		
	}
	public void doctorconsultationtab () {
		
		bookdoctorconsulationtab.click();
		logger.info("Successfully clicked on doctor consultation tab");
		courosalslides.isDisplayed();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doctorimage.click();
		logger.info("Successfully clicked on doctor image");

	}
	
	public void seepricing() {
		
		try {
			seepricing.click();
			logger.info("Successfully clicked on see pricing");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void oncoinnews () {
		
		yoursotory.click();
		logger.info("Successfully clicked on yourstory");
		etprime.click();
		logger.info("Successfully clicked on etprime");
		ajtak.click();
		logger.info("Successfully clicked on ajtak");
		
	}
	
	public void talknow(String name,String email,String phone) {
		
		try {
			talknow.click();
			talknowname.sendKeys(name);
			talknowemail.sendKeys(email);
			talknowphone.sendKeys(phone);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
public void bookdiagnostictest() throws InterruptedException {
		
		try {
			bookdisgnostictest.click();
			booknow.click();
			Thread.sleep(20000);
			ArrayList<String> tabs2 = new ArrayList<String> (ldriver.getWindowHandles());
		    ldriver.switchTo().window(tabs2.get(0));
		    //ldriver.close();
		    ldriver.switchTo().window(tabs2.get(1));
			disgnosticpagebooknow.click();
			selecttest.click();
			Select test = new Select(selecttest);
			test.deselectByValue("PET CT (All Types)");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
