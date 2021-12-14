package com.theguppypond;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import com.packt.base.BasePageObject;

public class FPLoginPage extends BasePageObject {

	By emailaddress = By.id("username");
	By passwordlocate = By.id("password");
	By loginButton = By.xpath(
			"//div[@id='content']/form[@action='https://www.myfitnesspal.com/account/login']//ul[@class='list-unstyled']//input[@value='Log In']");

	public FPLoginPage(WebDriver driver) {
		super(driver);
	}
	

	public void loginhomePage(String email, String password) {
		System.out.println("Entering email and password");
		WebElement emaiil = driver.findElement(By.id("username"));
		highLighterMethod(driver, emaiil);
		find(emailaddress).sendKeys(email);
		find(emailaddress).clear();
		find(emailaddress).sendKeys(email);
		find(passwordlocate).sendKeys(password); 
		System.out.println("Clicking Login");
		find(loginButton).click();

	}
	
	
	
}

