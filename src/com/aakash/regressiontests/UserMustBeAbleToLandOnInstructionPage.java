package com.aakash.regressiontests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aakash.pages.Home;
import com.aakash.pages.Result;
import com.aakash.pages.RevampRecaluclate;
import com.aakash.pages.StudentLogin;
import com.aakash.testbase.BaseClass;

public class UserMustBeAbleToLandOnInstructionPage extends BaseClass{
	

		@AfterMethod
		public void teardown() {
			driver.quit();
		}

		@Test(priority = 4)
		public void AttempttheTestAndPayAttentionToQuestionState() throws Exception {

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

			RevampRecaluclate revamp = new RevampRecaluclate(driver);
			revamp.revamp();
			Assert.assertEquals(true, true);

			

		}

	}

