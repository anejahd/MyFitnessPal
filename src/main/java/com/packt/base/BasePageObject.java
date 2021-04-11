package com.packt.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class BasePageObject {

	protected WebDriver driver;

	public BasePageObject(WebDriver driver) {
		this.driver = driver;
	}

	protected void openUrl(String url) {
		System.out.println("Opening page: " + url);
		driver.get(url);
		System.out.println("Page Opened!");
	}

	protected WebElement find(By locator) {
		return driver.findElement(locator);
	}
	
	protected void highLighterMethod(WebDriver driver, WebElement element){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}
}
