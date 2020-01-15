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
	private WebElement continuebutton;
	
    @FindBy(xpath="/html/body/app-root/app-reports/div[2]/div[1]/onboarding-nav/div/div/div[1]/ul/li[2]/a")
    private WebElement reports;
    
    @FindBy(xpath="/html/body/app-root/app-reports/div[2]/div[1]/onboarding-nav/div/div/div[1]/ul/li[3]/a")
    private WebElement history;
    
    @FindBy(xpath="//a[@class='logout item ng-star-inserted']")
    private WebElement logout;
    
    @FindBy(xpath="1")
    private WebElement deleteuser;
    
    @FindBy(xpath="/html[1]/body[1]/app-root[1]/patient-dashboard-component[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[3]/div[2]/div[1]/div[1]/div[1]/pricing[1]/div[1]/div[1]/div[3]/a[1]")
    private WebElement selectindiapanal;
    
    @FindBy(xpath="/html[1]/body[1]/app-root[1]/patient-dashboard-component[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[3]/div[2]/div[1]/div[2]/div[2]/button[1]")
    private WebElement proceedbutton;
   
	
	public Dashboard() {
		PageFactory.initElements(driver, this);
	}
    
  public void selectindiapanalbutton() {
    	
    	if (logger.isDebugEnabled()) {
			logger.debug("selectindiapanal dashboard()");
		}
		try {
			
			selectindiapanal.click();
			proceedbutton.click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("selectindiapanal dashboard()");
		}
    } 	
	
	
	public void dashboard() {
    	
    	if (logger.isDebugEnabled()) {
			logger.debug("entering dashboard()");
		}
		try {
			continuebutton.click();
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
			
			logout.click();	
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting logout()");
		}
    } 	
    
    	
 }

    

    
 

  
