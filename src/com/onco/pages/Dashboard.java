package com.onco.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.onco.testbase.BaseClass;
import org.apache.log4j.Logger;

/**
 * Locators and methods for Dsahboard page
 * @author manjunathdj
 *
 */
public class Dashboard extends BaseClass {

	
	private static final Logger logger = Logger.getLogger(Dashboard.class);

	@FindBy(xpath="/html/body/app-root/patient-dashboard-component/div[2]/div/div[2]/div/div/div[6]/div[3]/div[2]/div/div[2]/div")
	WebElement continuebutton;
	
    @FindBy(xpath="/html/body/app-root/app-reports/div[2]/div[1]/onboarding-nav/div/div/div[1]/ul/li[2]/a")
    WebElement reports;
    
    @FindBy(xpath="/html/body/app-root/app-reports/div[2]/div[1]/onboarding-nav/div/div/div[1]/ul/li[3]/a")
    WebElement history;
    
    @FindBy(xpath="//a[@class='logout item ng-star-inserted']")
    WebElement logout;
   
    
	
	public Dashboard() {
		PageFactory.initElements(driver, this);
	}
    
    public void Dashboard()   {
    	
    	if (logger.isDebugEnabled()) {
			logger.debug("entering dashboard()");
		}
		try {
    		continuebutton.click();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting dashboard()");
		}
    } 	
    
    public void Logout() {
    
    	if (logger.isDebugEnabled()) {
			logger.debug("entering logout()");
		}
		try {
    		logout.click();	
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting logout()");
		}
    }
    	
    
}
    

    
 

  
