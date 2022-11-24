package com.aakash.regressiontests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aakash.pages.StudentLogin;
import com.aakash.extinctreport.CustomListner;
import com.aakash.pages.Home;
import com.aakash.testbase.BaseClass;

@Listeners(CustomListner.class)
public class LoginToStudentProfile extends BaseClass {
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void loginToStudentProfile()
			throws Exception {

		Home home = new Home(driver);
		home.loginlink();
		Assert.assertEquals(true, true);
		
        StudentLogin login = new StudentLogin(driver);
        login.rollnumber("rollnumber");
        login.Dateofbirth();
        Assert.assertEquals(true, true);
	}
}