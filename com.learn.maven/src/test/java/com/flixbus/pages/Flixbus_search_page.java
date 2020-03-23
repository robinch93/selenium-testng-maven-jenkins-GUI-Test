package com.flixbus.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flixbus_search_page {

	WebDriverWait wait;
	public static WebDriver driver;
	
	public Flixbus_search_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 20);
	}

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement textDeparture;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement textArrival;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement inputDate;

	@FindBy(xpath = "//button[contains(.,'Search')]")
	WebElement searchButton;

	public void setDeparture(String value) throws Exception {
		wait.until(ExpectedConditions.visibilityOf(textDeparture));
		textDeparture.sendKeys(value);
		Thread.sleep(1000);
		textDeparture.sendKeys(Keys.ARROW_DOWN);
		textDeparture.sendKeys(Keys.ENTER);
	}

	public void setArrival(String value) throws Exception {
		wait.until(ExpectedConditions.visibilityOf(textArrival));
		textArrival.sendKeys(value);
		Thread.sleep(1000);
		textArrival.sendKeys(Keys.ARROW_DOWN);
		textArrival.sendKeys(Keys.ENTER);
	}

	public void selectDate(String date) throws InterruptedException {
		inputDate.click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//span[@data-date=\"" + date + "\"]")).click();
	}

	public String getDeparture() {
		return textDeparture.getAttribute("value");
	}

	public String getArrival() {
		return textArrival.getAttribute("value");
	}
	
	public String getDate() {
		return inputDate.getAttribute("value");
	}

	public void clickSearchButton() {
		searchButton.click();
	}

}