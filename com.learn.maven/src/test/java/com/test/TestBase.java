package com.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flixbus.pages.Flixbus_search_page;

import sun.awt.windows.WEmbeddedFrame;

public class TestBase {

	String driverPath = "D:\\Softwares\\chromedriver.exe";
	public String baseUrl = "https://global.flixbus.com/";
	static WebDriver driver;
	JavascriptExecutor js;

	@BeforeClass
	public void driverSetup() {
		System.out.println("Launching Web Browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.get(baseUrl);
		js = (JavascriptExecutor) driver;
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	public String swapDate(String date) {
		String day = date.substring(8,10);
		String month = date.substring(5,7);
		String year = date.substring(0,4);
		date = day + '.' + month + '.' + year;
		return date;
	}
}
