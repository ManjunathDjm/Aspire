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
    	
    	if(PatientName.isDisplayed()) {
    		PatientName.sendKeys(patientname);
    		System.out.print("Patient name present");
    	}else {
    		System.out.print("patient name not present");
    		
    	}
		
    	if(typeofcancer.isDisplayed()) {
		   Select TypeofCancer = new Select(driver.findElement(By.name("cancerType")));
		   TypeofCancer.selectByIndex(1);
		   typeofcancer.click();
		   System.out.println("Cancer type dropdown present");
		}else {
		   System.out.println("Cancer type dropdown not present");
		}
		
		if(cancerstage.isDisplayed()) {
		  Select Cancerstage = new Select(driver.findElement(By.name("cancerStage")));
		  Cancerstage.selectByIndex(1);
		  cancerstage.click();
		  System.out.println("cancer stage dropdown present");
		}else {
		  System.out.print("Cancer stage dropdown not present");
		}
		
		if(generalcondition.isDisplayed()) {
		  Select Condition = new Select(driver.findElement(By.name("condition")));
		  Condition.selectByIndex(2);
	      generalcondition.click();
	      System.out.println("General condition dropdown present");
		}else {
		  System.out.println("General condition dropdown not present");
		}
		
		if(Continuebutton.isDisplayed()) {
		   Continuebutton.click();
		   System.out.println("Continue button present");
		}
		else {
		   System.out.println("Continue button not present");
		   Thread.sleep(3000);
		}
		
   }
  
    
    
}
    
    	
   

    
  
   

  
