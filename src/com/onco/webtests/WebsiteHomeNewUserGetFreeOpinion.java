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
	
	@Parameters({ "name", "email", "phone", "otp"})
	@Test(description = "Website | Home| New user | Get free opinion TC_ID=C2585")
	public void NewUserSignupbookanpayatHospitalAppointmentWithFreeOpinion(String name, String email, String phone,
			String otp) throws Exception {
		
		Thread.sleep(20000);
		Homepage home = new Homepage(driver);
		home.getfreeopinion();
		home.cancertype();
		home.cancerstage();
		home.generalcondition();
		home.formfill(name, email, phone);
        Thread.sleep(20000);	
             
		String actualTilte = driver.getPageSource();
		if (actualTilte.contains("Thank you!")) {
			Assert.assertTrue(actualTilte.contains("Thank you!"));
			WebsiteHomeNewUserGetFreeOpinion.addResultForTestCase("2585",
					TEST_CASE_PASSED_STATUS, "");
		} else {
			WebsiteHomeNewUserGetFreeOpinion.addResultForTestCase("2585",
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
