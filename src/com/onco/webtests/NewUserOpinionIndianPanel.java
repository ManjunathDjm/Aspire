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
import com.onco.util.PropertiesData;

import io.github.bonigarcia.wdm.WebDriverManager;


public class NewUserOpinionIndianPanel extends BaseClass {
	
@BeforeClass
@Parameters({"deleteURL","url","browser","phone","otp"})

public void delete(String deleteURL,String url,String browser,String phone,String otp) throws Exception {		

WebDriverManager.chromedriver().setup(); 
ChromeOptions options = new ChromeOptions();
options.addArguments("window-size=1280,800");
options.addArguments("--no-sandbox");
options.addArguments("--headless");
options.setExperimentalOption("useAutomationExtension", false);
driver = new ChromeDriver(options);
driver.get(url);
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
			
SignUp sign=new SignUp();
sign.signupicon();
				
Login login= new Login();
login.login(phone);
Thread.sleep(3000);
login.otpDetails(otp);
Thread.sleep(5000);
driver.get(deleteURL);
Thread.sleep(3000);
driver.close();
			
			
}		
	
@Parameters({"name","email","phone","otp","patientname"})
@Test(priority = 2)
public void newUserOpinionIndiaPanal(String name, String email, String phone,String otp,String patientname) throws Exception {
	
Homepage home= new Homepage();
home.formfill(name ,email,phone);
home.patientquery();
home.submit();
	
Login login= new Login();
login.otpDetails(otp);

Thread.sleep(50000);
PatientInfo info=new PatientInfo();
info.patientInfo(patientname);
	
InitialAssessment assessment= new InitialAssessment();
assessment.initialAssessmentClose();
	
Service service=new Service();
service.opinion();

OpinionType opinion =new OpinionType();
opinion.indianPanelButton();

Thread.sleep(3000);
Summary summary= new Summary();
summary.summary();

PaymentsRazorPay pay= new PaymentsRazorPay();
pay.netbanking();

Thread.sleep(3000);
Dashboard dashboard= new Dashboard();





}
	
}