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
import com.onco.pages.PatientInfo;
import com.onco.pages.RequestLabTests;
import com.onco.pages.Service;
import com.onco.pages.SignUp;
import com.onco.pages.Summary;
import com.onco.testbase.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;



public class NewUserDiagnostictest extends BaseClass {
	
@BeforeClass
@Parameters({"deleteURL","url","browser","phone","otp"})
public void delete(String deleteURL,String url,String browser, String phone, String otp) throws Exception {

WebDriverManager.chromedriver().setup(); 
ChromeOptions options = new ChromeOptions();
options.addArguments("window-size=1280,800");
options.addArguments("--no-sandbox");
options.addArguments("--headless");
options.addArguments("--disable-dev-shm-usage");
options.setExperimentalOption("useAutomationExtension", false);

driver = new ChromeDriver(options);
driver.get(url);
driver.manage().deleteAllCookies();
driver.manage().window().maximize();

SignUp sign=new SignUp();
sign.signupicon();
			
Login login= new Login();
login.login(phone);
Thread.sleep(5000);
login.otpDetails(otp);
Thread.sleep(5000);
driver.get(deleteURL);
Thread.sleep(5000);
driver.close();
			
			
}	

@Parameters({"name","email","phone","otp","patientname"})
@Test(priority = 4)
public void newUserDiagnostic(String name, String email, String phone,String otp, String patientname) throws Exception {
	
Homepage home= new Homepage();
home.formfill(name,email,phone) ;
home.patientquery();
home.submit();

Thread.sleep(5000);
Login login= new Login();
login.otpDetails(otp);
	
PatientInfo info=new PatientInfo();
info.patientname(patientname);
info.patientinfo();

Thread.sleep(5000);
InitialAssessment assessment= new InitialAssessment();
assessment.initialAssessmentClose();
	
Service service=new Service();
service.labtest();

RequestLabTests labtest=new RequestLabTests();
labtest.location();
labtest.labtest();
labtest.continueButton();

Thread.sleep(20000);
Summary summary= new Summary();
summary.summary();

Thread.sleep(20000);
Dashboard dashboard= new Dashboard();


}

}


