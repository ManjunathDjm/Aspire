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

public class WebsiteHomeExistingUserGetFreeOpinion extends BaseClass {

	@Parameters({ "name", "email", "phone", "otp" })
	@Test(description = "Website | Home| Existing user | Get free opinion TC_ID=C2586")
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
			WebsiteCallOncoFlowFromBannerWithoutCoupon.addResultForTestCase("2586", TEST_CASE_PASSED_STATUS, "");
		} else {
			WebsiteCallOncoFlowFromBannerWithoutCoupon.addResultForTestCase("2586", TEST_CASE_FAILED_STATUS, "");
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
