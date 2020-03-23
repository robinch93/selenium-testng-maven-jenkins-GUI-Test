package com.flixbus.pages;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flixbus_booking_page {
	
	WebDriverWait wait;
	public static WebDriver driver;
	Actions action;  
	
	public Flixbus_booking_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 20);
		action = new Actions(driver);
	}
	
	@FindBy(how = How.ID, using = "search-results-sort-items")
	WebElement sort;
	
	@FindBy(xpath = "//div[contains(@class,'ride-available')]//input[contains(@type,'submit')]")
	WebElement reserveSeat;
	
	@FindBy(xpath = "(//input[@value=\"Reserve 1 Seat\"])[2]")
	WebElement reserve1Seat;
	
	@FindBy(xpath = "//input[@value=\"Remove 1 Seat\"]")
	WebElement removeSeat;
	
	@FindBy(how = How.ID, using = "book-button")
	WebElement bookButton;
	
	@FindBy(xpath = "//div[contains(@class,'unavailable')]")
	WebElement seatsUnavailable;
	
	public void sortBy(String option) {
		Select options = new Select(sort);
		options.selectByVisibleText(option);
	}
	
	public void reserveSeat() {
		reserve1Seat.click();	
	}
	
	public void bookButton() {
		action.moveToElement(bookButton).click().build().perform();
	}
	
	public void removeSeat() {
		removeSeat.click();
	}
		
}