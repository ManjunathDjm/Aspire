package com.onco.webtests;

import org.testng.annotations.Test;

import com.onco.pages.Appointment;
import com.onco.pages.Dashboard;
import com.onco.pages.InitialAssessment;
import com.onco.pages.RequestDoctorAppointment;
import com.onco.pages.Login;
import com.onco.pages.PatientInfo;
import com.onco.pages.Service;
import com.onco.pages.SignUp;
import com.onco.pages.Summary;
import com.onco.testbase.BaseClass;
import com.onco.util.PropertiesData;


public class NewUserAppointmentPayathospital extends BaseClass {
	
	
	@Test
	public void newUserappointment() throws Exception {
		
	SignUp sign=new SignUp();
	sign.SignupPage(PropertiesData.getObject("name"), PropertiesData.getObject("email"), PropertiesData.getObject("phone"));
    sign.CountryCode();
    sign.PatientQuery();
   
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
    appointment.surgicalOncologist();
    appointment.Button();
    
    Appointment app= new Appointment();
    app.appointment();
    
    Summary summary= new Summary();
    summary.Summary();
    
    Dashboard dashboard= new Dashboard();
    dashboard.logout();

	}
		
	
}

