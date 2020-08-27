package com.onco.webtests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.onco.misc.Deletelead;
import com.onco.pages.Appointment;
import com.onco.pages.Login;
import com.onco.pages.PatientInfo;
import com.onco.pages.PaymentsRazorPay;
import com.onco.pages.RequestDoctorAppointment;
import com.onco.pages.RequestLabTests;
import com.onco.pages.SignUp;
import com.onco.pages.Summary;
import com.onco.pages.ThankYou;
import com.onco.pages.Calendar;
import com.onco.pages.FreeOpinion;
import com.onco.testbase.BaseClass;

public class NewUserINeedToBookADiagnosticTest extends BaseClass {

	@Parameters({ "name", "email", "phone","otp","pname" })
	@Test(description = "New user | I need to book a diagnostic test. TC_ID=C2580")
	public void NewUserSignupbookanpayatHospitalAppointmentWithFreeOpinion(String name, String email, String phone,String otp, String pname) throws Exception {

    SignUp signup = new SignUp(driver);
    signup.signupicon();
    Thread.sleep(20000);
    signup.signuppage(name, email, phone);
    signup.patientQuery();
    
    Login login = new Login(driver);
    login.otpDetails(otp);
    Thread.sleep(20000);
    
    com.onco.pages.Service service = new com.onco.pages.Service(driver);
    service.iwanttobooklabtest();
    Thread.sleep(20000);
    
    RequestLabTests lab = new RequestLabTests(driver);
    lab.location();
    lab.testtype();
    lab.continueButton();
    Thread.sleep(20000);
    
    Summary summary = new Summary(driver);
    summary.netbanking();
    Thread.sleep(20000);
    
    ThankYou page = new ThankYou(driver);
    Thread.sleep(20000);
    
    
	String actualTilte = driver.getPageSource();
	if (actualTilte.contains("Thank you!")) {
		Assert.assertTrue(actualTilte.contains("Thank you!"));
		NewUserINeedToBookADiagnosticTest.addResultForTestCase("2580", TEST_CASE_PASSED_STATUS, "");
	} else {
		NewUserINeedToBookADiagnosticTest.addResultForTestCase("2580", TEST_CASE_FAILED_STATUS, "");
	}
}
	
	@AfterClass
	public void delete1() {
		
		try {
			Deletelead delete = new Deletelead();
			delete.delete();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}



