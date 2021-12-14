package com.packt.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import com.packt.base.BaseTest;
import com.theguppypond.FPAccountHomePage;
import com.theguppypond.FPFoodDiary;
import com.theguppypond.FPLoginPage;
import com.theguppypond.myFitnessPalHome;

public class smokeTestMyFitnessPal extends BaseTest {
	@DataProvider(name = "smokeTest")
	public static Object[][] smokeTestMyFitnessPalTest(){
		return new Object[][] {
			{"anejahd@gmail.com", "Koolkid12!"}
		};
		
	}
	
	@Test
	(dataProvider = "smokeTest")
	public void smokeTestFitnessPal(String email, String password) {
		myFitnessPalHome FPhomePage = new myFitnessPalHome(driver);
		
		FPhomePage.open();
		FPhomePage.clickCookies();
		FPhomePage.clickLogin();
		
		FPLoginPage fpLogin = new FPLoginPage(driver);
		fpLogin.loginhomePage(email, password);
		
		
		FPAccountHomePage fpAccountHome = new FPAccountHomePage(driver);
		fpAccountHome.verifyDisplayName();

		
		
	}
	
	
	

}
