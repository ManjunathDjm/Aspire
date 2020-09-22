package com.onco.webtests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.onco.misc.Deletelead;
import com.onco.pages.Login;
import com.onco.pages.PatientInfo;
import com.onco.pages.SignUp;
import com.onco.pages.FreeOpinion;
import com.onco.pages.Iamconfused;
import com.onco.testbase.BaseClass;

public class ExistinguserFlowIamconfusedineedhelpingettingstartedYesiamdiagnoisedwithcancer extends BaseClass {

	@Parameters({"phone","name", "otp" })
	@Test(priority=14,description = "Existing user Flow | I am confused i need help in getting started yes i am diagnoised with cancer TC_ID=C2609")
	public void NewUserSignupbookanpayatHospitalAppointmentWithFreeOpinion( String phone,String pname,
			String otp) throws Exception {

		SignUp signup = new SignUp(driver);
		signup.signupicon();
		Thread.sleep(20000);

		Login login = new Login(driver);
		login.login(phone);
		Thread.sleep(20000);
		login.otpDetails(otp);
		Thread.sleep(20000);

		com.onco.pages.Service service = new com.onco.pages.Service(driver);
		service.iamconfused();
		Thread.sleep(20000);
		
		Iamconfused confused = new Iamconfused(driver);
		confused.iamdiagnoisedwithcancer();
		confused.getfreeopinion();
		Thread.sleep(20000);
		
		PatientInfo info = new PatientInfo(driver);
		info.patientname(pname);
		info.cancertype();
		info.cancerstage();
		info.condition();
		info.treatment();
		info.continuebutton();
		Thread.sleep(20000);
		
		FreeOpinion opinion = new FreeOpinion(driver);
		opinion.downloadopinionlink();
		Thread.sleep(20000);

		String actualTilte = driver.getPageSource();
		if (actualTilte.contains("Your Free Opinion")) {
			Assert.assertTrue(actualTilte.contains("Your Free Opinion"));
			ExistinguserFlowIamconfusedineedhelpingettingstartedYesiamdiagnoisedwithcancer.addResultForTestCase("2609", TEST_CASE_PASSED_STATUS, "");
		} else {
			ExistinguserFlowIamconfusedineedhelpingettingstartedYesiamdiagnoisedwithcancer.addResultForTestCase("2609", TEST_CASE_FAILED_STATUS, "");
		}
	}

	@AfterClass
	public void delete1() {

		try {
			Deletelead delete = new Deletelead();
			delete.delete();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
