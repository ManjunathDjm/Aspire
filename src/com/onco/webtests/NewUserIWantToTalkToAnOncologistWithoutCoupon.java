package com.onco.webtests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.onco.pages.Calendar;
import com.onco.pages.Concerns;
import com.onco.pages.FreeOpinion;
import com.onco.pages.Login;
import com.onco.pages.OpinionType;
import com.onco.pages.PatientInfo;
import com.onco.pages.PaymentsRazorPay;
import com.onco.pages.SignUp;
import com.onco.pages.Summary;
import com.onco.pages.Thankyoupanel;
import com.onco.testbase.BaseClass;

public class NewUserIWantToTalkToAnOncologistWithoutCoupon extends BaseClass {

	@Parameters({ "name", "email", "phone", "otp", "pname", "concerns" })
	@Test(description = "New User Opinion| I need an online opinion for cancer treatment -India panel. TC_ID=C2578")
	public void NewUserSignupbookanpayatHospitalAppointmentWithFreeOpinion(String name, String email, String phone,
			String otp, String pname, String concerns) throws Exception {

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

		Calendar calendar = new Calendar(driver);
		calendar.prefereddatetime();
        calendar.dayone();


		String actualTilte = driver.getPageSource();
		if (actualTilte.contains("Your best chance to fight Cancer")) {
			Assert.assertTrue(actualTilte.contains("Your best chance to fight Cancer"));
			NewUserIWantToTalkToAnOncologistWithoutCoupon.addResultForTestCase("2578",
					TEST_CASE_PASSED_STATUS, "");
		} else {
			NewUserIWantToTalkToAnOncologistWithoutCoupon.addResultForTestCase("2578",
					TEST_CASE_FAILED_STATUS, "");
		}

	}

}
