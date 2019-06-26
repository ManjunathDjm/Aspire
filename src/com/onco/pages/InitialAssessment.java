package com.onco.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.onco.testbase.BaseClass;

public class InitialAssessment extends BaseClass {

    
    @FindBy(xpath="/html[1]/body[1]/app-root[1]/select-service[1]/initial-assessment-modal[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
    WebElement initial_assessment_close;
    
    @FindBy(partialLinkText = "VIEW ASSESSME")
    WebElement view_assessment;
    
    @FindBy(xpath="//div[@class='download-assessment cursor-pointer']")
    WebElement download_assessment;
    
  
   
  public InitialAssessment() {
		PageFactory.initElements(driver, this);
	
	}
       
   public void initial_assessment_close() throws InterruptedException {
	   
	   Thread.sleep(3000);
	   driver.switchTo().defaultContent();
	   initial_assessment_close.click();
	  
	   
   }
   
   public void view_assessment() throws InterruptedException {
	   
	    if(view_assessment.isDisplayed()) {
	    	view_assessment.click();
	    	System.out.println("view assessment present");
	    }else {
	    	 System.out.println("view assessment not present");
	    	 Thread.sleep(3000);
	    }
   }
	 
   public void download_assessment() throws InterruptedException {
	   
	   if(download_assessment.isDisplayed()) {
		   download_assessment.click();
	   }else {
		   System.out.println("download assessment not present");
		   Thread.sleep(3000);
	   }
	 
	  
   }
     
    	
    	
    }
    

    
   

  
