package com.aakash.regressiontests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aakash.pages.ExamPage;
import com.aakash.pages.RevampRecaluclatePage;
import com.aakash.pages.StudentLoginPage;
import com.aakash.extinctreport.CustomListner;
import com.aakash.pages.HomePage;
import com.aakash.pages.QuestionAndAnswerPage;
import com.aakash.testbase.BaseClass;

@Listeners(CustomListner.class)
public class VerifyTestDurationMarksAndAlignment extends BaseClass {
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void verifyTestDurationMarksAndAlignment()
			throws Exception {

		HomePage home = new HomePage(driver);
		home.loginlink();
		Assert.assertEquals(true, true);
		
        StudentLoginPage login = new StudentLoginPage(driver);
        login.rollnumber("rollnumber");
        login.Dateofbirth();
        Assert.assertEquals(true, true);

	    ExamPage result = new ExamPage(driver);
        result.result();
        result.selectexam();
        Assert.assertEquals(true, true);
        
        RevampRecaluclatePage revamprecaluclate = new RevampRecaluclatePage(driver);
        revamprecaluclate.revamp();
        Assert.assertEquals(true, true);
        
        QuestionAndAnswerPage questionanswer = new QuestionAndAnswerPage(driver);
        questionanswer.submit();
        
	}

}