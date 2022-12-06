package com.amazon.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.amazon.pages.ExamDetailsPage;
import com.amazon.testbase.BaseClass;

public class TestCaseTwo extends BaseClass {

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test(priority = 2)
	public void AttempttheTestAndPayAttentionToQuestionState() throws Exception {

		ExamDetailsPage home = new ExamDetailsPage(driver);
		Thread.sleep(10000);
		home.search("electronics");
		home.inputpricetwo("minimum", "maximum");
		home.gobutton();
		Thread.sleep(10000);
        home.sortby();
        Thread.sleep(10000);
	
	}

}
