package com.onco.webtests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.onco.misc.Deletelead;
import com.onco.pages.Appointment;
import com.onco.pages.Login;
import com.onco.pages.PaymentsRazorPay;
import com.onco.pages.RequestDoctorAppointment;
import com.onco.pages.SignUp;
import com.onco.pages.Summary;
import com.onco.pages.ThankYou;
import com.onco.pages.Calendar;
import com.onco.pages.Iamconfused;
import com.onco.testbase.BaseClass;

public class ExistinguserFlowIamconfusedineedhelpingettingstartedNoiamExperiencingsymptoms extends BaseClass {

	@Parameters({"phone", "otp" })
	@Test(description = "ExistinguserFlowBookAppointment. TC_ID=C2607")
	public void NewUserSignupbookanpayatHospitalAppointmentWithFreeOpinion( String phone,
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
		confused.iamexperiencingsymptoms();
		confused.requestcallback();
		Thread.sleep(20000);

		String actualTilte = driver.getPageSource();
		if (actualTilte.contains("Thank you!")) {
			Assert.assertTrue(actualTilte.contains("Thank you!"));
			ExistinguserFlowIamconfusedineedhelpingettingstartedNoiamExperiencingsymptoms.addResultForTestCase("2607", TEST_CASE_PASSED_STATUS, "");
		} else {
			ExistinguserFlowIamconfusedineedhelpingettingstartedNoiamExperiencingsymptoms.addResultForTestCase("2607", TEST_CASE_FAILED_STATUS, "");
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
