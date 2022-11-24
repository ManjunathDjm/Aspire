package com.aakash.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.apache.log4j.Logger;

/**
 * Locators and methods for result page We will call these locator and methods
 * to create test cases in webtests packege
 *
 * @author manjunathdj
 *
 */

public class ResultPage {

	WebDriver ldriver;

	private static final Logger logger = Logger.getLogger(ResultPage.class);

	@FindBy(xpath = "//div[@class='results-download-reports']//img[@class='results-download-reports-img']")
	WebElement ViewResultReport;

	@FindBy(xpath = "//button[2]")
	WebElement ScoreCardAndAnalysis;

	@FindBy(xpath = "//a[normalize-space()='Download/Print Admit Card']")
	WebElement DownloadAdmitCard;

	@FindBy(xpath = "//a[normalize-space()='Download/Print Result']")
	WebElement DownloadResult;

	public ResultPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	public void Resultpage() throws Exception {

		try {

			ViewResultReport.click();
			org.testng.Reporter.log("Clicked on result pdf");
			WebElement n = ldriver.findElement(By.tagName("body"));
			System.out.println("Text content: " + n.getText());
			Reporter.log("Getting page text");

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void ScoreCardAndAnalysis() throws Exception {

		ScoreCardAndAnalysis.click();
		org.testng.Reporter.log("Clicked on scorecardanalysis");
	}

	public void DownloadPrintAdmitCard() throws Exception {

		DownloadAdmitCard.click();
		Reporter.log("Clicked on DownloadAdmitCard");
	}

	public void DownloadResult() throws Exception {

		DownloadResult.click();
		Reporter.log("Clicked on DownloadResult");
	}
}
