package com.aakash.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/**
 * Locators and methods for Revamp Recaluclate page We will call these locator
 * and methods to create test cases in webtests packege
 *
 * @author manjunathdj
 *
 */

public class RevampRecaluclate {

	WebDriver ldriver;

	private static final Logger logger = Logger.getLogger(RevampRecaluclate.class);

	@FindBy(xpath = "(//div[@class='button btn_class2'])[1]")
	WebElement StartTest;

	@FindBy(xpath = "(//div[@class='button btn_class2'])[1]")
	WebElement Resumetest;
	

	public RevampRecaluclate(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	public void revamp() throws Exception {

		Dimension size = ldriver.manage().window().getSize();
		System.out.println("The size of the window : " + size);
		Reporter.log("Set browser to full size");
		ArrayList<String> tabs = new ArrayList<String>(ldriver.getWindowHandles());
		ldriver.switchTo().window(tabs.get(1));
		Reporter.log("Switched to revamp recaluclate tab");
		StartTest.click();
		StartTest.isDisplayed();
		Reporter.log("clicked on start test button");
		WebElement n = ldriver.findElement(By.tagName("body"));
		System.out.println("Text content: " + n.getText());
		Reporter.log("Getting page text");

	}
	
}