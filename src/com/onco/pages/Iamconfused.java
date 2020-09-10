
package com.onco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.net.io.FromNetASCIIOutputStream;
import org.apache.log4j.Logger;

/**
 * Locators and methods for Login page We will call these locator and methods to
 * create test cases in webtests package
 * 
 * @author manjunathdj
 *
 */
public class Iamconfused {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(Iamconfused.class);

	@FindBy(name = "/html/body/app-root/confused/div/div[3]/div[1]/div[1]/div[2]")
	WebElement noiamexperiencingsymptoms;
	
	@FindBy(name = "/html[1]/body[1]/app-root[1]/confused[1]/div[1]/div[3]/div[1]/div[1]/div[3]/img[1]")
	WebElement yesiamiagnoisedwithcancer;

	public Iamconfused(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void iamexperiencingsymptoms() {

		try {
         noiamexperiencingsymptoms.click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		
	}
	public void iamdiagnoisedwithcancer () {
	   try {
		yesiamiagnoisedwithcancer.click(); 
	   }catch (NoSuchElementException e) {
		}		
	}
}