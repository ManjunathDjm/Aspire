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

public class WebsiteHomeWhatWeDoSectionGetthebesttreatmentoptions extends BaseClass {

	@Test(priority=22,description = "Website | Home | What we do section | Get the best treatment options - Click on download sample reportTC_ID=C2590")
	public void NewUserSignupbookanpayatHospitalAppointmentWithFreeOpinion(
			) throws Exception {

		Thread.sleep(20000);
		Homepage home = new Homepage(driver);
	    home.samplereport();
		Thread.sleep(20000);

		String actualTilte = driver.getPageSource();
		if (actualTilte.contains("Download a sample report")) {
			Assert.assertTrue(actualTilte.contains("Download a sample report"));
			WebsiteCallOncoFlowFromBannerWithoutCoupon.addResultForTestCase("2590", TEST_CASE_PASSED_STATUS, "");
		} else {
			WebsiteCallOncoFlowFromBannerWithoutCoupon.addResultForTestCase("2590", TEST_CASE_FAILED_STATUS, "");
		}
	}
}
