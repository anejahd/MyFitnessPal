package com.packt.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

	protected WebDriver driver;

	@BeforeClass(alwaysRun = true)
	@Parameters({ "browser" })
	protected void setUp(@Optional("Chrome") String browser) {
		// Creating webdriver
		System.out.println("[Setting up Webdriver: " + browser + "]");
		// some code here

		System.setProperty("webdriver.chrome.driver", "/Users/anejahdaniels/GitHub/CRMAutomatedEntry/chromedriver");
		driver = new ChromeDriver();
	}

	@AfterClass(alwaysRun = true)
	protected void tearDown() {

		System.out.println("[Closing Webdriver]");
		driver.quit();

	}

	@DataProvider(name = "negativeLoginData")
	public static Object[][] negativeLoginData() {
		return new Object[][] {
				{ "incorrectUsername", "koolkid12",
						"You entered an invalid email or password. Please try again, \n or reset your password." },
				{ "anejahdaniels@gmail.com", "incorrectPassword",
						"You entered an invalid email or password. Please try again, \n or reset your password." } };
	}

	
}
