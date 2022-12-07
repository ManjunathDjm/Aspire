package com.amazon.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.amazon.pages.AmazonPage;
import com.amazon.testbase.BaseClass;

public class TestCaseTwo extends BaseClass {

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test(priority = 2)
	public void Testcasetwo() throws Exception {

		AmazonPage home = new AmazonPage(driver);
		Thread.sleep(10000);
		home.search("electronics");
		home.inputpricetwo("minimum", "maximum");
		home.gobutton();
		Thread.sleep(10000);
        home.sortby();
        Thread.sleep(10000);
	
	}

}
