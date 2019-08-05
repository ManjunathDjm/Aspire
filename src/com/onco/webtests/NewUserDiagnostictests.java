package com.onco.webtests;

import org.testng.annotations.Test;

import com.onco.pages.Dashboard;
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
	

@Test
public void newUserappointment() throws Exception {
	
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
service.labtest();

RequestLabTests labtest=new RequestLabTests();
labtest.location();
labtest.labtest();
labtest.continueButton();

Summary summary= new Summary();
summary.summary();

Dashboard dashboard= new Dashboard();
driver.quit();

}

}


