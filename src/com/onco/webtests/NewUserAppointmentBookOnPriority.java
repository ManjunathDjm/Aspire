package com.onco.webtests;

import org.testng.annotations.Test;

import com.onco.pages.Appointment;
import com.onco.pages.Dashboard;
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
	
	
	@Test
	public void newuser() throws Exception {
		
	Homepage home= new Homepage();
	home.formfill(PropertiesData.getObject("name") ,PropertiesData.getObject("email"),PropertiesData.getObject("phone"));
	home.patientq();
	home.Submit();
	
	Login login= new Login();
    login.otpDetails(PropertiesData.getObject("otp"));
	
    PatientInfo info=new PatientInfo();
    info.PatientInfo(PropertiesData.getObject("patientname"));
    
    InitialAssessment assessment= new InitialAssessment();
    assessment.initialAssessmentClose();
    
    Service service=new Service();
    service.appointment();
    
    RequestDoctorAppointment appointment=new RequestDoctorAppointment();
    appointment.appointment();
    appointment.radiationOncologist();
    appointment.Button();
    
    Appointment app= new Appointment();
    app.appointment();
    
    Summary summary= new Summary();
    summary.Summary();
    
    PaymentsRazorPay pay= new PaymentsRazorPay();
    pay.netbanking();
    
   

	}
		
	
}

