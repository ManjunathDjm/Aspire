package com.onco.webtests;

import org.testng.annotations.Test;

import com.onco.pages.Homepage;
import com.onco.pages.InitialAssessment;
import com.onco.pages.Login;
import com.onco.pages.OpinionType;
import com.onco.pages.PatientInfo;
import com.onco.pages.PaymentsRazorPay;
import com.onco.pages.Service;
import com.onco.pages.Summary;
import com.onco.testbase.BaseClass;
import com.onco.util.PropertiesData;


public class NewUserOpinionIndianPanel extends BaseClass {
	
	
	@Test(priority = 3)
	public void newUserappointment() throws Exception {
		
	Homepage home= new Homepage();
	home.formfill(PropertiesData.getObject("name") ,PropertiesData.getObject("email"),PropertiesData.getObject("phone"));
	home.patientq();
	home.submit();
		
	Login login= new Login();
	login.OtpDetails(PropertiesData.getObject("otp"));
		
	PatientInfo info=new PatientInfo();
	info.patientInfo(PropertiesData.getObject("patientname"));
	    
	InitialAssessment assessment= new InitialAssessment();
	assessment.initialAssessmentClose();
	    
    Service service=new Service();
    service.opinion();
    
    OpinionType opinion =new OpinionType();
    opinion.indianPanelButton();
    
    Thread.sleep(2000);
    Summary summary= new Summary();
    summary.summary();
    
    PaymentsRazorPay pay= new PaymentsRazorPay();
    pay.netbanking();
    
   
    
    

	}
		
	
}

