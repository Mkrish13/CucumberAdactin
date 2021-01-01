package com.pogo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.LibGlobal;

public class ConfirmationPage extends LibGlobal{
	
	public ConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="my_itinerary")
	private WebElement btnItinerary;
	@FindBy(id="search_hotel")
	private WebElement btnSearchHotel;
	@FindBy(id="logout")
	private WebElement btnLogout;
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement lnkBookedlist;
	@FindBy(id="order_no")
	private WebElement orderNo;
	
	public WebElement getOrderNo() {
		return orderNo;
	}
	public WebElement getLnkBookedlist() {
		return lnkBookedlist;
	}
	public WebElement getBtnSearchHotel() {
		return btnSearchHotel;
	}
	public WebElement getBtnLogout() {
		return btnLogout;
	}
	public WebElement getBtnItinerary() {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("my_itinerary")));
		return btnItinerary;
	}
		public void printOrderNo() {
		String orderId = driver.findElement(By.id("order_no")).getAttribute("value");
		System.out.println("\n     Order Id For the Booking is " + orderId + "\n");
		

	}
	
}
