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
	
	
	@Test(priority = 1)
	public void newUserappointment() throws Exception {
		
	SignUp sign=new SignUp();
	sign.SignupPage(PropertiesData.getObject("name"), PropertiesData.getObject("email"), PropertiesData.getObject("phone"));
    sign.CountryCode();
    sign.PatientQuery();
   
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
    appointment.SurgicalOncologist();
    appointment.Button();
    
    Appointment app= new Appointment();
    app.Appointment();
    
    Summary summary= new Summary();
    summary.Summary();
    
    Dashboard dashboard= new Dashboard();
    dashboard.Logout();
    
    

	}
		
	
}

