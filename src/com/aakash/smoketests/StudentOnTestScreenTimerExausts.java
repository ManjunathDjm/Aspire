package com.aakash.smoketests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aakash.pages.ExamPage;
import com.aakash.pages.RevampRecaluclatePage;
import com.aakash.pages.StudentLoginPage;
import com.aakash.extinctreport.CustomListner;
import com.aakash.pages.HomePage;
import com.aakash.testbase.BaseClass;

@Listeners(CustomListner.class)
public class StudentOnTestScreenTimerExausts extends BaseClass {

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test(priority = 2)
	public void examTimeExaust() throws Exception {

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
		Thread.sleep(800000);
	}
}
