package com.orange.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.orange.pages.LoginPage;
import com.orange.pages.RecruitmentPage;

public class RecruitmentTest extends BaseTest {
	
	private static final Logger logger = Logger.getLogger(RecruitmentTest.class.getName());
	
	@BeforeClass
	@Parameters({ "driveURL", "browser" })
	public void initLogin(String driveURL, String browser) throws Exception {
		logger.info("Starting of initBoodmo method in RecruitmentTest");

		this.driver = this.getWebDriver(browser, WEB_DRIVER.LOGIN_DRIVER);
		
		this.goToSite(driveURL, driver);
		
		this.recruitmentpage = new RecruitmentPage(this.driver);
		logger.info("Ending of initBoodmo method in RecruitmentTest");

	}
	@Test(priority = 1)
	public void recruitmentTest() throws InterruptedException {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		logger.info("Starting of RecruitmentTest method");
		
		recruitmentpage.clickOnRecruitmentmnu();
		recruitmentpage.clickOnAddBtn();
		recruitmentpage.setFirstName(testDataProp.getProperty("first.name.text"));
		recruitmentpage.setMiddleName(testDataProp.getProperty("middle.name.text"));
		recruitmentpage.setLastName(testDataProp.getProperty("last.name.text"));
		recruitmentpage.clickOnVanacyDd();
		recruitmentpage.setEmail(testDataProp.getProperty("email.text"));
		recruitmentpage.setContact(testDataProp.getProperty("contact.text"));
		recruitmentpage.uploadAddInvoiceFile();
		recruitmentpage.clickOnCheckBox();
		recruitmentpage.clickOnSubmitBtn();
		

		logger.info("Ending of RecruitmentTest method");
	}
}
