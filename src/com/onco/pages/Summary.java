package com.onco.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.onco.testbase.BaseClass;

public class Summary extends BaseClass {

	
	@FindBy(xpath="/html/body/app-root/case-summary/div[2]/div/section/div[2]/div[1]/payment-summary/div[1]/div/div[1]/div/div[1]/input")
	WebElement couponcode;
	
    @FindBy(xpath="/html/body/app-root/case-summary/div[2]/div/section/div[2]/div[1]/payment-summary/div[1]/div/div[4]/label/span")
    WebElement checkbox;
    
    @FindBy(xpath="/html/body/app-root/case-summary/div[2]/div/section/div[2]/div[1]/payment-summary/div[1]/div/div[5]/button")
    WebElement paynow;
    
    @FindBy(xpath="//div[@class='dashboard-container']//a[2]")
    WebElement delete;
    
	
	public Summary() {
		PageFactory.initElements(driver, this);
	}
    
    public void summary() throws InterruptedException  {
    	
    	if(paynow.isDisplayed()) {
    		paynow.click();
    		Thread.sleep(3000);
    		System.out.println("pay at hosptial button present");
    	}else {
    		System.out.println("pay at hotel button not present");
    		delete.click();
    		Thread.sleep(3000);
    	}
    	
    	
    	
    
    }
    

    
    }

  
