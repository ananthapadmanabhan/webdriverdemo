package com.test.page.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class MasterTestCase {
	//private static Logger log = Logger.getLogger(MasterTestCase.class.getName());
	public static WebDriver driver = null;

	@BeforeMethod
	@Parameters({"Browser"})
	protected void setUp(String browser) throws Exception {
		//DOMConfigurator.configure("log4j.xml");
		//log.info("BeforeMethod - Setup");
    	if(browser.equalsIgnoreCase("*firefox")){
			System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver=new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("*iexplore")) {
			DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
			cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			driver = new InternetExplorerDriver(cap);
		}else if (browser.equalsIgnoreCase("*chrome")) {
			driver=new ChromeDriver();
		}else {
			System.out.println("Browser : Invalid" );
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	
	public boolean verifyPage(WebDriver driver,String searchText) throws Exception {
		//log.info("Asserting the text "+searchText);
		String source = driver.getPageSource();
		if (!source.contains(searchText)) {
			//log.info(searchText+"  is not present in the page.");
			//throw new Exception("Expected page with text ' " + searchText + " ' is not found .");
			return false;
		}else{
		//log.info("' "+searchText+ " ' is present in the page with title " + driver.getTitle());
		return true;
		}
		
	}
	
	
	
	
	@AfterMethod
	protected void tearDown() throws Exception {
		//log.info("AfterMethod - Driver Close");
		driver.quit();
	}
}
