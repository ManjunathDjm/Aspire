package com.onco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.onco.testbase.BaseClass;

import org.apache.bcel.generic.LoadClass;
import org.apache.log4j.Logger;

/**
 * Locators and methods for Request doctor appointment page We will call these
 * locator and methods to create test cases webtests package
 * 
 * @author manjunathdj
 *
 */
public class Requestcallonco {

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(Requestcallonco.class);

	@FindBy(xpath = "//div[contains(text(),'I need guidance on how to protect a cancer patient')]")
	@CacheLookup
	WebElement ineedguidancecheckbox;
	
	@FindBy(xpath = "//div[contains(text(),'I have specific questions on my diagnosis')]")
	@CacheLookup
	WebElement ihavespecificquestion;
	
	@FindBy(xpath = "//div[contains(text(),'I have other questions around cancer')]")
	@CacheLookup
	WebElement ihavequestionsaroundcancer;
	
	@FindBy(xpath = "//textarea[@placeholder='Type your requirements here']")
	@CacheLookup
	WebElement requirmentstextbox;
	
	@FindBy(xpath = "//html//body//app-root//req-call-onco//div//div//div//div//div[contains(text(),'BOOK APPOINTMENT')]")
	@CacheLookup
	WebElement bookappointmentbutton;
	
	
	
	
	public Requestcallonco(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	public void requestcallonco(String requirments) throws InterruptedException {

		ineedguidancecheckbox.click();
		ihavespecificquestion.click();
		ihavequestionsaroundcancer.click();
		requirmentstextbox.sendKeys(requirments);
		Thread.sleep(10000);
		bookappointmentbutton.click();
		 
	}
	}
