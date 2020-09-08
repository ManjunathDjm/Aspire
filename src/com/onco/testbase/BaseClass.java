package com.onco.testbase;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.*;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.onoco.testrail.APIClient;
import com.onoco.testrail.APIException;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.onco.misc.*;

/**
 * Methods to launch browsers and take screenshots on test case fail Base class
 * will be used for all the test to launch browsers
 * 
 * @author manjunathdj
 *
 */
public class BaseClass {

	public static String TEST_RUN_ID = "25";
	public static String TESTRAIL_USERNAME = "manjunath@onco.com";
	public static String TESTRAIL_PASSWORD = "Netdox11";
	public static String RAILS_ENGINE_URL = "https://netdox.testrail.io";
	public static final int TEST_CASE_PASSED_STATUS = 1;
	public static final int TEST_CASE_FAILED_STATUS = 5;

	public static WebDriver driver;

	@Parameters({ "browser", "url" })
	@BeforeMethod
	public void openBrowser(String browser, String url) throws Exception {

		BasicConfigurator.configure();

		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			// options.addArguments("headless","window-size=1920,1080");
			driver = new ChromeDriver(options);
			driver.get(url);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			
		}
	}
	
	@AfterClass
	public static void addResultForTestCase(String testCaseId, int status, String error)
			throws IOException, APIException {

		String testRunId = TEST_RUN_ID;

		APIClient client = new APIClient(RAILS_ENGINE_URL);
		client.setUser(TESTRAIL_USERNAME);
		client.setPassword(TESTRAIL_PASSWORD);
		Map data = new HashMap();
		data.put("status_id", status);
		data.put("comment", "Test Executed - Status updated automatically from Selenium test automation.");
		client.sendPost("add_result_for_case/" + testRunId + "/" + testCaseId + "", data);

	}

	@AfterMethod()
	public static void closedriver() {
		driver.quit();

	}
}
