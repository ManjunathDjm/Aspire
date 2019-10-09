package com.onco.webtests;

import org.testng.annotations.Test;

import com.onco.pages.Dashboard;
import com.onco.pages.Homepage;
import com.onco.pages.Login;
import com.onco.pages.OpinionType;
import com.onco.pages.PatientInfo;
import com.onco.pages.PaymentsRazorPay;
import com.onco.pages.Service;
import com.onco.pages.Summary;
import com.onco.testbase.BaseClass;
import com.onco.util.PropertiesData;


public class ExistingUserOpinionIndiaPanal extends BaseClass {
	
@Test(priority = 6)
public void newuser() throws Exception {
		
Homepage home= new Homepage();
home.formfill(PropertiesData.getObject("name") ,PropertiesData.getObject("email"),PropertiesData.getObject("phone"));
home.patientquery();
home.submit();
	
Thread.sleep(3000);
Login login= new Login();
login.login(PropertiesData.getObject("phone"));
login.otpDetails(PropertiesData.getObject("otp"));
    
Dashboard dashboard =new Dashboard();
dashboard.dashboard();
    
PatientInfo info=new PatientInfo();
info.patientinfo(PropertiesData.getObject("patientname"));
	    
Service service=new Service();
service.opinion();
        
OpinionType opinion =new OpinionType();
opinion.indianPanelButton();
    
Summary summary= new Summary();
summary.summary();
    
PaymentsRazorPay pay= new PaymentsRazorPay();
pay.netbanking();
        
}
	
}