package com.test.framework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElements {
	//private static mx4j.log.Logger log = Logger.getLogger(WebElements.class.getName());
	private WebDriver driver;
	private By locator;
	private String label;
	
	public WebElements(WebDriver driver, String label) {
		this.driver = driver;
		this.label = label;
	}
	
	public WebElements(WebDriver driver, By locator, String label) {
		this.driver = driver;
		this.locator = locator;
		this.label = label;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public By getLocator() {
		return locator;
	}
	public String getLabel() {
		return label;
	}
	public void click() {
	//	log.info("click -Before -locator : "+locator);
		this.driver.findElement(locator).click();
		//log.info("click -After");
	}
	/*public void setSelected(){
		
//		waitForElementIdPresent(locator);
		if(!this.driver.findElement(locator).isSelected())
			this.driver.findElement(locator).setSelected();
	}
	
	public boolean toggle() {
		
		return this.driver.findElement(locator).toggle();
	}*/
}
