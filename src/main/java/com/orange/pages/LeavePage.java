package com.orange.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage extends BasePage {

	private static final Logger logger = Logger.getLogger(LoginPage.class.getName());
	
	@FindBy(xpath ="//span[text()='Leave']")
	private WebElement menuLeave;
	
	@FindBy(xpath ="//label[text()  = 'From Date']//following::div//div//div//input[@placeholder='yyyy-mm-dd']")
	private WebElement dtfrm;
	
	@FindBy(xpath ="//label[text()  = 'To Date']//following::div//div//div//input[@placeholder='yyyy-mm-dd']")
	private WebElement dtTo;
	
	@FindBy(xpath ="(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	private WebElement selectStatus;
	
	@FindBy(xpath ="//span[text()='Scheduled']")
	private WebElement ddSchedule;
	
	@FindBy(xpath ="(//div[text()='-- Select --'])[1]")
	private WebElement ddLeave;
	
	@FindBy(xpath ="//span[text()='CAN - Matternity']")
	private WebElement ddCan;
	
	@FindBy(xpath ="//input[@placeholder='Type for hints...']")
	private WebElement txtEmp;
	
	@FindBy(xpath ="(//div[@class='oxd-select-wrapper'])[2]")
	private WebElement subUnit;
	
	@FindBy(xpath ="//span[text()='Sales & Marketing']")
	private WebElement ddSales;
	
	@FindBy(xpath ="//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	private WebElement btnswitch;
	
	@FindBy(xpath ="//button[@type='submit']")
	private WebElement btnSubmit;
	
	public LeavePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLeaveMenu() {
		this.menuLeave.click();	
	}
	
	public void clickOnFromDate() {
		this.dtfrm.click();
		this.dtfrm.clear();
		this.dtfrm.sendKeys("2014-05-01");
		
	}
	
	public void clickOnToDate() {
	this.dtTo.click();
	this.dtTo.clear();
	this.dtTo.sendKeys("2018-08-08");
	}
	
	
	public void clickOnSelectStatus() {
		this.selectStatus.click();	
	}
	
	public void clickOnSchedule() {
		this.ddSchedule.click();	
	}
	
	public void clickOnddLeave() {
		this.ddLeave.click();	
	}
	
	public void clickOnddCan() {
		this.ddCan.click();	
	}
	
	public void clickOnEmp(String emp) {
		this.txtEmp.click();	
		this.txtEmp.sendKeys(emp);
	}
	
	public void clickOnsubUnit() {
		this.subUnit.click();	
    }
	
	public void clickOnddSales() {
		this.ddSales.click();	
	}
	
	public void clickOnbtnSwitch() {
		this.btnswitch.click();	
	}
	
	public void clickOnbtnSubmit() {
		this.btnSubmit.click();	
	}
}
