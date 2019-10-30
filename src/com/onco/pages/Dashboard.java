package com.onco.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.onco.testbase.BaseClass;
import org.apache.log4j.Logger;

/**
 * Locators and methods for Dsahboard page
 * We will call these locator and methods to create test cases in webtests packege
 * @author manjunathdj
 *
 */
public class Dashboard extends BaseClass {

	
	private static final Logger logger = Logger.getLogger(Dashboard.class);

	@FindBy(xpath = "/html/body/app-root/patient-dashboard-component/div[2]/div/div[2]/div/div/div[3]/div[3]/div[2]/div/div[2]/div/button")
	WebElement continuebutton;
	
    @FindBy(xpath="/html/body/app-root/app-reports/div[2]/div[1]/onboarding-nav/div/div/div[1]/ul/li[2]/a")
    WebElement reports;
    
    @FindBy(xpath="/html/body/app-root/app-reports/div[2]/div[1]/onboarding-nav/div/div/div[1]/ul/li[3]/a")
    WebElement history;
    
    @FindBy(xpath="//a[@class='logout item ng-star-inserted']")
    WebElement logout;
    
    @FindBy(xpath="1")
    WebElement deleteuser;
   
	
	public Dashboard() {
		PageFactory.initElements(driver, this);
	}
    
    public void dashboard() {
    	
    	if (logger.isDebugEnabled()) {
			logger.debug("entering dashboard()");
		}
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20000);
			wait.until(ExpectedConditions.elementToBeClickable(continuebutton));
			continuebutton.click();
			Assert.assertEquals(true, continuebutton.isDisplayed());
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting dashboard()");
		}
    } 	
    
    public void logout() {
    
    	if (logger.isDebugEnabled()) {
			logger.debug("entering logout()");
		}
		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 20000);
			wait.until(ExpectedConditions.elementToBeClickable(logout));
			logout.click();	
			Assert.assertEquals(true, logout.isDisplayed());
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting logout()");
		}
    } 	
    
    	
 }

    

    
 

  
