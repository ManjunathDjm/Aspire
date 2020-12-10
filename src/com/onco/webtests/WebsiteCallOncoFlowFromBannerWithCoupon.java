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

public class WebsiteCallOncoFlowFromBannerWithCoupon extends BaseClass {
	
	@Parameters({ "name", "email", "phone", "otp","requirments"})
	@Test(priority=15,description = "Website | Call onco flow from banner with coupon. TC_ID=C2584")
	public void NewUserSignupbookanpayatHospitalAppointmentWithFreeOpinion(String name, String email, String phone,
			String otp, String requirments) throws Exception {
		
		Thread.sleep(20000);
		Homepage home = new Homepage(driver);
		home.bannar();
		home.formfill(name, email, phone);
        Thread.sleep(20000);		

		Login login = new Login(driver);
		login.formotp(otp);
		Thread.sleep(20000);
		
		Requestcallonco callonco = new Requestcallonco(driver);
		callonco.selectdate();
		
		Calendar cal = new Calendar(driver);
	    cal.calloncotime();
		Thread.sleep(20000);

		callonco.requestcallonco(requirments);
		Thread.sleep(20000);

		Summary summary = new Summary(driver);
		summary.netbanking();
		Thread.sleep(20000);
		
		PaymentsRazorPay payment = new PaymentsRazorPay(driver);
		payment.netbanking();
		Thread.sleep(20000);

		String actualTilte = driver.getPageSource();
		if (actualTilte.contains("Thank you!")) {
			Assert.assertTrue(actualTilte.contains("Thank you!"));
			WebsiteCallOncoFlowFromBannerWithCoupon.addResultForTestCase("2584",
					TEST_CASE_PASSED_STATUS, "");
		} else {
			WebsiteCallOncoFlowFromBannerWithCoupon.addResultForTestCase("2584",
					TEST_CASE_FAILED_STATUS, "");
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
