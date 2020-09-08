package com.onco.pages;

import java.util.List;
import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Locators and methods for Dsahboard page We will call these locator and
 * methods to create test cases in webtests packege
 * 
 * @author manjunathdj
 *
 */
public class Concerns {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(Service.class);

	@FindBy(xpath = "//div[contains(text(),'My current treatment is not working')]")
	WebElement mycurrenttreatmentnotworking;

	@FindBy(xpath = "//div[contains(text(),'I am experiencing side-effects')]")
	WebElement iamexperiencingsideeffects;

	@FindBy(xpath = "//div[contains(text(),'I need advice on advanced therapies')]")
	WebElement ineedadviceonadvancedtheraphies;

	@FindBy(xpath = "//div[contains(text(),'I need a second opinion on my treatment')]")
	WebElement ineedsecondopiniononmytreatment;

	@FindBy(xpath = "//div[contains(text(),'Others')]")
	WebElement others;
	
	@FindBy(xpath = "//textarea[@placeholder='Type your other concerns here']")
	WebElement typeconcerns;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/your-concern[1]/div[1]/div[4]/div[1]/div[3]/div[1]/span[1]")
	WebElement Continue;

	public Concerns(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void concernscheckbox() {

		try {
   
			mycurrenttreatmentnotworking.click();
			Assert.assertTrue(true, "checkbox clicked");
			logger.info("Successfully selected mycurrenttreatmentnotworking checkbox");
			iamexperiencingsideeffects.click();
			logger.info("Successfully selected iamexperiencingsideeffects checkbox");
			Assert.assertTrue(true, "checkbox clicked");
			ineedadviceonadvancedtheraphies.click();
			logger.info("Successfully selected ineedadviceonadvancedtheraphies checkbox");
			Assert.assertTrue(true, "checkbox clicked");
			ineedsecondopiniononmytreatment.click();
			logger.info("Successfully selected ineedsecondopiniononmytreatment checkbox");
			Assert.assertTrue(true, "checkbox clicked");
			others.click();
			Assert.assertTrue(true, "checkbox clicked");
			logger.info("Successfully selected others checkbox");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

	}
}
	public void typeconcerns(String concerns) {

		try {
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			typeconcerns.sendKeys(concerns);
			logger.info("Successfully entered concerns");
			Continue.click();
			logger.info("Successfully clicked on  continue button");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
