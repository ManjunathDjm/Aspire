package com.amazon.tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.amazon.pages.ExamDetailsPage;
import com.amazon.testbase.BaseClass;

public class TestCaseOne extends BaseClass {

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void AttempttheTestAndPayAttentionToQuestionState() throws Exception {

		ExamDetailsPage home = new ExamDetailsPage(driver);
		Thread.sleep(10000);
		home.search("electronics");
		home.inputpriceone("minprice", "maxprice");
		home.gobutton();
	    Thread.sleep(10000);

	
	}

}