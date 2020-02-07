package com.onco.webtests;

import java.util.concurrent.TimeUnit;
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


public class NewUserOpinionUSPanalWithoutCouponInitialAssessment extends BaseClass {
	
@BeforeClass
@Parameters({"deleteURL","url","browser","phone","otp"})

public void delete(String deleteURL,String url,String browser,String phone,String otp) throws Exception {		
	
WebDriverManager.chromedriver().setup();
ChromeOptions options = new ChromeOptions();
options.addArguments("--no-sandbox"); 
options.addArguments("--window-size=1920,1080");
options.addArguments("headless");
options.addArguments("--disable-gpu"); 
options.addArguments("enable-javascript");
driver = new ChromeDriver(options);
driver.get(url);
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
SignUp sign=new SignUp(driver);
sign.signupicon();

Login login= new Login(driver);
login.login(phone);

Thread.sleep(5000);
login.otpDetails(otp);
Thread.sleep(5000);
driver.get(deleteURL);
Thread.sleep(5000);
driver.quit();
					
}		
	
@Parameters({"name","email","phone","otp","patientname","INDcoupon"})
@Test(priority = 1)
public void TC_01_HomePage(String name, String email, String phone,String otp,String patientname,String INDcoupon) throws InterruptedException {
	
Homepage home= new Homepage(driver);
home.formfill(name ,email,phone);
home.patientquery();
home.submit();

Login login= new Login(driver);
login.otpDetails(otp);

PatientInfo info=new PatientInfo(driver);
info.patientname(patientname);
info.cancertype();
info.cancerstage();
info.continuebutton();

InitialAssessment assessment= new InitialAssessment(driver);
assessment.ViewAssessment();

Service service=new Service(driver);
service.opinion();

OpinionType opinion =new OpinionType(driver);
opinion.USPanalButton();

Summary summary= new Summary(driver);
summary.deletecouponcode();
summary.summary();

PaymentsRazorPay pay= new PaymentsRazorPay(driver);
pay.netbanking();

Dashboard dashboard= new Dashboard(driver);

}
	
}