package com.orange.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.orange.pages.AdminPage;

public class AdminTest extends BaseTest {
	private static final Logger logger = Logger.getLogger(AdminTest.class.getName());
	
	@BeforeClass
	@Parameters({ "driveURL", "browser" })
	public void initLogin(String driveURL, String browser) throws Exception {
		
		logger.info("Starting of initBoodmo method in AdminTest");

		this.driver = this.getWebDriver(browser, WEB_DRIVER.LOGIN_DRIVER);
		this.goToSite(driveURL, driver);
		this.adminPage = new AdminPage(this.driver);
		
		logger.info("Ending of initBoodmo method in AdminTest");

	} 

	@Test(priority = 1)
	public void logInTo() throws InterruptedException {
		logger.info("Starting of Admin method");
   
		adminPage.clickOnAdmin();
		adminPage.clickOnAdd();
		adminPage.clickOnDropDown();
		adminPage.clickOnDropDownUser();
		adminPage.setEmpName(testDataProp.getProperty("empName"));
		adminPage.clickOnDropDownStatus();
		adminPage.clickOnDropDownEnable();
		adminPage.setUserName(testDataProp.getProperty("username"));
		adminPage.setPassword(testDataProp.getProperty("pwd"));
		adminPage.clickOnSubmit();
	
	}
	
	
}	
