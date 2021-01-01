package com.pogo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SearchHotelPage extends LibGlobal {
	
	public  SearchHotelPage() {
		PageFactory.initElements(driver, this);	
		}
	
	@FindBy(id="location")
	private WebElement dDnLocation;
	@FindBy(id="hotels")
	private WebElement dDnHotel;
	@FindBy(id="room_type")
	private WebElement dDnRoomType;
	@FindBy(id="room_nos")
	private WebElement dDnRoomNum;
	@FindBy(id="datepick_in")
	private WebElement txtCheckInDate;
	@FindBy(id="datepick_out")
	private WebElement txtCheckOutDate;
	@FindBy(id="adult_room")
	private WebElement adultPerRoom;
	@FindBy(id="child_room")
	private WebElement childPerRoom;
	@FindBy(id="Submit")
	private WebElement btnSummit;
	public WebElement getdDnLocation() {
		return dDnLocation;
	}
	public WebElement getdDnHotel() {
		return dDnHotel;
	}
	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}
	public WebElement getdDnRoomNum() {
		return dDnRoomNum;
	}
	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}
	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}
	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}
	public WebElement getChildPerRoom() {
		return childPerRoom;
	}
	public WebElement getBtnSummit() {
		return btnSummit;
	}
			public void searchHotel(String location, String hotel, String roomType, String noOfRooms, String checkInDate,
			String checkOutDate, String adultCount, String childrenCount) throws InterruptedException {
		selectDataBytext(driver.findElement(By.id("location")), location);
		selectDataBytext(driver.findElement(By.id("hotels")), hotel);
		selectDataBytext(driver.findElement(By.id("room_type")), roomType);
		selectDataBytext(driver.findElement(By.id("room_nos")), noOfRooms);
		WebElement txtCheckInDate = driver.findElement(By.id("datepick_in"));
		txtCheckInDate.clear();
		type(txtCheckInDate, checkInDate);
		WebElement txtCheckOutDate = driver.findElement(By.id("datepick_out"));
		txtCheckOutDate.clear();
		type(txtCheckOutDate, checkOutDate);
		selectDataBytext(driver.findElement(By.id("adult_room")), adultCount);
		selectDataBytext(driver.findElement(By.id("child_room")), childrenCount);
		Thread.sleep(2000);
		click(driver.findElement(By.id("Submit")));

	}
	
	

}

