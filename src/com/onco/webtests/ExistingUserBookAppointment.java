package com.onco.webtests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.onco.pages.Appointment;
import com.onco.pages.Dashboard;
import com.onco.pages.Homepage;
import com.onco.pages.Login;
import com.onco.pages.PatientInfo;
import com.onco.pages.PaymentsRazorPay;
import com.onco.pages.RequestDoctorAppointment;
import com.onco.pages.Service;
import com.onco.pages.Summary;
import com.onco.testbase.BaseClass;
import com.onco.util.PropertiesData;


public class ExistingUserBookAppointment extends BaseClass {

@Parameters({"name","email","phone","patientname","otp"})	
@Test
public void existingUserBookAppointment(String name,String email,String phone,String patientname,String otp) throws Exception {
		
Homepage home= new Homepage();
home.formfill(name,email,phone);
home.patientquery();
home.submit();
	
Thread.sleep(3000);
Login login= new Login();
login.login(phone);
login.otpDetails(otp);
    
Dashboard dashboard =new Dashboard();
dashboard.dashboard();

PatientInfo info=new PatientInfo();
info.patientinfo(patientname);
     
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

    
	}
}
