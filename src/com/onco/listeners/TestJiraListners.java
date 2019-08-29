package com.onco.listeners;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.onco.util.JiraPolicy;
import com.onco.util.JiraServiceProvider;

public class TestJiraListners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		

	}

	@Override
	public void onTestFailure(ITestResult result) {

		JiraPolicy jiraPolicy = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraPolicy.class);
		boolean isTicketReady = jiraPolicy.logTicketReady();
		if (isTicketReady) {
			System.out.println("ticket ready for JIRA: " + isTicketReady);
			JiraServiceProvider jiraSp = new JiraServiceProvider("https://netdox.atlassian.net",
					"manjunath@onco.com", "GUaYTKSDtjwcmdTY5BD1EBDA", "WA");
			String issueSummary = result.getMethod().getConstructorOrMethod().getMethod().getName()
					+ "got failed due to some assertion or exception";
			String issueDescription = result.getThrowable().getMessage() + "\n";
			issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));
			jiraSp.createJiraTicket("Bug", issueSummary, issueDescription, "Failed due to");
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {
		

	}

}
