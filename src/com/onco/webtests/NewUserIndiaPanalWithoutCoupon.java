package com.onco.webtests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.onco.pages.Dashboard;
import com.onco.pages.Homepage;
import com.onco.pages.InitialAssessment;
import com.onco.pages.Login;
import com.onco.pages.OpinionType;
import com.onco.pages.PatientInfo;
import com.onco.pages.PaymentsRazorPay;
import com.onco.pages.Service;
import com.onco.pages.SignUp;
import com.onco.pages.Summary;
import com.onco.testbase.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;


public class NewUserIndiaPanalWithoutCoupon extends BaseClass {
	
@BeforeClass
@Parameters({"deleteURL","url","browser","phone","otp"})

public void delete(String deleteURL,String url,String browser,String phone,String otp) throws Exception {		

WebDriverManager.chromedriver().setup(); 
ChromeOptions options = new ChromeOptions();
options.addArguments("window-size=1080");
options.addArguments("--no-sandbox");
options.addArguments("--headless", "--disable-gpu","--window-size=1382,774","--ignore-certificate-errors");
options.addArguments("--start-maximized");
options.setExperimentalOption("useAutomationExtension", false);
driver = new ChromeDriver(options);
driver.get(url);
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
			
SignUp sign=new SignUp(driver);
sign.signupicon();
Login login= new Login(driver);
login.login(phone);

Thread.sleep(5000);
login.otpDetails(otp);
Thread.sleep(5000);
driver.get(deleteURL);
Thread.sleep(5000);
driver.close();
			
			
}		
	
@Parameters({"name","email","phone","otp","patientname","INDcoupon"})
@Test(priority = 2)
public void newUserOpinionIndiaPanal(String name, String email, String phone,String otp,String patientname,String INDcoupon) throws Exception {
	
Homepage home= new Homepage(driver);
home.formfill(name ,email,phone);
home.patientquery();
home.submit();

Thread.sleep(5000);
Login login= new Login(driver);
login.otpDetails(otp);

PatientInfo info=new PatientInfo(driver);
info.patientname(patientname);
info.patientinfo();

Thread.sleep(5000);
InitialAssessment assessment= new InitialAssessment(driver);
assessment.initialAssessmentClose();
	
Service service=new Service(driver);
service.opinion();

OpinionType opinion =new OpinionType(driver);
opinion.indianPanelButton();

Thread.sleep(10000);
Summary summary= new Summary(driver);
summary.deletecouponcode();
summary.summary();

PaymentsRazorPay pay= new PaymentsRazorPay(driver);
pay.netbanking();

Thread.sleep(20000);
Dashboard dashboard= new Dashboard(driver);



}
	
}