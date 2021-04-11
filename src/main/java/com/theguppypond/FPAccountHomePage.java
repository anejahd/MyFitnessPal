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

public class FPAccountHomePage extends BasePageObject {
	
	By fpAddPopUP = By.xpath("//div[@id='ember']/div[@class='ember-view']/div[@class='ember-view']/div//a[@class='close-btn']");
	By fpAddFood = By.xpath("//div[@id='ember']/div[@class='ember-view']/div[1]/div[@class='top-nav']/div[@class='ember-view']//a[@href='/food/diary']");
	By fpLogOut = By.xpath("//ul[@id='navTop']//a[@href='/account/logout']");
	By buttonFood = By.cssSelector(".top-nav > .ember-view > ul > li:nth-of-type(2) > .ember-view");
	By fpHeader = By.id("ember1598");
	
	By premiumCookie = By.cssSelector(".close-btn");
	
	public FPAccountHomePage(WebDriver driver) {
		super(driver);
	}

	//TODO: actual and expected title is correct but the page source has written "Free Calorie Counter, Diet &amp; Exercise Journal | MyFitnessPal.com" why is there a amp after an &? 
	public void verifyAccountName() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Free Calorie Counter, Diet & Exercise Journal | MyFitnessPal.com";
		Assert.assertEquals(expectedTitle,actualTitle);
	}
	
	public void getSourcePage() {
		boolean fpPageSource = driver.getPageSource().contains("ember1654");
		System.out.println(fpPageSource);
		Assert.assertTrue(fpPageSource);
	}
	
	public void exitPremiumAdd() {
		WebDriverWait exit = new WebDriverWait(driver, Duration.ofSeconds(20));
		exit.until(ExpectedConditions.visibilityOfElementLocated(premiumCookie)).click();
	}
	
	public void clickButtonFood () {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonFood)).click();
		
		
		/*WebElement fpFood = driver.findElement(By.id("ember1632"));
		Boolean number=fpFood.isDisplayed();

		  System.out.println(number);
		
		driver.findElement(By.id("ember1632")).click();*/
		//find(addFood).click();
	}
	
}