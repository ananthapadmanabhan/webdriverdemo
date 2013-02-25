package com.test.page.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.framework.WebElements;

public class Button extends WebElements{
	public Button(WebDriver driver, By locator,String label) {
		super(driver,locator,label);
	}
	
	public Button(WebDriver driver, String label) {
		super(driver,label);
	}
	public static void clickButton(WebDriver driver, String identifyBy, String locator){
		if (identifyBy.equalsIgnoreCase("xpath")){
			driver.findElement(By.xpath(locator)).click();
		}else if (identifyBy.equalsIgnoreCase("id")){
			driver.findElement(By.id(locator)).click();
		}else if (identifyBy.equalsIgnoreCase("name")){
			driver.findElement(By.name(locator)).click();
		}
	}
	
}
