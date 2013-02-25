package com.test.page.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.page.components.Button;
import com.test.page.components.TextBox;
import com.test.page.testcases.MasterTestCase;

public class GooglePage {
	//private static Logger log = Logger.getLogger(MasterTestCase.class.getName());
	public TextBox tbox_search;
	public Button btn_search;
	
	public GooglePage(WebDriver driver){
		//log.info("Inside GooglePage -Before");
		tbox_search = new TextBox(driver,By.name("q"),"Google search");
		btn_search = new Button(driver,By.name("btnG"),"Search");
		//log.info("Inside GooglePage -After");
	}

}