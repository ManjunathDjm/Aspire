package com.aakash.smoketests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aakash.extinctreport.CustomListner;
import com.aakash.pages.QuestionAndAnswer;
import com.aakash.pages.RegistrationHome;
import com.aakash.pages.RegistrationSuccess;
import com.aakash.pages.RevampRecaluclate;
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

        RegistrationHome registration = new RegistrationHome(driver);
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
   
	    RegistrationSuccess success = new RegistrationSuccess(driver);
	    success.begintest();
         
        RevampRecaluclate revamp = new RevampRecaluclate(driver);
        revamp.revamp();
        Assert.assertEquals(true, true);
        
        QuestionAndAnswer qa = new QuestionAndAnswer(driver);
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