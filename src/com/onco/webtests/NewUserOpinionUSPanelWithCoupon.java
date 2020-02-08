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


public class NewUserOpinionUSPanelWithCoupon extends BaseClass {
	
	

@BeforeClass
@Parameters({"deleteURL","url","browser","phone","otp"})
public void delete(String deleteURL,String url,String browser,String phone,String otp) throws Exception {
		
WebDriverManager.chromedriver().setup(); 
ChromeOptions options = new ChromeOptions();

options.addArguments("window-size=1280,800");
options.addArguments("--no-sandbox");
options.addArguments("--headless");
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
Thread.sleep(10000);
driver.get(deleteURL);
Thread.sleep(10000);
driver.close();
		
		
}	
@Parameters({"name","email","phone","patientname","otp","UScoupon"})
@Test(priority = 1)
public void newUserOpinionUSPanal(String name, String email, String phone, String patientname, String otp,String UScoupon) throws Exception {
	
Homepage home= new Homepage(driver);
home.formfill(name ,email,phone);
home.patientquery();
home.submit();
	
Thread.sleep(5000);
Login login= new Login(driver);
login.otpDetails(otp);	

Thread.sleep(5000);
PatientInfo info=new PatientInfo(driver);
info.patientname(patientname);
info.cancertype();

Thread.sleep(5000);
InitialAssessment assessment= new InitialAssessment(driver);
assessment.initialAssessmentClose();
	
Service service=new Service(driver);
service.opinion();

OpinionType opinion =new OpinionType(driver);
opinion.USPanalButton();

Thread.sleep(10000);
Summary summary= new Summary(driver);
summary.deletecouponcode();
summary.applycoupon(UScoupon);
summary.summary();

PaymentsRazorPay pay= new PaymentsRazorPay(driver);
pay.netbanking();

Thread.sleep(20000);
Dashboard board = new Dashboard(driver);


}
	
}