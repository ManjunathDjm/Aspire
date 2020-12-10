package com.onco.webtests;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.onco.pages.Appointment;
import com.onco.pages.Login;
import com.onco.pages.PaymentsRazorPay;
import com.onco.pages.RequestDoctorAppointment;
import com.onco.pages.SignUp;
import com.onco.pages.Summary;
import com.onco.pages.ThankYou;
import com.onco.pages.Calendar;
import com.onco.testbase.BaseClass;

public class ExistinguserFlowBookAppointment extends BaseClass {

	@Parameters({ "name", "email", "phone", "otp" })
	@Test(priority=11,description = "ExistinguserFlowBookAppointment. TC_ID=C2606")
	public void NewUserSignupbookanpayatHospitalAppointmentWithFreeOpinion(String name, String email, String phone,
			String otp) throws Exception {

		SignUp signup = new SignUp(driver);
		signup.signupicon();
		Thread.sleep(20000);

		Login login = new Login(driver);
		login.login(phone);
		Thread.sleep(20000);
		login.otpDetails(otp);
		Thread.sleep(20000);

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
		cal.date();
		cal.time();
		Thread.sleep(20000);
		
		Summary summary = new Summary(driver);
		summary.netbanking();
		Thread.sleep(20000);

		PaymentsRazorPay payment = new PaymentsRazorPay(driver);
		payment.netbanking();
		Thread.sleep(20000);

		ThankYou page = new ThankYou(driver);
		Thread.sleep(20000);

		String actualTilte = driver.getPageSource();
		if (actualTilte.contains("Your Free Opinione")) {
			Assert.assertTrue(actualTilte.contains("Your Free Opinion"));
			ExistinguserFlowBookAppointment.addResultForTestCase("2606", TEST_CASE_PASSED_STATUS, "");
		} else {
			ExistinguserFlowBookAppointment.addResultForTestCase("2606", TEST_CASE_FAILED_STATUS, "");
		}
	}

}
