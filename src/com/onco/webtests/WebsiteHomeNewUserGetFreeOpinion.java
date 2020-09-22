package com.onco.webtests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.onco.pages.Calendar;
import com.onco.pages.Homepage;
import com.onco.pages.Login;
import com.onco.pages.PaymentsRazorPay;
import com.onco.pages.Requestcallonco;
import com.onco.pages.Summary;
import com.onco.testbase.BaseClass;
import com.onco.misc.*;

public class WebsiteHomeNewUserGetFreeOpinion extends BaseClass {

	@Parameters({ "name", "email", "phone", "otp" })
	@Test(priority=19,description = "Website | Home| New user | Get free opinion TC_ID=C2585")
	public void NewUserSignupbookanpayatHospitalAppointmentWithFreeOpinion(String name, String email, String phone,
			String otp) throws Exception {

		Thread.sleep(20000);
		Homepage home = new Homepage(driver);
		home.getfreeopinion();
		home.cancertype();
		home.cancerstage();
		home.generalcondition();
		home.freeopinionform(name, email, phone);
		Thread.sleep(20000);

		Login login = new Login(driver);
		login.freeopinionotp(otp);
		Thread.sleep(20000);

		String actualTilte = driver.getPageSource();
		if (actualTilte.contains("Your Free Opinion")) {
			Assert.assertTrue(actualTilte.contains("Your Free Opinion"));
			WebsiteCallOncoFlowFromBannerWithoutCoupon.addResultForTestCase("2585", TEST_CASE_PASSED_STATUS, "");
		} else {
			WebsiteCallOncoFlowFromBannerWithoutCoupon.addResultForTestCase("2585", TEST_CASE_FAILED_STATUS, "");
		}
	}
}
