package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utils.PropertiesData;

import org.apache.log4j.Logger;


public class AmazonPage {

	WebDriver ldriver;

	private static final Logger logger = Logger.getLogger(AmazonPage.class);


	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchtextfield;

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement searchicon;

	@FindBy(xpath = "//input[@id='low-price']")
	WebElement minpricefield;

	@FindBy(xpath = "//input[@id='high-price']")
	WebElement maxpricefield;

	@FindBy(xpath = "//input[@class='a-button-input']")
	WebElement gobutton;

	@FindBy(xpath = "//span[@class='a-dropdown-prompt']")
	WebElement sortby;

	@FindBy(xpath = "//a[@id='s-result-sort-select_2']")
	WebElement hightolow;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]")
	WebElement item;

	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement addtocart;

	@FindBy(xpath = "//a[@href='/gp/cart/view.html?ref_=sw_gtc']")
	WebElement gotocart;

	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
	WebElement proceed;

	public AmazonPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	public void search(String electronics) throws Exception {

		searchtextfield.click();
		searchtextfield.sendKeys(PropertiesData.getObject("electronics"));
		searchicon.click();
	}

	public void inputpriceone(String minprice, String maxprice) throws Exception {

		minpricefield.sendKeys(PropertiesData.getObject("minprice"));
		maxpricefield.sendKeys(PropertiesData.getObject("maxprice"));

	}

	public void inputpricetwo(String miniumu, String maximum) throws Exception {

		minpricefield.sendKeys(PropertiesData.getObject("minimum"));
		maxpricefield.sendKeys(PropertiesData.getObject("maximum"));

	}

	public void sortby() throws Exception {

		sortby.click();
		hightolow.click();
	}

	public void gobutton() throws Exception {

		gobutton.click();

	}

	public void additem() {

		item.click();
		addtocart.click();
		gotocart.click();
		proceed.click();

	}
}
