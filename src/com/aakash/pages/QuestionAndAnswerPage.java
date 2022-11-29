package com.aakash.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.apache.log4j.Logger;

/**
 * Locators and methods for Question and Answer page We will call these locator
 * and methods to create test cases in webtests packege
 *
 * @author manjunathdj
 *
 */

public class QuestionAndAnswerPage {

	WebDriver ldriver;

	//private static final Logger logger = Logger.getLogger(QuestionAndAnswer.class);

	@FindBy(className = "option-choice-id")
	WebElement AnsweroptionA;

	@FindBy(xpath = "//div[@class='prev-next']")
	WebElement Nextquestionbutton;

	@FindBy(xpath = "//div[@class='button prev']")
	WebElement Previousquestionbutton;

	@FindBy(xpath = "//div[@class='button is_phone_not']")
	WebElement Endtest;

	@FindBy(xpath = "//div[@class='button btn_resume']")
	WebElement Resume;

	@FindBy(xpath = "//div[@class='button btn_submit']")
	WebElement Submit;

	@FindBy(xpath = "//span[@class='que-reset']")
	WebElement ResetAnswer;

	@FindBy(className = "answerstatus")
	WebElement Answerstatus;

	@FindBy(xpath = "//span[normalize-space()='English(En)']")
	WebElement languageselector;

	@FindBy(xpath = "//label[normalize-space()='Hindi(Hi)']")
	WebElement hindilanguage;

	@FindBy(xpath = "//label[normalize-space()='English(En)']")
	WebElement englishlanguage;

	@FindBy(className = "que-review")
	WebElement review;

	public QuestionAndAnswerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	public void selectAnswer() throws Exception {

		AnsweroptionA.isDisplayed();
		AnsweroptionA.click();
		Thread.sleep(10000);
		Reporter.log("Selected Answer A");
	}

	public void deselectAnswer() throws Exception {

		AnsweroptionA.click();
		Thread.sleep(10000);
		Reporter.log("Deselected Answer A");

	}

	public void nextquestion() throws Exception {

		Nextquestionbutton.isDisplayed();
		Nextquestionbutton.click();
		Reporter.log("Clicked on next button");
		Thread.sleep(10000);

	}

	public void previousquestion() throws Exception {

		Previousquestionbutton.isDisplayed();
		Previousquestionbutton.click();
		Reporter.log("Clicked on previous button");
		WebElement l = ldriver.findElement(By.tagName("body"));
		System.out.println("Text content: " + l.getText());
		Thread.sleep(10000);
		Reporter.log("Getting summary details of test");

	}

	public void endtest() throws Exception {

		Endtest.click();
		Reporter.log("Clicked on end test button");
		Thread.sleep(10000);
		WebElement n = ldriver.findElement(By.tagName("body"));
		System.out.println("Text content: " + n.getText());
		Reporter.log("Getting summary details of test");
	}

	public void resume() throws Exception {

		Resume.click();
		Reporter.log("Clicked on resume button");

	}

	public void submit() throws Exception {

		Submit.click();
		Reporter.log("Clicked on submit test button");
		WebElement n = ldriver.findElement(By.tagName("body"));
		System.out.println("Text content: " + n.getText());
		Reporter.log("Getting summary details of test");

	}

	public void resetanswer() throws Exception {

		Thread.sleep(10000);
		ResetAnswer.click();
		Reporter.log("Clicked on reset answer");

	}

	public void review() throws Exception {

		review.click();
		Reporter.log("Clicked on review answer");

	}

	public void languageselector() throws InterruptedException {

		languageselector.click();
		Reporter.log("Clicked on language selector");
		hindilanguage.click();
		Reporter.log("Clicked on hindilanguage");
	}
}