package com.onco.webtests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.onco.misc.Deletelead;
import com.onco.pages.Appointment;
import com.onco.pages.Login;
import com.onco.pages.PatientInfo;
import com.onco.pages.RequestDoctorAppointment;
import com.onco.pages.SignUp;
import com.onco.pages.Summary;
import com.onco.pages.ThankYou;
import com.onco.pages.Calendar;
import com.onco.pages.FreeOpinion;
import com.onco.testbase.BaseClass;

public class NewUserBookAppointmentRequestCallOnco extends BaseClass {

	@Parameters({ "name", "email", "phone", "otp"})
	@Test(priority=1,description = "New User | Book Appointment | Request call onco. TC_ID=C2582")
	public void NewUserSignupbookanpayatHospitalAppointmentWithFreeOpinion(String name, String email, String phone,
			String otp) throws Exception {

		SignUp signup = new SignUp(driver);
		signup.signupicon();
		Thread.sleep(20000);
		signup.signuppage(name, email, phone);
		signup.patientQuery();

		Login login = new Login(driver);
		login.otpDetails(otp);

		com.onco.pages.Service service = new com.onco.pages.Service(driver);
		service.appointment();
		Thread.sleep(20000);

		RequestDoctorAppointment request = new RequestDoctorAppointment(driver);
		request.requestcallonco();
	
		ThankYou page = new ThankYou(driver);
		Thread.sleep(20000);
		
		String actualTilte = driver.getPageSource();
		if (actualTilte.contains("Thank you!")) {
			Assert.assertTrue(actualTilte.contains("Thank you!"));
			NewUserBookAppointmentRequestCallOnco.addResultForTestCase("2582",
					TEST_CASE_PASSED_STATUS, "");
		} else {
			NewUserBookAppointmentRequestCallOnco.addResultForTestCase("2582",
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
