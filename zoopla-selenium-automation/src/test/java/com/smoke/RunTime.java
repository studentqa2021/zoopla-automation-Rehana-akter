package com.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.DriverManager;

public class RunTime {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver = new DriverManager().getDriver();
	}

	@Test
	public void getLogin() {

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}