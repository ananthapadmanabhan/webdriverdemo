package com.test.page.testcases.googleTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.test.page.pages.GooglePage;
import com.test.page.testcases.MasterTestCase;



public class googleSearchTest extends MasterTestCase{
	@Test(description = "Google Search test")
	@Parameters({"Browser"})
public void myGoogleTest(String browser) throws Exception{
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		GooglePage gpage = new GooglePage(driver);
		gpage.tbox_search.typeText("cricket");
		Thread.sleep(3000);
		gpage.btn_search.click();
		Thread.sleep(5000);
		
}
}
