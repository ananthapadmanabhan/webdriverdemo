package com.test.page.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.framework.WebElements;

public class CheckBox extends WebElements{

	public CheckBox(WebDriver driver, By locator, String label) {
		super(driver, locator, label);
	}
	
	public CheckBox(WebDriver driver, String label) {
		super(driver, label);
	}
	
	public void selectCheckbox(WebDriver driver, String identifyBy, String locator, String checkFlag){
		if (identifyBy.equalsIgnoreCase("xpath")){
			if ((checkFlag).equalsIgnoreCase("ON")){
				if (!(driver.findElement(By.xpath(locator)).isSelected())){
					driver.findElement(By.xpath(locator)).click();
				}
			}
		}else if (identifyBy.equalsIgnoreCase("id")){
			if ((checkFlag).equalsIgnoreCase("ON")){
				if (!(driver.findElement(By.id(locator)).isSelected())){
					driver.findElement(By.id(locator)).click();
				}
			}
		}else if (identifyBy.equalsIgnoreCase("name")){
			if ((checkFlag).equalsIgnoreCase("ON")){
				if (!(driver.findElement(By.name(locator)).isSelected())){
					driver.findElement(By.name(locator)).click();
				}
			}
		}
	}

}
