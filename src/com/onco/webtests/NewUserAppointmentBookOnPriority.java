package com.onco.webtests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.onco.pages.Appointment;
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
    
    driver.findElement(By.xpath("//body/app-root/patient-dashboard-component[@class='ng-tns-c3-16 ng-star-inserted']/div[@class='dashboard-container']/div[@class='ng-tns-c3-16']/div[@class='col-md-3 hidden-sm hidden-xs dashboard-col-left onboarding-nav-container']/div/div[@class='col-md-12 dashboard-left-separator']/onboarding-nav[@class='ng-tns-c3-16']/div[@class='row']/div[@class='onboarding-nav-container']/div[@class='footer-links-ctn']/a[1]")).click();
    
	}
	
	
    	
    }
    
	
 
    
	
		
 

	




