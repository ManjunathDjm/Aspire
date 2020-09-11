package com.onco.webtests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.onco.pages.Homepage;
import com.onco.testbase.BaseClass;
import com.onco.misc.*;

public class WebsiteHomeWhatwedosectionGetthebesttreatmentoptionsclickonseepricing extends BaseClass {

	@Test(description = "Website | Home | What we do section | Get the best treatment options - Click on download sample reportTC_ID=C2589")
	public void NewUserSignupbookanpayatHospitalAppointmentWithFreeOpinion() throws Exception {

		Thread.sleep(20000);
		Homepage home = new Homepage(driver);
		home.seepricing();
		Thread.sleep(20000);

		String actualTilte = driver.getPageSource();
		if (actualTilte.contains("Online Opinion")) {
			Assert.assertTrue(actualTilte.contains("Online Opinion"));
			WebsiteCallOncoFlowFromBannerWithoutCoupon.addResultForTestCase("2589", TEST_CASE_PASSED_STATUS, "");
		} else {
			WebsiteCallOncoFlowFromBannerWithoutCoupon.addResultForTestCase("2589", TEST_CASE_FAILED_STATUS, "");
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
