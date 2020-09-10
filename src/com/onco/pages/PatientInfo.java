package com.onco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

/**
 * Locators and methods for patient info page We will call these locator and
 * methods to create test cases webtests package
 * 
 * @author manjunathdj
 *
 */
public class PatientInfo {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(PatientInfo.class);

	@FindBy(xpath = "//*[@name='patientName']")
	@CacheLookup
	private WebElement patientname;

	@FindBy(xpath = "//select[@name='cancerType']")
	@CacheLookup
	private WebElement typeofCancer;

	@FindBy(xpath = "//select[@name='cancerStage']")
	@CacheLookup
	private WebElement cancerStage;

	@FindBy(xpath = "//select[@name='condition']")
	@CacheLookup
	private WebElement generalCondition;

	@FindBy(xpath = "/html/body/app-root/patient-info/div/div[2]/div[2]/div[1]/div[1]/div/div[3]/div[5]/div[2]/div[1]/div[1]/label/span")
	@CacheLookup
	private WebElement chemo;

	@FindBy(xpath = "/html/body/app-root/patient-info/div[2]/div[2]/div/div[1]/div/div[3]/div[6]/div/div/div/div/div[2]/div")
	@CacheLookup
	private WebElement fileupload;

	@FindBy(xpath = "/html/body/app-root/patient-info/div/div[2]/div[2]/div[1]/div[1]/div/div[3]/div[7]")
	@CacheLookup
	private WebElement continueButton;

	public PatientInfo(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void patientname(String pname) {

		try {
			patientname.sendKeys(pname);
			logger.info("Successfully entered Patientname");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void cancertype() {

		try {

			Select TypeofCancer = new Select(ldriver.findElement(By.name("cancerType")));
			TypeofCancer.selectByIndex(1);
			typeofCancer.click();
			logger.info("Successfully selected type of cancer");

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}

	public void cancerstage() {

		try {

			Select Cancerstage = new Select(ldriver.findElement(By.name("cancerStage")));
			Cancerstage.selectByIndex(1);
			cancerStage.click();
			logger.info("Successfully selected CancerStage ");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void condition() {

		try {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Select Condition = new Select(ldriver.findElement(By.name("condition")));
			Condition.selectByVisibleText("Active");
			logger.info("Successfully selected Condition");

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void treatment() {

		try {
			try {
				Thread.sleep(20000);
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			chemo.click();
			logger.info("Successfully selected treatment recived");

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}

	public void continuebutton() {

		try {
			try {
				Thread.sleep(20000);
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			continueButton.click();
			logger.info("Successfully click on continue button ");

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

	}
}
