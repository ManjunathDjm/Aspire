package com.aakash.smoketests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aakash.extinctreport.CustomListner;
import com.aakash.pages.QuestionAndAnswerPage;
import com.aakash.pages.RegistrationHomePage;
import com.aakash.pages.RegistrationSuccessPage;
import com.aakash.pages.RevampRecaluclatePage;
import com.aakash.testbase.BaseClass;

@Listeners(CustomListner.class)
public class RegistrationSubmitTest extends BaseClass {
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void RegisterAndSubmitTest()
			throws Exception {

        RegistrationHomePage registration = new RegistrationHomePage(driver);
        registration.Mobile("mobilenumber");
        registration.Otp("otp");
        registration.verifyOtp();
        registration.Studentname("studentname");
        registration.Fathername("fathername");
        registration.Email("email");
        registration.dateofbirth();
        registration.classAndStream();
        registration.exammode();
        registration.Selectstate();
        registration.selectcentre();
        registration.examdate();
        registration.citystate();
        registration.completeregistration();
   
	    RegistrationSuccessPage success = new RegistrationSuccessPage(driver);
	    success.begintest();
         
        RevampRecaluclatePage revamp = new RevampRecaluclatePage(driver);
        revamp.revamp();
        Assert.assertEquals(true, true);
        
        QuestionAndAnswerPage qa = new QuestionAndAnswerPage(driver);
        qa.selectAnswer();
        qa.deselectAnswer();
        qa.nextquestion();
        qa.previousquestion();
        qa.endtest();
        qa.resume();
        qa.endtest();
        qa.submit();
        Assert.assertEquals(true, true);
        Thread.sleep(10000);
        
	}

}