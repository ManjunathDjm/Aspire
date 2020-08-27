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
import com.onco.pages.RequestDoctorAppointment;
import com.onco.pages.SignUp;
import com.onco.pages.Summary;
import com.onco.pages.Calendar;
import com.onco.testbase.BaseClass;

public class NewUserSignupPaytmBookOnPriorityAppointment extends BaseClass {

	@Parameters({ "name", "email", "phone", "otp", "pname" })
	@Test(description = "New User Signup| Paytm|Book on priority appointment. TC_ID=C3074")
	public void NewUserSignupbookanpayatHospitalAppointmentWithFreeOpinion(String name, String email, String phone,
			String otp, String pname) throws Exception {

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
		request.appointment();
		request.surgicalOncologist();
		request.button();
		Thread.sleep(20000);

		Appointment appointment = new Appointment(driver);
		appointment.bookonpriority();
		Thread.sleep(20000);

		Calendar cal = new Calendar(driver);
		cal.prefereddatetime();
		Thread.sleep(20000);

		Summary summary = new Summary(driver);
		summary.paytm();
		Thread.sleep(20000);

		String actualTilte = driver.getPageSource();
		if (actualTilte.contains("Scan QR code")) {
			Assert.assertTrue(actualTilte.contains("Scan QR code"));
			NewUserSignupPaytmBookOnPriorityAppointment.addResultForTestCase("3074", TEST_CASE_PASSED_STATUS, "");
		} else {
			NewUserSignupPaytmBookOnPriorityAppointment.addResultForTestCase("3074", TEST_CASE_FAILED_STATUS, "");
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
