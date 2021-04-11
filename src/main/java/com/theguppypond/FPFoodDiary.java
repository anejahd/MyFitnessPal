package com.theguppypond;

import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.packt.base.BasePageObject;


public class FPFoodDiary extends BasePageObject {
	
	public FPFoodDiary(WebDriver driver) {
		super(driver);
	}
	
	By buttonAddFood = By.cssSelector("tr:nth-of-type(2) > .alt.first > .add_food");
			
	public void clickAddFood( ) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonAddFood)).click();
		
	}

}
