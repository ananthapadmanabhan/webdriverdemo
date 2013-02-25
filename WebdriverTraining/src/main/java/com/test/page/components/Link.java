package com.test.page.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.framework.WebElements;

public class Link extends WebElements {

	public Link(WebDriver driver, By locator, String label) {
		super(driver, locator, label);
	}
	public Link(WebDriver driver, String linkText) {
		super(driver,By.linkText(linkText),linkText);
	}
	
	public static void clickLink(WebDriver driver, String identifyBy, String locator){
		if (identifyBy.equalsIgnoreCase("xpath")){
			driver.findElement(By.xpath(locator)).click();
		}else if (identifyBy.equalsIgnoreCase("id")){
			driver.findElement(By.id(locator)).click();
		}else if (identifyBy.equalsIgnoreCase("name")){
			driver.findElement(By.name(locator)).click();
		}else if (identifyBy.equalsIgnoreCase("linkText")){
			driver.findElement(By.linkText(locator)).click();
		}else if (identifyBy.equalsIgnoreCase("partialLinkText")){
			driver.findElement(By.partialLinkText(locator)).click();
		}
	}
}
