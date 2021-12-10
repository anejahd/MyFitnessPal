package com.theguppypond;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;



import com.packt.base.BasePageObject;

public class myFitnessPalHome extends BasePageObject {

	private String FPhomePageUrl = "https://www.myfitnesspal.com/";
	
	By FPhomepageloginButtonLocator = By
			.xpath("/html//div[@id='app']/div/div/div//div[@class='jss22']//a[@href='/account/login']");
	
	By myFitnessTermsCondition = By.xpath("//div[@id='__next']//div[@role='alert']/div/button[2]/div[.='GOT IT']");
	
	
	public myFitnessPalHome(WebDriver driver) {
		super(driver);
	}

	public void open() {
		openUrl(FPhomePageUrl);
	}
	
	public void clickCookies() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(myFitnessTermsCondition)).click();
		
		}
	
	public void clickLogin() {
		System.out.println("Click Login");
		find(FPhomepageloginButtonLocator).click();
	}
	
	
			
}

