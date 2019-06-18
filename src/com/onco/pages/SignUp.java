package com.onco.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.onco.testbase.BaseClass;

public class SignUp extends BaseClass{

	
	@FindBy(xpath = "/html/body/app-root/home/header-component/header[1]/div/div[2]/div/ul/li[6]")
	WebElement SignUpIcon;
	
	@FindBy(xpath="/html/body/app-root/login/div/div[2]/div[2]/a")
	WebElement SignUplink;
	
	@FindBy(xpath = "/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[1]/input")
	WebElement Name;
	
	@FindBy(xpath="/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[2]/input")
	WebElement Email;
	
	@FindBy(xpath="/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[3]/div[1]/select")
	WebElement CountryCode;

    @FindBy(xpath="/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[3]/div[2]/input")
    WebElement PhoneNumber;
    
    @FindBy(name="patientQueryId")
    WebElement PatientQuery;
    
    @FindBy(xpath="/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[5]/button")
    WebElement StartNowButton;
    
    
	public SignUp() {
		PageFactory.initElements(driver, this);
	}
	
    public String verifyHomeTitle() {
		
		return driver.getTitle();
		
	}
	
    public void SignupPage(String name,String email, String phone) throws InterruptedException  {
    	
       	if(SignUpIcon.isDisplayed()) {
          SignUpIcon.click();
   	      System.out.println("Signup icon is Present");
       	} else {
          System.out.println("Signup icon is Absent");
    		
  	
    }
    	
        if(SignUplink.isDisplayed()){	
          SignUplink.click();		
          System.out.println("Signuplink is Present");	    
	    }else {
	      System.out.println("Signuplink is Absent");
		
   }
    	
    	
        if(Name.isDisplayed()) {	
	      Name.sendKeys(name);
	      System.out.print("Name is present");
        } else {
   	      System.out.println("Name not present");
   
   }
    	
        if(Email.isDisplayed()) {
          Email.sendKeys(email);
          System.out.print("Email is present");
        } else {
   	      System.out.print("Email is absent");
   
   }
	
        if(PhoneNumber.isDisplayed()) {	 
          PhoneNumber.sendKeys(phone);
          System.out.print("Phone Number is present");
        }else {	 
          System.out.print("Phone number  is absent");
          Thread.sleep(3000);
   
   }
		
    	
		
 }
   
  
    
   public void CountryCode() throws Exception {
    	
      if(CountryCode.isDisplayed()) {
        Select countrycode = new Select(driver.findElement(By.xpath("/html/body/app-root/app-register/div/div[2]/div[1]/div/form/div[3]/div[1]/select")));
        countrycode.selectByIndex(0);
        CountryCode.click();
        System.out.print("Country code is present");
      }else {
        System.out.print("Country code not present");
        Thread.sleep(3000);
    
      
      }
   
   }

    	
    public void patientQuery() throws Exception {
    	
      if(PatientQuery.isDisplayed()) {
        Select patientquery = new Select(driver.findElement(By.name("patientQueryId")));
        patientquery.selectByIndex(1);
        PatientQuery.click();
        System.out.print("Patient Query present");
      }else {
        System.out.print("patient Query not present");
      }
      
      if(StartNowButton.isDisplayed()) {
         StartNowButton.click();
         System.out.print("Start now button present");
      }else {
         System.out.print("Start now button not present");
    	
      }
    	
    }
    
  
    }

  
