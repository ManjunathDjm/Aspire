package com.onco.webtests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.onco.misc.Deletelead;
import com.onco.pages.Calendar;
import com.onco.pages.Login;
import com.onco.pages.PaymentsRazorPay;
import com.onco.pages.Requestcallonco;
import com.onco.pages.SignUp;
import com.onco.pages.Summary;
import com.onco.pages.ThankYou;
import com.onco.testbase.BaseClass;

public class NewUserUPIpaymentIWantToTalkToOncologist extends BaseClass {

	@Parameters({ "name", "email", "phone", "otp","requirments" })
	@Test(priority=11,description = "New user | I want to talk to an Oncologist without coupon. TC_ID=C3073")
	public void NewUserSignupbookanpayatHospitalAppointmentWithFreeOpinion(String name, String email, String phone,
			String otp, String requirments) throws Exception {

		SignUp signup = new SignUp(driver);
		signup.signupicon();
		Thread.sleep(20000);
		signup.signuppage(name, email, phone);
		signup.patientQuery();
		Thread.sleep(20000);

		Login login = new Login(driver);
		login.otpDetails(otp);
		Thread.sleep(20000);

		com.onco.pages.Service service = new com.onco.pages.Service(driver);
		service.iwanttotalktoanoncologist();
		Thread.sleep(20000);

		Requestcallonco callonco = new Requestcallonco(driver);
		callonco.selectdate();
		
		Calendar cal = new Calendar(driver);
	    cal.calloncotime();
		Thread.sleep(20000);

		callonco.requestcallonco(requirments);
		Thread.sleep(20000);

		Summary summary = new Summary(driver);
		summary.upi();
		Thread.sleep(20000);

		String actualTilte = driver.getPageSource();
		if (actualTilte.contains("netdox@icici")) {
			Assert.assertTrue(actualTilte.contains("netdox@icici"));
			NewUserUPIpaymentIWantToTalkToOncologist.addResultForTestCase("3073", TEST_CASE_PASSED_STATUS, "");
		} else {
			NewUserUPIpaymentIWantToTalkToOncologist.addResultForTestCase("3073", TEST_CASE_FAILED_STATUS, "");
		}

	}
}
