package com.orange.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfoPage extends BasePage {

	public MyInfoPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
		}

	private static final Logger logger = Logger.getLogger(RecruitmentPage.class.getName());

	@FindBy(xpath = "//span[text()='My Info']")
	private WebElement mnuMyInfo;
	
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@name='middleName']")
	private WebElement txtMiddleName;

	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement txtLastName;
	
	@FindBy(xpath = "//div//div//div//div//following::label[text() = 'Nickname']//following::input[@class='oxd-input oxd-input--active']")
	private WebElement txtNickName;
	
	@FindBy(xpath = "//div//div//div//div//following::label[text() = 'Other Id']//following::input[@class='oxd-input oxd-input--active']")
	private WebElement txtId;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
	private WebElement txtDL;
	
	@FindBy(xpath = "//input[@placeholder='yyyy-mm-dd' and @class='oxd-input oxd-input--active']")
	private WebElement licenseExpiryDate;
	
	@FindBy(xpath = "//label[text()='SSN Number']//following::div//input[@class='oxd-input oxd-input--active']")
	private WebElement txtSSN_Number;
			
	@FindBy(xpath = "//label[text()='SIN Number']//following::div//input[@class='oxd-input oxd-input--active']")
	private WebElement txtSIN_Number;
	
	@FindBy(xpath = "//label[text()='Nationality']//following::div//div[@class='oxd-select-text oxd-select-text--active']")
	private WebElement txtNationality;
	
	@FindBy(xpath = "//span[text()='Bahamian']")
	private WebElement ddBahamian;
	
	@FindBy(xpath = "//label[text()='Marital Status']//following::div//div[@class='oxd-select-text oxd-select-text--active']")
	private WebElement txtMartialStatus;
	
	@FindBy(xpath = "//span[text()='Single']")
	private WebElement ddSingle;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkbox;
	
	public void clickOnMyInfo() {
		this.mnuMyInfo.click();	
	}
	
	public void setFname(String fname) {
		this.mnuMyInfo.click();	
		this.txtFirstName.clear();
		this.txtFirstName.sendKeys(fname);
	}
	
	public void setMiddlename(String Middlename) {
		this.mnuMyInfo.click();	
		this.txtMiddleName.clear();
		this.txtMiddleName.sendKeys(Middlename);
	}
	
	public void setLastname(String Lastname) {
		this.mnuMyInfo.click();	
		this.txtLastName.clear();
		this.txtLastName.sendKeys(Lastname);
	}
	
	public void setNickname(String Nickname) {
		this.mnuMyInfo.click();	
		this.txtNickName.clear();
		this.txtNickName.sendKeys(Nickname);
	}
	
	public void setId(String Id) {
		this.mnuMyInfo.click();	
		this.txtId.clear();
		this.txtId.sendKeys(Id);
	}
	
	public void setDrLicense(String txtDL) {
		this.mnuMyInfo.click();	
		this.txtDL.clear();
		this.txtDL.sendKeys(txtDL);
	}
	
	public void setCalender(String Calender) {
		this.mnuMyInfo.click();	
		this.licenseExpiryDate.clear();
		this.licenseExpiryDate.sendKeys(Calender);
	}
	
	public void setSSN(String SSN_Number) {
		this.mnuMyInfo.click();	
		this.txtSSN_Number.clear();
		this.txtSSN_Number.sendKeys(SSN_Number);
	}
	
	public void setSIN(String SIN_Number) {
		this.mnuMyInfo.click();	
		this.txtSIN_Number.clear();
		this.txtSIN_Number.sendKeys(SIN_Number);
	}
	
	public void clickonNationality() {
		//this.txtNationality.clear();
		this.txtNationality.click();
	}
	
	public void selectDdBahamian() {
		this.ddBahamian.click();	
	}
	
	public void clickOnMartialStatus() {
		//this.txtMartialStatus.clear();
		this.txtMartialStatus.click();
	}
	
	public void selectDdSingle() {
		this.ddSingle.click();	
	}
	
	public void clickOnCheckbox() throws InterruptedException {
		Thread.sleep(2000);
		this.checkbox.click();	
	}
}
