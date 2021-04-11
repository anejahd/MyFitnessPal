package com.packt.tests;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.packt.base.BaseTest;
import com.theguppypond.FPLoginPage;
import com.theguppypond.myFitnessPalHome;

public class correctPWMyFitnessPalTest extends BaseTest {
	
	@DataProvider(name ="correctPWMyFitnessPalLogin")
	public static Object[][] correctPWMyFitnessPalLogin(){
		return new Object [][] {
			{
				"anejahd@gmail.com", "koolkid12", ""
			},
		};
	}
	
	@Test
	(dataProvider = "correctPWMyFitnessPalLogin")
	public void secondTest(String email, String password, String expectedErrorMessage) {
		// opening Homepage
		myFitnessPalHome FPhomePage = new myFitnessPalHome(driver);
		FPhomePage.open();
		// WebDriverWait wait = new WebDriverWait(driver, 20);

		// Logging in and enter credentials
		//FPLoginPage FPLoginPage = FPhomePage.clickLogin();
		//FPLoginPage.loginhomePage();
	
	}
}