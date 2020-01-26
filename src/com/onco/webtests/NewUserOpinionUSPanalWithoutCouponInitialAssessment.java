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


public class NewUserOpinionUSPanalWithoutCouponInitialAssessment extends BaseClass {
	
@BeforeClass
@Parameters({"deleteURL","url","browser","phone","otp"})

public void delete(String deleteURL,String url,String browser,String phone,String otp) throws Exception {		

WebDriverManager.chromedriver().setup();
ChromeOptions options = new ChromeOptions();
//options.addArguments("--headless");
options.addArguments("--enable-javascript");
options.addArguments("--window-size=1024,768,24");
options.addArguments("start-maximized"); 
options.addArguments("enable-automation"); 
options.addArguments("--no-sandbox"); 
options.addArguments("--disable-infobars");
options.addArguments("--disable-dev-shm-usage");
options.addArguments("--disable-browser-side-navigation"); 
options.addArguments("--disable-gpu"); 
driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.get(url);
driver.manage().deleteAllCookies();
			
SignUp sign=new SignUp();
sign.signupicon();
Login login= new Login();
login.login(phone);

Thread.sleep(5000);
login.otpDetails(otp);
Thread.sleep(5000);
driver.get(deleteURL);
Thread.sleep(5000);
driver.quit();
					
}		
	
@Parameters({"name","email","phone","otp","patientname","INDcoupon"})
@Test(priority = 2)
public void newUserOpinionIndiaPanal(String name, String email, String phone,String otp,String patientname,String INDcoupon) throws Exception {
	
Thread.sleep(5000);
Homepage home= new Homepage();
home.formfill(name ,email,phone);
Thread.sleep(5000);
home.patientquery();
Thread.sleep(5000);
home.submit();
Thread.sleep(5000);

Thread.sleep(5000);
Login login= new Login();
Thread.sleep(5000);
login.otpDetails(otp);

Thread.sleep(5000);
PatientInfo info=new PatientInfo();
Thread.sleep(5000);
info.patientname(patientname);
Thread.sleep(5000);
info.patientinfo();
Thread.sleep(5000);

Thread.sleep(5000);
InitialAssessment assessment= new InitialAssessment();
Thread.sleep(5000);
assessment.ViewAssessment();
Thread.sleep(5000);
	
Service service=new Service();
Thread.sleep(5000);
service.opinion();
Thread.sleep(5000);

OpinionType opinion =new OpinionType();
Thread.sleep(5000);
opinion.USPanalButton();
Thread.sleep(5000);

Thread.sleep(10000);
Summary summary= new Summary();
Thread.sleep(5000);
summary.deletecouponcode();
Thread.sleep(5000);
summary.summary();

PaymentsRazorPay pay= new PaymentsRazorPay();
Thread.sleep(5000);
pay.netbanking();
Thread.sleep(5000);

Thread.sleep(20000);
Dashboard dashboard= new Dashboard();
Thread.sleep(5000);


}
	
}