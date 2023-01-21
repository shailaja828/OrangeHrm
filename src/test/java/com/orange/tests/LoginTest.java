package com.orange.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.orange.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	private static final Logger logger = Logger.getLogger(LoginTest.class.getName());
	
	@BeforeClass
	@Parameters({ "driveURL", "browser" })
	public void initLogin(String driveURL, String browser) throws Exception {
		logger.info("Starting of initBoodmo method in LoginTest");

		this.driver = this.getWebDriver(browser, WEB_DRIVER.LOGIN_DRIVER);
		
		this.goToSite(driveURL, driver);
		
		this.loginpage = new LoginPage(this.driver);
		logger.info("Ending of initBoodmo method in LoginTest");

	}
	
	@Test(priority = 1, dataProvider="getDataFromExcel", dataProviderClass=ExcelTest.class)
	public void logInTo(String username, String password) throws InterruptedException {
		
        this.loginpage.setUsername(username);
		 this.loginpage.setPassword(password);
		 this.loginpage.clickOnLoginButton();

		logger.info("Ending of login method");
		driver.quit();
}
	
}