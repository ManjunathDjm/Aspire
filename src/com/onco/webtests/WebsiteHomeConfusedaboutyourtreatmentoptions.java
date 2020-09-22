package com.onco.webtests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.onco.pages.Homepage;
import com.onco.testbase.BaseClass;


public class WebsiteHomeConfusedaboutyourtreatmentoptions extends BaseClass {

	@Parameters({ "name", "email", "phone", "otp"})
	@Test(priority=17,description = "Website | Home| New user | Get free opinion TC_ID=C2597")
	public void NewUserSignupbookanpayatHospitalAppointmentWithFreeOpinion(String name,String email,String phone,String otp) throws Exception {

		Thread.sleep(20000);
		Homepage home = new Homepage(driver);
		home.talknow(name, email, phone);
		Thread.sleep(20000);
		
		String actualTilte = driver.getPageSource();
		if (actualTilte.contains("Hello & welcome to Onco.com")) {
			Assert.assertTrue(actualTilte.contains("Hello & welcome to Onco.com"));
			WebsiteCallOncoFlowFromBannerWithoutCoupon.addResultForTestCase("2597", TEST_CASE_PASSED_STATUS, "");
		} else {
			WebsiteCallOncoFlowFromBannerWithoutCoupon.addResultForTestCase("2597", TEST_CASE_FAILED_STATUS, "");
		}

	}
	
}
