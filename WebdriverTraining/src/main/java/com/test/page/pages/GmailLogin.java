package com.test.page.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.page.components.Button;
import com.test.page.components.TextBox;


public class GmailLogin {
	public TextBox tbox_username;
	public TextBox tbox_password;
	public Button btn_login;
	
	public GmailLogin(WebDriver driver){
		//log.info("Inside GooglePage -Before");
		tbox_username = new TextBox(driver,By.name("Email"),"Gmail Username");
		tbox_password = new TextBox(driver,By.name("Passwd"),"Gmail Password");
		btn_login = new Button(driver,By.name("signIn"),"SignIn");
		//log.info("Inside GooglePage -After");
		
		
	}
	
}
