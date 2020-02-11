package com.onco.webtests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.onco.pages.Appointment;
import com.onco.pages.Dashboard;
import com.onco.pages.Homepage;
import com.onco.pages.Login;
import com.onco.pages.PatientInfo;
import com.onco.pages.PaymentsRazorPay;
import com.onco.pages.RequestDoctorAppointment;
import com.onco.pages.Service;
import com.onco.pages.Summary;
import com.onco.testbase.BaseClass;

public class ExistingUserBookAppointment extends BaseClass {

	@Parameters({ "name", "email", "phone", "patientname", "otp" })
	@Test
	public void existingUserBookAppointment(String name, String email, String phone, String patientname, String otp)
			throws Exception {

		Homepage home = new Homepage(driver);
		home.formfill(name, email, phone);
		home.patientquery();
		home.submit();

		Thread.sleep(3000);
		Login login = new Login(driver);
		login.login(phone);
		login.otpDetails(otp);

		Dashboard dashboard = new Dashboard(driver);
		dashboard.dashboard();

		PatientInfo info = new PatientInfo(driver);
		info.patientname(patientname);
		info.cancertype();
		info.cancerstage();
		info.condition();
		info.continuebutton();

		Service service = new Service(driver);
		service.appointment();

		RequestDoctorAppointment appointment = new RequestDoctorAppointment(driver);
		appointment.appointment();
		appointment.radiationOncologist();
		appointment.button();

		Appointment app = new Appointment(driver);
		app.appointment();

		Summary summary = new Summary(driver);
		summary.summary();

		PaymentsRazorPay pay = new PaymentsRazorPay(driver);
		pay.netbanking();

	}
}
