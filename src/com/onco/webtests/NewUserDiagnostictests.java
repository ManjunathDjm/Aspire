package com.onco.webtests;

import org.testng.annotations.Test;

import com.onco.pages.Homepage;
import com.onco.pages.InitialAssessment;
import com.onco.pages.Login;
import com.onco.pages.PatientInfo;
import com.onco.pages.RequestLabTests;
import com.onco.pages.Service;
import com.onco.pages.Summary;
import com.onco.testbase.BaseClass;
import com.onco.util.PropertiesData;


public class NewUserDiagnostictests extends BaseClass {
	
	
	@Test(priority = 3)
	public void newUserappointment() throws Exception {
		
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
    service.Labtest();
    
    RequestLabTests labtest=new RequestLabTests();
    labtest.Location();
    labtest.Labtest();
    labtest.ContinueButton();
    
    Summary summary= new Summary();
    summary.Summary();
    
    

	}
		
	
}

