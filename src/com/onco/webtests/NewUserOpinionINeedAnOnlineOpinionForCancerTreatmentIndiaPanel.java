package com.onco.webtests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.onco.misc.Deletelead;
import com.onco.pages.Concerns;
import com.onco.pages.FreeOpinion;
import com.onco.pages.Login;
import com.onco.pages.OpinionType;
import com.onco.pages.PatientInfo;
import com.onco.pages.PaymentsRazorPay;
import com.onco.pages.SignUp;
import com.onco.pages.Summary;
import com.onco.pages.Thankyoupanel;
import com.onco.testbase.BaseClass;

public class NewUserOpinionINeedAnOnlineOpinionForCancerTreatmentIndiaPanel extends BaseClass {

	@Parameters({ "name", "email", "phone", "otp", "pname", "concerns" })
	@Test(priority=7,description = "New User Opinion| I need an online opinion for cancer treatment -India panel. TC_ID=C202")
	public void NewUserSignupbookanpayatHospitalAppointmentWithFreeOpinion(String name, String email, String phone,
			String otp, String pname, String concerns) throws Exception {

		SignUp signup = new SignUp(driver);
		signup.signupicon();
		Thread.sleep(20000);
		signup.signuppage(name, email, phone);
		signup.patientQuery();
		Thread.sleep(20000);

		Login login = new Login(driver);
		login.otpDetails(otp);
		Thread.sleep(20000);

		com.onco.pages.Service service = new com.onco.pages.Service(driver);
		service.ineedanonlineopinionforcancertreatment();
		Thread.sleep(20000);

		Concerns concern = new Concerns(driver);
		concern.concernscheckbox();
		concern.typeconcerns(concerns);
		Thread.sleep(20000);

		PatientInfo info = new PatientInfo(driver);
		info.patientname(pname);
		info.cancertype();
		info.cancerstage();
		info.condition();
		info.treatment();
		info.continuebutton();
		Thread.sleep(20000);

		FreeOpinion freeopinion = new FreeOpinion(driver);
		freeopinion.continuebutton();
		Thread.sleep(20000);

		OpinionType opiniontype = new OpinionType(driver);
		opiniontype.indianPanelButton();
		Thread.sleep(20000);

		Summary summary = new Summary(driver);
		summary.netbanking();
		Thread.sleep(20000);

		PaymentsRazorPay payment = new PaymentsRazorPay(driver);
		payment.netbanking();
		Thread.sleep(20000);

		Thankyoupanel thankyoupanel = new Thankyoupanel(driver);
		thankyoupanel.takemetohomepage();
		Thread.sleep(20000);

		String actualTilte = driver.getPageSource();
		if (actualTilte.contains("Your best chance to fight Cancer")) {
			Assert.assertTrue(actualTilte.contains("Your best chance to fight Cancer"));
			NewUserOpinionINeedAnOnlineOpinionForCancerTreatmentIndiaPanel.addResultForTestCase("202",
					TEST_CASE_PASSED_STATUS, "");
		} else {
			NewUserOpinionINeedAnOnlineOpinionForCancerTreatmentIndiaPanel.addResultForTestCase("202",
					TEST_CASE_FAILED_STATUS, "");
		}

	}

	@AfterClass
	public void delete1() {

		try {
			Deletelead delete = new Deletelead();
			delete.delete();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
