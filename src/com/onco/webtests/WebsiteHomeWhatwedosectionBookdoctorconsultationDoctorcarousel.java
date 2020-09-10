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

public class WebsiteHomeWhatwedosectionBookdoctorconsultationDoctorcarousel extends BaseClass {

	@Parameters({ "name", "email", "phone", "otp" })
	@Test(description = "	Website | Home | What we do section | Book doctor consultations -Doctor carouselTC_ID=C2591")
	public void NewUserSignupbookanpayatHospitalAppointmentWithFreeOpinion(String name, String email, String phone,
			String otp) throws Exception {

		Thread.sleep(20000);
		Homepage home = new Homepage(driver);
	    home.doctorconsultationtab();
		Thread.sleep(20000);
		
		String actualTilte = driver.getPageSource();
		if (actualTilte.contains("Connect to 1500+ Cancer")) {
			Assert.assertTrue(actualTilte.contains("Connect to 1500+ Cancer"));
			WebsiteCallOncoFlowFromBannerWithoutCoupon.addResultForTestCase("2591", TEST_CASE_PASSED_STATUS, "");
		} else {
			WebsiteCallOncoFlowFromBannerWithoutCoupon.addResultForTestCase("2591", TEST_CASE_FAILED_STATUS, "");
		}

	}
	}

