package com.onco.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.onco.testbase.BaseClass;

public class ReqdoctorAppointment extends BaseClass {

	
	@FindBy(xpath="//div[@class='col-md-6 col-lg-6 col-xl-6']//input[@placeholder='Select Location']")
	WebElement location;
	
    @FindBy(xpath="//div[@class='col-md-6 col-lg-6 col-xl-6']//select[@placeholder='Select Specialisation']")
    WebElement specialisation_dropdown;
    
    @FindBy(xpath="//input[@placeholder='Any specific requirements']")
    WebElement specific_test;
    
    @FindBy(xpath="//div[@class='col-md-3 col-lg-3 col-xl-3']")
    WebElement find_cancer_specialist;
    

    
	
	public ReqdoctorAppointment() {
		PageFactory.initElements(driver, this);
	}
    
    public void appointment() throws InterruptedException  {
  
    	          if(location.isDisplayed()) {
    	        	  location.click(); 
    		          location.sendKeys("Mumbai",Keys.TAB);
    		          System.out.println("location is present");
    	          }else {
    	        	  System.out.println("location is not present");
    	          }
		         
		          
		          if(specialisation_dropdown.isDisplayed()) {
		   		    Select specialisation = new Select(driver.findElement(By.xpath("//div[@class='col-md-6 col-lg-6 col-xl-6']//select[@placeholder='Select Specialisation']")));
		   		    specialisation_dropdown.click();
		   		    specialisation.selectByIndex(1);
		   		    specialisation_dropdown.click();
		   		    Thread.sleep(3000);
		   		    System.out.println("specialisation_dropdown  present");
		   		  }else {
		   		    System.out.println("specialisation_dropdown not present");
		   		  }
    }
    
		public void button() throws InterruptedException {
		   		   
		   		    if(find_cancer_specialist.isDisplayed()) {
		   		       find_cancer_specialist.click();	
		   		       try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		   			   System.out.println("find_cancer_specialist req is present");
		   		   }else {
		   			   System.out.println("find_cancer_specialist req not present");
		   			   Thread.sleep(3000);
		   		   }
		   		   
		   		
		   		}
		          
		            
		        }
			 
		
			
			
		
    	
    	
       
          
     
 
    
 
    	
    
    
    
    
    

    


  
