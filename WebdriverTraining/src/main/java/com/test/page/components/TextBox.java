package com.test.page.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.framework.WebElements;

public class TextBox extends WebElements{

	public TextBox(WebDriver driver, By locator, String label) {
		super(driver, locator, label);
	}
	
	public TextBox(WebDriver driver, String label) {
		super(driver, label);
	}
	
	public void typeText(String inputText) {
		getDriver().findElement(getLocator()).clear();
		getDriver().findElement(getLocator()).sendKeys(inputText);
	}
	public static void typeinEditbox(WebDriver driver, String identifyBy, String locator, String valuetoType){
		if (identifyBy.equalsIgnoreCase("xpath")){
			driver.findElement(By.xpath(locator)).sendKeys(valuetoType);
		}else if (identifyBy.equalsIgnoreCase("id")){
			driver.findElement(By.id(locator)).sendKeys(valuetoType);
		}else if (identifyBy.equalsIgnoreCase("name")){
			driver.findElement(By.name(locator)).sendKeys(valuetoType);
		}

	}
}
