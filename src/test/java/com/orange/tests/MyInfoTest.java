package com.orange.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.orange.pages.LeavePage;
import com.orange.pages.MyInfoPage;
import com.orange.tests.BaseTest.WEB_DRIVER;

public class MyInfoTest extends BaseTest {

		private static final Logger logger = Logger.getLogger(MyInfoTest.class.getName());

		@BeforeClass
		@Parameters({ "driveURL", "browser" })
		public void initMyInfo(String driveURL, String browser) throws Exception {
			logger.info("Starting of initBoodmo method in MyInfoTest");

			this.driver = this.getWebDriver(browser, WEB_DRIVER.LOGIN_DRIVER);

			this.goToSite(driveURL, driver);
	      
			this.myinfopage = new MyInfoPage(this.driver);
			
			logger.info("Ending of initBoodmo method in MyInfoTest");
			
		}
		
		@Test(priority = 1)
		public void myInfo() throws InterruptedException {
			
	         this.myinfopage.clickOnMyInfo();
	         this.myinfopage.setFname("sylu");
	         this.myinfopage.setMiddlename("Shailaja");
	         this.myinfopage.setLastname("Vemunuri");
	         this.myinfopage.setNickname("Sylu");
	         this.myinfopage.setId("6644");
	         this.myinfopage.setDrLicense("548484");
	         this.myinfopage.setCalender("26-12-2023");
	         this.myinfopage.setSSN("1111");
	         this.myinfopage.setSIN("2623");
	         this.myinfopage.clickonNationality();
	         this.myinfopage.selectDdBahamian();
	         this.myinfopage.clickOnMartialStatus();
	         this.myinfopage.selectDdSingle();
	         this.myinfopage.clickOnCheckbox();

    
		}
}
