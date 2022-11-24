package com.aakash.testbase;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Methods to launch browsers and take screenshots on test case fail Base class
 * will be used for all the test to launch browsers
 * 
 * @author manjunathdj
 *
 */
public class BaseClass {

	public static WebDriver driver;

	@Parameters({ "browser", "url" })
	@BeforeMethod
	public void openBrowser(String browser, String url) throws Exception {

		BasicConfigurator.configure();

		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			// WebDriverManager.firefoxdriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			driver = new ChromeDriver(options);
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		}
	}

	public void failed() {

		java.io.File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(srcFile, new java.io.File(
					"D:\\Toppr Automation Projects\\AakashTestPlayer\\test-output\\FiledScreenshot\\TestPlayer.png"));
			org.testng.Reporter.log(
					"<a href=\"D:\\Toppr Automation Projects\\AakashTestPlayer\\test-output\\FiledScreenshot\\TestPlayer.png\"></a>");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
