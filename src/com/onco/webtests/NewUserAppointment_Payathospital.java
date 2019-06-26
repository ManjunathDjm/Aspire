package com.onco.webtests;

import org.testng.annotations.Test;

import com.onco.pages.Appointment;
import com.onco.pages.Dashboard;
import com.onco.pages.InitialAssessment;
import com.onco.pages.ReqdoctorAppointment;
import com.onco.pages.Login;
import com.onco.pages.PatientInfo;
import com.onco.pages.Service;
import com.onco.pages.SignUp;
import com.onco.pages.Summary;
import com.onco.testbase.BaseClass;
import com.onco.util.PropertiesData;


public class NewUserAppointment_Payathospital extends BaseClass {
	
	
	@Test
	public void newUserappointment() throws Exception {
		
	SignUp sign=new SignUp();
	sign.SignupPage(PropertiesData.getObject("name"), PropertiesData.getObject("email"), PropertiesData.getObject("phone"));
    sign.CountryCode();
    sign.patientQuery();
   
    
    Login login= new Login();
    login.otpdetails(PropertiesData.getObject("otp"));
    
    PatientInfo info=new PatientInfo();
    info.patientInfo(PropertiesData.getObject("patientname"));
    
    InitialAssessment assessment= new InitialAssessment();
    assessment.initial_assessment_close();
    
    Service service=new Service();
    service.appointment();
   
    ReqdoctorAppointment lab=new ReqdoctorAppointment();
    lab.appointment();
    lab.button();
    
    Appointment app= new Appointment();
    app.appointment();
    
    Summary summary= new Summary();
    summary.summary();
    
    
    
   
	
	}
	
	
}

