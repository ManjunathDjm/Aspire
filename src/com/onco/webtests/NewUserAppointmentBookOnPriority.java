package com.onco.webtests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.onco.pages.Appointment;
import com.onco.pages.Homepage;
import com.onco.pages.InitialAssessment;
import com.onco.pages.Login;
import com.onco.pages.PatientInfo;
import com.onco.pages.PaymentsRazorPay;
import com.onco.pages.RequestDoctorAppointment;
import com.onco.pages.Service;
import com.onco.pages.Summary;
import com.onco.testbase.BaseClass;
import com.onco.util.PropertiesData;


public class NewUserAppointmentBookOnPriority extends BaseClass {
	
	
	@Test(priority = 2)
	public void newuser() throws Exception {
		
	Homepage home= new Homepage();
	home.Formfill(PropertiesData.getObject("name") ,PropertiesData.getObject("email"),PropertiesData.getObject("phone"));
	home.Patientq();
	home.Submit();
	
	Login login= new Login();
    login.OtpDetails(PropertiesData.getObject("otp"));
	
    PatientInfo info=new PatientInfo();
    info.PatientInfo(PropertiesData.getObject("patientname"));
    
    InitialAssessment assessment= new InitialAssessment();
    assessment.initialAssessmentClose();
    
    Service service=new Service();
    service.Appointment();
    
    RequestDoctorAppointment appointment=new RequestDoctorAppointment();
    appointment.Appointment();
    appointment.RadiationOncologist();
    appointment.Button();
    
    Appointment app= new Appointment();
    app.Appointment();
    
    Summary summary= new Summary();
    summary.Summary();
    
    PaymentsRazorPay pay= new PaymentsRazorPay();
    pay.Netbanking();
    


	}
		
	
}

