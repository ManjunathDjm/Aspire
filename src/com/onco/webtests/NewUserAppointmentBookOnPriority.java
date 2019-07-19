package com.onco.webtests;

import org.testng.annotations.AfterClass;
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
	
	
	@Test(priority = 1)
	public void newuser() throws Exception {
		
	Homepage home= new Homepage();
	home.formfill(PropertiesData.getObject("name") ,PropertiesData.getObject("email"),PropertiesData.getObject("phone"));
	home.patientquery();
	home.submit();
	
	Login login= new Login();
    login.OtpDetails(PropertiesData.getObject("otp"));
	
    PatientInfo info=new PatientInfo();
    info.patientInfo(PropertiesData.getObject("patientname"));
    
    InitialAssessment assessment= new InitialAssessment();
    assessment.initialAssessmentClose();
    
    Service service=new Service();
    service.appointment();
    
    RequestDoctorAppointment appointment=new RequestDoctorAppointment();
    appointment.appointment();
    appointment.radiationOncologist();
    appointment.button();
    
    Appointment app= new Appointment();
    app.appointment();
    
    Summary summary= new Summary();
    summary.summary();
    
    PaymentsRazorPay pay= new PaymentsRazorPay();
    pay.netbanking();
    

	}


}

