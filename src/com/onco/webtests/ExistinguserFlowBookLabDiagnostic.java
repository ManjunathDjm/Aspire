package com.onco.webtests;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.onco.pages.Login;
import com.onco.pages.RequestLabTests;
import com.onco.pages.SignUp;
import com.onco.pages.Summary;
import com.onco.pages.ThankYou;
import com.onco.testbase.BaseClass;

public class ExistinguserFlowBookLabDiagnostic extends BaseClass {

	@Parameters({"phone","otp"})
	@Test(description = "Existing user Flow | Book Lab Diagnostic. TC_ID=C2605")
	public void NewUserSignupbookanpayatHospitalAppointmentWithFreeOpinion(String phone,String otp) throws Exception {

    SignUp signup = new SignUp(driver);
    signup.signupicon();
    Thread.sleep(20000);
    
    Login login = new Login(driver);
    login.login(phone);
    Thread.sleep(20000);
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
    summary.labbook();
    Thread.sleep(20000);
    
    ThankYou page = new ThankYou(driver);
    Thread.sleep(20000);
    
	String actualTilte = driver.getPageSource();
	if (actualTilte.contains("Thank you!")) {
		Assert.assertTrue(actualTilte.contains("Thank you!"));
		ExistinguserFlowBookLabDiagnostic.addResultForTestCase("2605", TEST_CASE_PASSED_STATUS, "");
	} else {
		ExistinguserFlowBookLabDiagnostic.addResultForTestCase("2605", TEST_CASE_FAILED_STATUS, "");
	}

	}
}



