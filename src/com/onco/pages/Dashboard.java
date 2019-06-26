package com.onco.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.onco.testbase.BaseClass;

public class Dashboard extends BaseClass {

	
	@FindBy(xpath="/html/body/app-root/patient-dashboard-component/div[2]/div/div[2]/div/div/div[6]/div[3]/div[2]/div/div[2]/div")
	WebElement continuebutton;
	
    @FindBy(xpath="/html/body/app-root/app-reports/div[2]/div[1]/onboarding-nav/div/div/div[1]/ul/li[2]/a")
    WebElement reports;
    
    @FindBy(xpath="/html/body/app-root/app-reports/div[2]/div[1]/onboarding-nav/div/div/div[1]/ul/li[3]/a")
    WebElement history;
   
    
	
	public Dashboard() {
		PageFactory.initElements(driver, this);
	}
    
    public void dashboard() throws InterruptedException  {
    	
    	continuebutton.click();
    	Thread.sleep(3000);
    	
    	
    	
    	
    	
    	
    
    }
    

    
    }

  
