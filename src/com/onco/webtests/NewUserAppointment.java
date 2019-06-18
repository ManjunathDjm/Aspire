package com.onco.webtests;

import org.testng.annotations.Test;

import com.onco.pages.Login;
import com.onco.pages.PatientInfo;
import com.onco.pages.SignUp;
import com.onco.testbase.BaseClass;
import com.onco.util.PropertiesData;


public class NewUserAppointment extends BaseClass {
			

	@Test
	public void AmendmentGrossWeight() throws Exception {
		
	SignUp sign=new SignUp();
	sign.SignupPage(PropertiesData.getObject("name"), PropertiesData.getObject("email"), PropertiesData.getObject("phone"));
    sign.CountryCode();
    sign.patientQuery();
    
    Thread.sleep(10000);
    Login login= new Login();
    login.otpdetails(PropertiesData.getObject("otp"));
    
    PatientInfo info = new PatientInfo();
    info.patientInfo("patientname");
	
	}
	
	
}

