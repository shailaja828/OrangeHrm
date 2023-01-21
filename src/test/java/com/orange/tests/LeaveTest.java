package com.orange.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.orange.pages.LeavePage;


public class LeaveTest extends BaseTest {

	private static final Logger logger = Logger.getLogger(LeaveTest.class.getName());

	@BeforeClass
	@Parameters({ "driveURL", "browser" })
	public void initLogin(String driveURL, String browser) throws Exception {
		logger.info("Starting of initBoodmo method in leaveTest");

		this.driver = this.getWebDriver(browser, WEB_DRIVER.LOGIN_DRIVER);

		this.goToSite(driveURL, driver);
      
		this.leavepage = new LeavePage(this.driver);
		
		logger.info("Ending of initBoodmo method in leaveTest");

	}
	
	@Test(priority = 1)
	public void leave() throws InterruptedException {
		logger.info("Starting of leave method");

		/*
		 * try { Thread.sleep(2000); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */
		
		logger.info("Starting of leave method");
		
         this.leavepage.clickOnLeaveMenu();
		 this.leavepage.clickOnFromDate();
		 this.leavepage.clickOnToDate();
		 this.leavepage.clickOnSelectStatus();
		 this.leavepage.clickOnSchedule();
		 this.leavepage.clickOnddLeave();
		 this.leavepage.clickOnddCan();
		 this.leavepage.clickOnEmp(testDataProp.getProperty("emp.text"));
		 this.leavepage.clickOnsubUnit();
		 this.leavepage.clickOnddSales();
		 this.leavepage.clickOnbtnSwitch();
		 this.leavepage.clickOnbtnSubmit();

		logger.info("Ending of leave method");
}

}
