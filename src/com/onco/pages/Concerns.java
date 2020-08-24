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
	@CacheLookup
	WebElement mycurrenttreatmentnotworking;

	@FindBy(xpath = "//div[contains(text(),'I am experiencing side-effects')]")
	@CacheLookup
	WebElement iamexperiencingsideeffects;

	@FindBy(xpath = "//div[contains(text(),'I need advice on advanced therapies')]")
	@CacheLookup
	WebElement ineedadviceonadvancedtheraphies;

	@FindBy(xpath = "//div[contains(text(),'I need a second opinion on my treatment')]")
	@CacheLookup
	WebElement ineedsecondopiniononmytreatment;

	@FindBy(xpath = "//div[contains(text(),'Others')]")
	@CacheLookup
	WebElement others;
	
	@FindBy(xpath = "//textarea[@placeholder='Type your other concerns here']")
	@CacheLookup
	WebElement typeconcerns;
	
	@FindBy(xpath = "//html//body//app-root//your-concern//div//div//div//div//div[contains(text(),'CONTINUE')]")
	@CacheLookup
	WebElement Continue;

	public Concerns(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void concernscheckbox() {

		try {
   
			mycurrenttreatmentnotworking.click();
			Assert.assertTrue(true, "checkbox clicked");
			iamexperiencingsideeffects.click();
			Assert.assertTrue(true, "checkbox clicked");
			ineedadviceonadvancedtheraphies.click();
			Assert.assertTrue(true, "checkbox clicked");
			ineedsecondopiniononmytreatment.click();
			Assert.assertTrue(true, "checkbox clicked");
			others.click();
			Assert.assertTrue(true, "checkbox clicked");
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
			Continue.click();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
