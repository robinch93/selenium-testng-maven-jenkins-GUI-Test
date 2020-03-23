package com.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flixbus.pages.Flixbus_booking_page;
import com.flixbus.pages.Flixbus_search_page;

public class Ticket_Booking_Integration_Test extends TestBase{
	
	Flixbus_search_page searchPage;
	Flixbus_booking_page bookingPage;
	String travelDate ="2020-04-11";
	String fromCity = "Amsterdam";
	String toCity = "Berlin";

	@BeforeClass
	public void openApplication() {
		searchPage = new Flixbus_search_page(driver);
		bookingPage = new Flixbus_booking_page(driver);
	}
	
	@Test(priority = 1, description = "Integration Test to Search a Ticket")
	public void searchTicket() throws Exception {
		
		Thread.sleep(3000);
		assertEquals(driver.getTitle(), "Bus travel through Europe | FlixBus");
		
		Thread.sleep(2000);
		searchPage.setDeparture(fromCity);
	
		Thread.sleep(1000);
		searchPage.setArrival(toCity);
	
		Thread.sleep(1000);
		searchPage.selectDate(travelDate);
	
		Thread.sleep(1000);
		searchPage.clickSearchButton();
		
		Thread.sleep(3000);
		assertEquals(driver.getTitle(), "Travel by bus from " + fromCity + " to " + toCity + " on " + swapDate(travelDate));
		
	}
	
	@Test(priority = 2, description = "Integration Test to Book a Ticket")
	public void bookTicket() throws Exception {
		
		Thread.sleep(2000);
		bookingPage.sortBy("Price (lowest)");
		
		Thread.sleep(2000);
		bookingPage.reserveSeat();
	
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");
		bookingPage.bookButton();
		
		Thread.sleep(2000);
		assertEquals(driver.getTitle(), "FlixBus - Checkout");
	}

}
