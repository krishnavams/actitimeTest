package com.actitime.genaric;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser() {

	}
	@AfterTest
	public void closeBrowser() {

	}
	@BeforeMethod
	public void logIn() {

	}
	@AfterMethod
	public void logOut() {

	}

}
