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

import com.flixbus.pages.Flixbus_search_page;

public class Search_Page_Unit_Test extends TestBase {

	Flixbus_search_page searchPage;
	WebDriverWait wait;

	@BeforeClass
	public void loginApplication() {
		searchPage = new Flixbus_search_page(driver);
		wait = new WebDriverWait(driver, 10);
	}

	@Test(priority = 0)
	public void verifyTitle() throws Exception {
		Thread.sleep(3000);
		assertEquals(driver.getTitle(),"Bus travel through Europe | FlixBus");
	}
	
	@Test(priority = 1, description = "this test case will select items")
	public void from() throws Exception {
		Thread.sleep(3000);
		searchPage.setDeparture("Amsterdam");
		Thread.sleep(500);
		assertEquals(searchPage.getDeparture(), "Amsterdam");
	}

	@Test(priority = 2, description = "this test case will select items")
	public void to() throws Exception {
		Thread.sleep(1000);
		searchPage.setArrival("Berlin");
	}

	@Test(priority = 3, description = "this test case will select items")
	public void date() throws Exception {
		Thread.sleep(1000);
		searchPage.selectDate("2020-04-11");
	}

	@Test(priority = 4, description = "unit test - Click Search Button")
	public void search() throws Exception {
		Thread.sleep(1000);
		searchPage.clickSearchButton();
		Thread.sleep(1000);
	}

}
