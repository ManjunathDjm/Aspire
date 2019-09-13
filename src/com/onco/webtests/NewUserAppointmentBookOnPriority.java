package com.onco.webtests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.onco.pages.Appointment;
import com.onco.pages.Dashboard;
import com.onco.pages.Homepage;
import com.onco.pages.InitialAssessment;
import com.onco.pages.Login;
import com.onco.pages.PatientInfo;
import com.onco.pages.PaymentsRazorPay;
import com.onco.pages.RequestDoctorAppointment;
import com.onco.pages.Service;
import com.onco.pages.SignUp;
import com.onco.pages.Summary;
import com.onco.testbase.BaseClass;
import com.onco.util.PropertiesData;

import io.github.bonigarcia.wdm.WebDriverManager;


public class NewUserAppointmentBookOnPriority extends BaseClass {

	
@BeforeClass
@Parameters({"deleteURL","url","browser"})
public void delete(String deleteURL,String url,String browser) throws Exception {
				
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
login.login(PropertiesData.getObject("phone"));
Thread.sleep(3000);
login.OtpDetails(PropertiesData.getObject("otp"));
Thread.sleep(5000);
driver.get(deleteURL);
Thread.sleep(3000);
driver.close();
			
	
}

@Test(priority = 5)
public void newUserAppointmentBookOnPriority() throws Exception {
    
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

Thread.sleep(3000);
Dashboard dashboard= new Dashboard();




}

}





    






    







