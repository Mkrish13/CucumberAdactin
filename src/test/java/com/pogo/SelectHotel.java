package com.pogo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SelectHotel extends LibGlobal {
	public SelectHotel() {
PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement rdoSelectHotel;
	@FindBy(id="continue")
	private WebElement  btnContinue;
	public WebElement getRdoSelectHotel() {
		return rdoSelectHotel;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	public void selectHtl() {
		click(driver.findElement(By.id("radiobutton_0")));
		click(driver.findElement(By.id("continue")));
	}

}
