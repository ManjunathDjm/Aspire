package com.onco.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.onco.testbase.BaseClass;

public class PatientInfo extends BaseClass{


	
	@FindBy(name = "patientName")
	WebElement PatientName;
	
	@FindBy(xpath="/html/body/app-root/patient-info/div[2]/div[2]/div/div[1]/div/div[3]/div[2]/div[2]/select")
	WebElement typeofcancer;
	
	@FindBy(xpath = "/html/body/app-root/patient-info/div[2]/div[2]/div/div[1]/div/div[3]/div[3]/div[2]/select")
	WebElement cancerstage;
	
	@FindBy(xpath="/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[2]/input")
	WebElement Email;
	
	@FindBy(xpath="/html/body/app-root/patient-info/div[2]/div[2]/div/div[1]/div/div[3]/div[4]/div[2]/select")
	WebElement generalcondition;

	
    @FindBy(xpath="/html/body/app-root/patient-info/div[2]/div[2]/div/div[1]/div/div[3]/div[6]/div/div/div/div/div[2]/div")
    WebElement Fileupload;
    
    @FindBy(xpath="/html/body/app-root/patient-info/div[2]/div[2]/div/div[1]/div/div[3]/div[7]")
    WebElement Continuebutton;
    
    
	public PatientInfo() {
		PageFactory.initElements(driver, this);
	}
	
    public String verifyHomeTitle() {
		
		return driver.getTitle();
		
	}
	
    public void patientInfo(String patientname) throws InterruptedException  {
    	
    	
		PatientName.sendKeys(patientname);
		
		Select TypeofCancer = new Select(driver.findElement(By.name("cancerType")));
		TypeofCancer.selectByIndex(0);
		typeofcancer.click();
		
		Select Cancerstage = new Select(driver.findElement(By.name("cancerStage")));
		Cancerstage.selectByIndex(0);
		cancerstage.click();
		
		Select Condition = new Select(driver.findElement(By.name("condition")));
		Condition.selectByIndex(0);
		generalcondition.click();
		
		Continuebutton.click();
    	Thread.sleep(3000);
		
		
    }
  
    
    }
    
    	
   

    
  
   

  
