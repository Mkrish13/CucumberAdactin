package com.stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import com.base.LibGlobal;
import com.pogo.BookNowPage;
import com.pogo.ConfirmationPage;
import com.pogo.LoginPage;
import com.pogo.SearchHotelPage;
import com.pogo.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinSite extends LibGlobal {
	LoginPage loginPage;
	SearchHotelPage searchHotelPage;
	SelectHotel selectHotel;
	BookNowPage bookNowPage;
	ConfirmationPage confirmationPage;

	@Given("User is on the AdactinHotel Page")
	public void user_is_on_the_AdactinHotel_Page() {
		getDriver();
		loadUrl("http://adactinhotelapp.com/");
	}

	@When("User should login using the Valid {string} and {string}")
	public void user_should_login_using_the_Valid_and(String userName, String password) {
		loginPage = new LoginPage();
		loginPage.login(userName, password);
	}

	@When("User Should Selecthotel by Selecting {string} ,{string},{string},{string}and Enter {string},{string} and Select{string},{string} and click Search button")
	public void user_Should_Selecthotel_by_Selecting_and_Enter_and_Select_and_click_Search_button(String location,
			String hotel, String roomType, String noOfRooms, String checkInDate, String checkOutDate, String adultCount,
			String childrenCount) throws InterruptedException {
		searchHotelPage = new SearchHotelPage();
		searchHotelPage.searchHotel(location, hotel, roomType, noOfRooms, checkInDate, checkOutDate, adultCount,
				childrenCount);
	}

	@When("User Should Select the Hotel and click Continue.")
	public void user_Should_Select_the_Hotel_and_click_Continue() {
		selectHotel = new SelectHotel();
		selectHotel.selectHtl();
	}

	@When("User Should Enter {string},{string},{string}and  enter Card Details")
	public void user_Should_Enter_and_enter_Card_Details(String firstName, String lastName, String billingAddress,
			io.cucumber.datatable.DataTable dataTable) {
		String creditCardNo, cardType, expMon, expYear, cvv;
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(1);
		creditCardNo = map.get("creditCardNo");
		cardType = map.get("cardType");
		expMon = map.get("expMon");
		expYear = map.get("expYear");
		cvv = map.get("cvv");

		bookNowPage = new BookNowPage();
		bookNowPage.booknow(firstName, lastName, billingAddress, creditCardNo, cardType, expMon, expYear, cvv);
	}

	@Then("User Should booknow and Display OrderId")
	public void user_Should_booknow_and_Display_OrderId() {
		confirmationPage = new ConfirmationPage();
		confirmationPage.printOrderNo();
		quitBrowser();

	}

}
