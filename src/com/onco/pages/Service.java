package com.onco.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.onco.testbase.BaseClass;

public class Service extends BaseClass {

	
	@FindBy(xpath="//div[@class='row']//div[1]//div[1]//div[2]")
	WebElement appointment;
	
    @FindBy(xpath="/html/body/app-root/select-service/div[2]/div[2]/section/div[3]/section/div/div/div[2]/div/div[2]")
    WebElement opinion;
    
    @FindBy(xpath="/html/body/app-root/select-service/div[2]/div[2]/section/div[3]/section/div/div/div[3]/div/div[2]")
    WebElement labtest;
    
    @FindBy(xpath="//div[@class='row']//button[@class='close']")
    WebElement initial_assessment_close;
    
   
	public Service() {
		PageFactory.initElements(driver, this);
	}
    
    public void appointment() throws InterruptedException  {
    
    	
    	Thread.sleep(3000);
        if(appointment.isDisplayed()) {
        	appointment.click();
        	Thread.sleep(3000);
    	   System.out.println("appointemnt button is displayed");
        }else {
           System.out.println("appointment button is not displayed");
         
        }
    }
     
   public void opinion()throws InterruptedException {
   
        if(opinion.isDisplayed()) {
           opinion.click();
           System.out.println("opinion is displayed");
        }else {
           System.out.println("opinion is not displayed");
           Thread.sleep(3000);
        }
   }
      
   public void labtest()throws InterruptedException { 
	   
   
        if(labtest.isDisplayed()) {
        	labtest.click();
        	System.out.println("labtest button is preseent");
        }else {
        	System.out.println("labtest button is not present");
        	Thread.sleep(3000);
        }
   }
  
	   
	   
   }
     
    	
    	
  
    

    
   

  
