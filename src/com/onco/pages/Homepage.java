package com.onco.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[2]/input[1]")
	@CacheLookup
	WebElement nameField;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[4]/input[1]")
	@CacheLookup
	WebElement emailField;

	@FindBy(name = "/html/body/app-root/home/div[1]/div/div[2]/div[2]/start-case-form/form/div[7]/select")
	@CacheLookup
	WebElement countryCode;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[8]/input[1]")
	@CacheLookup
	WebElement phoneFiled;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[10]/div[1]/button[1]/span[1]")
	@CacheLookup
	WebElement patientChoice;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[10]/div[1]/ul[1]/li[1]/a[1]")
	@CacheLookup
	WebElement dropOption1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[13]/input[1]")
	@CacheLookup
	WebElement selectTerms;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/home[1]/div[1]/div[1]/div[2]/div[2]/start-case-form[1]/form[1]/div[15]/button[1]")
	@CacheLookup
	WebElement submit;

	public Homepage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	public void formfill(String patientname, String email, String phone) {

		try {

					WebDriverWait wait = new WebDriverWait(ldriver, 30);
					wait.until(ExpectedConditions.visibilityOf(nameField)).sendKeys(patientname);
					logger.info("Name field entered");

					// nameField.sendKeys(patientname);
					// logger.info("Name field entered");

					wait.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(email);
					// emailField.sendKeys(email);
					logger.info("Email field entered");

					wait.until(ExpectedConditions.visibilityOf(phoneFiled)).sendKeys(phone);
					//phoneFiled.sendKeys(phone);

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void patientquery() {

		try {

	
					
					WebDriverWait wait = new WebDriverWait(ldriver, 30);
					wait.until(ExpectedConditions.visibilityOf(patientChoice)).click();
					//patientChoice.click();
					logger.info("Patient choice clicked");

					wait.until(ExpectedConditions.visibilityOf(dropOption1)).click();
					//dropOption1.click();
					logger.info("Dropodown choice clicked");

					wait.until(ExpectedConditions.visibilityOf(selectTerms)).click();
					//selectTerms.click();

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void submit() {

		try {
			        WebDriverWait wait = new WebDriverWait(ldriver, 30);
			        wait.until(ExpectedConditions.visibilityOf(submit)).click();
			        //submit.click();
					logger.info("Submit clicked");
				

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
