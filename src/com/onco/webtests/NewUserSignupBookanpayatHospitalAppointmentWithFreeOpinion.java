package com.onco.webtests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.onco.pages.Appointment;
import com.onco.pages.Login;
import com.onco.pages.PatientInfo;
import com.onco.pages.RequestDoctorAppointment;
import com.onco.pages.SignUp;
import com.onco.pages.Summary;
import com.onco.pages.ThankYou;
import com.onco.pages.Calendar;
import com.onco.testbase.BaseClass;

public class NewUserSignupBookanpayatHospitalAppointmentWithFreeOpinion extends BaseClass {

	@Parameters({ "name", "email", "phone","otp","pname" })
	@Test
	public void NewUserSignupbookanpayatHospitalAppointmentWithFreeOpinion(String name, String email, String phone,String otp, String pname) throws Exception {

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
    appointment.appointment();
    Thread.sleep(20000);
    
    Calendar cal = new Calendar(driver);
    cal.dayone();
    Thread.sleep(20000);
    
    Summary summary = new Summary(driver);
    summary.summary();
    Thread.sleep(20000);
    
    ThankYou page = new ThankYou(driver);
    page.getnow();
    Thread.sleep(20000);
    
    PatientInfo info = new PatientInfo(driver);
    info.patientname(pname);
    info.cancertype();
    info.cancerstage();
    info.condition();
    Thread.sleep(20000);
    
	}

}