package com.onco.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.onco.testbase.BaseClass;

import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.random.Well44497b;
import org.apache.log4j.Logger;

/**
 * Locators and methods for patient info page
 * We will call these locator and methods to create test cases webtests package
 * @author manjunathdj
 *
 */
public class PatientInfo extends BaseClass{

	WebDriver ldriver;
	private static final Logger logger = Logger.getLogger(PatientInfo.class);

	@FindBy(xpath="//input[@name='patientName']")
	@CacheLookup
	private WebElement patientname;
	
	@FindBy(name ="cancerType")
	@CacheLookup
	private WebElement typeofCancer;
	
	@FindBy(name ="cancerStage")
	@CacheLookup
	private WebElement cancerStage;
	
	@FindBy(xpath="/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[2]/input")
	@CacheLookup
	private WebElement email;
	
	@FindBy(xpath="/html/body/app-root/patient-info/div/div[2]/div[2]/div/div[1]/div/div[3]/div[4]/div[2]/select")
	@CacheLookup
	private WebElement generalCondition;
	
    @FindBy(xpath="/html/body/app-root/patient-info/div[2]/div[2]/div/div[1]/div/div[3]/div[6]/div/div/div/div/div[2]/div")
    @CacheLookup
    private WebElement fileupload;
    
    @FindBy(xpath="//html/body/app-root/patient-info/div/div[2]/div[2]/div/div[1]/div/div[3]/div[7]")
    @CacheLookup
    private WebElement continueButton;
    
    
    
public PatientInfo(WebDriver rdriver) {
	    ldriver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
    public void patientname(String pname) {
    	
    	try {
    		
    		
    		logger.info(patientname.isDisplayed());
    		patientname.sendKeys(pname);
    		
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
	
public void patientinfo() {
    	
			
	     try {
	            
	    	    logger.info(typeofCancer.isDisplayed());
	    	    Select TypeofCancer = new Select(driver.findElement(By.name("cancerType")));
			    TypeofCancer.selectByIndex(1);
			    typeofCancer.click();
			    
			    logger.info(cancerStage.isDisplayed());
			    Select Cancerstage = new Select(driver.findElement(By.name("cancerStage")));
			    Cancerstage.selectByIndex(1);
			    cancerStage.click();
			    
			    logger.info(generalCondition.isDisplayed());
			    Select Condition = new Select(driver.findElement(By.name("condition")));
			    Condition.selectByIndex(1);
		        generalCondition.click();
		  
		        logger.info(continueButton.isDisplayed());
		        continueButton.click();
		        
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			} 
			
			}
        
   }

