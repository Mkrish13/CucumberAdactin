package com.pogo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class BookNowPage extends LibGlobal {
	public  BookNowPage(){
	PageFactory.initElements(driver, this);
	}

	@FindBy(id="first_name")
	private WebElement txtFirstName;
	@FindBy(id="last_name")
	private WebElement txtLastName;
	@FindBy(id="address")
	private WebElement txtAddress;
	@FindBy(id="cc_num")
	private WebElement txtCardNum;
	@FindBy(id="cc_type")
	private WebElement dDnCardType;
	@FindBy(id="cc_exp_month")
	private WebElement dDnCardExpMonth;
	@FindBy(id="cc_exp_year")
	private WebElement dDnCardExpYear;
	@FindBy(id="cc_cvv")
	private WebElement txtCcv;
	@FindBy(id="book_now")
	private WebElement btnBookNow;
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtAddress() {
		return txtAddress;
	}
	public WebElement getTxtCardNum() {
		return txtCardNum;
	}
	public WebElement getdDnCardType() {
		return dDnCardType;
	}
	public WebElement getdDnCardExpMonth() {
		return dDnCardExpMonth;
	}
	public WebElement getdDnCardExpYear() {
		return dDnCardExpYear;
	}
	public WebElement getTxtCcv() {
		return txtCcv;
	}
	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	
	public void booknow(String firstName, String lastName, String billingAddress,
			String creditCardNo, String cardType, String expMon, String expYear, String cvv) {
		type(driver.findElement(By.id("first_name")), firstName);
		type(driver.findElement(By.id("last_name")), lastName);
		type(driver.findElement(By.id("address")), billingAddress);
		type(driver.findElement(By.id("cc_num")), creditCardNo);
		selectDataBytext(driver.findElement(By.id("cc_type")), cardType);
		selectDataBytext(driver.findElement(By.id("cc_exp_month")), expMon);
		selectDataBytext(driver.findElement(By.id("cc_exp_year")), expYear);
		type(driver.findElement(By.id("cc_cvv")), cvv);
		click(driver.findElement(By.id("book_now")));

	}
	
}
