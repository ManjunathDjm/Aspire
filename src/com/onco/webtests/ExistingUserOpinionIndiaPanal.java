package com.onco.webtests;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.onco.pages.Dashboard;
import com.onco.pages.Homepage;
import com.onco.pages.Login;
import com.onco.pages.PaymentsRazorPay;
import com.onco.pages.Summary;
import com.onco.testbase.BaseClass;


public class ExistingUserOpinionIndiaPanal extends BaseClass {
	
@Parameters({"name","email","phone","patientname","otp"})	
@Test(priority = 7)
public void ExistinguserOpinionIndiaOanal(String name, String email,String phone,String patientname,String otp) throws Exception {
		
ChromeOptions options = new ChromeOptions();
options.addArguments("window-size=1280,800");
options.addArguments("--no-sandbox");
//options.addArguments("--headless");
options.addArguments("--start-maximized");
options.setExperimentalOption("useAutomationExtension", false);
	
Homepage home= new Homepage(driver);
home.formfill(name,email,phone);
home.patientquery();
home.submit();
	
Thread.sleep(3000);
Login login= new Login(driver);
login.login(phone);
login.otpDetails(otp);
    
Thread.sleep(10000);
Dashboard dashboard =new Dashboard(driver);
dashboard.selectindiapanalbutton();
    
Summary summary= new Summary(driver);

Thread.sleep(5000);
PaymentsRazorPay pay= new PaymentsRazorPay(driver);
pay.netbanking();

        
}
	
}