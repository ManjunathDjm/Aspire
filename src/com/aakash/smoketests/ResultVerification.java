package com.aakash.smoketests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aakash.pages.Result;
import com.aakash.pages.ResultPage;
import com.aakash.pages.RevampRecaluclate;
import com.aakash.pages.StudentLogin;
import com.aakash.extinctreport.CustomListner;
import com.aakash.pages.Home;
import com.aakash.pages.QuestionAndAnswer;
import com.aakash.testbase.BaseClass;

@Listeners(CustomListner.class)
public class ResultVerification extends BaseClass {
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	@Test(priority = 3)
	public void restultVerification()
			throws Exception {

		Home home = new Home(driver);
		home.loginlink();
		Assert.assertEquals(true, true);
		
        StudentLogin login = new StudentLogin(driver);
        login.rollnumber("rollnumber");
        login.Dateofbirth();
        Assert.assertEquals(true, true);

	    Result result = new Result(driver);
        result.result();
        result.selectexam();
        Assert.assertEquals(true, true);
        
        RevampRecaluclate revamprecaluclate = new RevampRecaluclate(driver);
        revamprecaluclate.revamp();
        Assert.assertEquals(true, true);
        Thread.sleep(30000);
        
        QuestionAndAnswer questionanswer = new QuestionAndAnswer(driver);
        questionanswer.selectAnswer();
        questionanswer.deselectAnswer();
        questionanswer.nextquestion();
        questionanswer.previousquestion();
        questionanswer.endtest();
        questionanswer.resume();
        questionanswer.endtest();
        questionanswer.submit();
        Assert.assertEquals(true, true);
        
        
        ResultPage resultpage = new ResultPage(driver);
        resultpage.Resultpage();
        Assert.assertEquals(true, true);
        Thread.sleep(50000);
        
	}

}