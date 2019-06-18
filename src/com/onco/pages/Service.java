package com.onco.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.onco.testbase.BaseClass;

public class Service extends BaseClass {

	
	@FindBy(xpath="/html/body/app-root/select-service/div[2]/div[2]/section/div[3]/section/div/div/div[1]/div/div[2]")
	WebElement appointment;
	
    @FindBy(xpath="/html/body/app-root/select-service/div[2]/div[2]/section/div[3]/section/div/div/div[2]/div/div[2]")
    WebElement opinion;
    
    @FindBy(xpath="/html/body/app-root/select-service/div[2]/div[2]/section/div[3]/section/div/div/div[3]/div/div[2]")
    WebElement labtest;
  
   
	
	public Service() {
		PageFactory.initElements(driver, this);
	}
    
    public void service() throws InterruptedException  {
    	
        appointment.click();
        opinion.click();
        labtest.click();
        
     
    	
    	
    }
    

    
    }

  
