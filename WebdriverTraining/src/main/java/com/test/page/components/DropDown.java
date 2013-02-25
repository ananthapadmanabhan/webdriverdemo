package com.test.page.components;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.framework.WebElements;

public class DropDown extends WebElements{

	private String xpath;
	
	public DropDown(WebDriver driver,String label) {
		super(driver,label);
	}
	
	public DropDown(WebDriver driver, String xpath,String label) {
		super(driver,By.xpath(xpath),label);
		this.xpath=xpath;
	}

	public void selectByIndex(int index) {
	//System.out.println("Category Locator: "+getLocator() + "/option[" + index + "]");
		getDriver().findElement(By.xpath(xpath + "/option[" + index + "]")).click();
	}
	
	public void selectValue(WebDriver driver, String valToBeSelected){
		List <WebElement> options = driver.findElements(By.tagName("option"));
		for (WebElement option : options) {
			if (valToBeSelected.equalsIgnoreCase(option.getText())){
				option.click();
				break;
			}
		    }
	}
}
