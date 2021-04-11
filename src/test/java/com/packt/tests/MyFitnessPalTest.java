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

public class MyFitnessPalTest extends BaseTest {
	
	
	@DataProvider(name = "myFitnessPalLogin")
	public static Object[][] myFitnessPalLogin() {
		return new Object[][] {
				{ "anejahd@gmail.com", "Koolkid12!"},
				 };
	}
	
	By myFitnessCookies = By.xpath("//html//div[@id='app']/div//div[@class='jss109']/button[2]//div[.='GOT IT']");
	
	@Test
	(dataProvider = "myFitnessPalLogin")
	public void firstTest(String email, String password) {
		// opening Homepage
		myFitnessPalHome FPhomePage = new myFitnessPalHome(driver);
		
		/*System.out.println(driver.manage().getCookies());
		driver.manage().deleteAllCookies();*/
	
		//open page
		FPhomePage.open();
		FPhomePage.clickCookies();
		FPhomePage.clickLogin();
		
		/*driver.manage().getCookies();
		System.out.println(driver.manage().getCookies());
		driver.manage().getCookies().clear();*/

		FPLoginPage fpLogin = new FPLoginPage(driver);
		fpLogin.loginhomePage(email, password);
		
		//AccountHomePage
		FPAccountHomePage fpAccountHome = new FPAccountHomePage(driver);
		fpAccountHome.exitPremiumAdd();
		fpAccountHome.verifyAccountName();
		fpAccountHome.clickButtonFood();
		
		//FoodDiary
		FPFoodDiary fpFoodDiary = new FPFoodDiary(driver);
		fpFoodDiary.clickAddFood();
		//fpAccountHome.highlightElement();
		//FPhomePage.clickLogIn();
		/*WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(
			    ExpectedConditions.visibilityOfElementLocated(By.id("username"))
			);*/

	}

}
