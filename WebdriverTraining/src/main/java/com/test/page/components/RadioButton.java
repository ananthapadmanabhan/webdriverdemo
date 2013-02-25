package com.test.page.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.framework.WebElements;

public class RadioButton extends WebElements{

	public RadioButton(WebDriver driver, By locator, String label) {
		super(driver, locator, label);
		// TODO Auto-generated constructor stub
	}

	public RadioButton(WebDriver driver, String label) {
		super(driver, label);
		// TODO Auto-generated constructor stub
	}
	
	public void selectRadiobutton(WebDriver driver, String identifyBy, String locator){
		if (identifyBy.equalsIgnoreCase("xpath")){
			driver.findElement(By.xpath(locator)).click();
		}else if (identifyBy.equalsIgnoreCase("id")){
			driver.findElement(By.id(locator)).click();
		}else if (identifyBy.equalsIgnoreCase("name")){
			driver.findElement(By.name(locator)).click();
		}

	}
}
