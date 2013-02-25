package com.test.page.testcases.GmailTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.test.page.pages.GmailLogin;
import com.test.page.pages.GooglePage;
import com.test.page.testcases.MasterTestCase;



public class gmailLoginTest extends MasterTestCase{
	@Test(description = "Google Search test")
	@Parameters({"Browser"})
public void myGmailTest(String browser) throws Exception{
		driver.get("http://www.gmail.com");
		
		GmailLogin glogin = new GmailLogin(driver);
		glogin.tbox_username.typeText("mailtoanantha");
		glogin.tbox_password.typeText("Ananth@123");
		glogin.btn_login.click();
		//GooglePage gpage = new GooglePage(driver);
		//gpage.tbox_search.typeText("cricket");
		//gpage.btn_search.click();
		
}
}
