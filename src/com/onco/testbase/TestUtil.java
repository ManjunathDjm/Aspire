package com.onco.testbase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.onco.testbase.BaseClass;

public class TestUtil extends BaseClass{

	public static long PAGE_LOAD_TIMEOUT = 60;
	public static long IMPLICIT_WAIT = 20;
	WebDriverWait wait = new WebDriverWait(driver,30);
	static JavascriptExecutor js;

}
