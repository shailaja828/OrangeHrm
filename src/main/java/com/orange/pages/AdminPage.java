package com.orange.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends BasePage {

	public AdminPage(WebDriver driver) {
		super(driver);
	PageFactory.initElements(driver, this);	
	}

	private static final Logger logger = Logger.getLogger(AdminPage.class.getName());

	@FindBy(xpath ="//span[text()='Admin']")
	private WebElement menuAdmin;

	@FindBy(xpath ="(//button[@type='button'])[4]")
	private WebElement btnAdd;
	
	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[1]")
	private WebElement ddSelect;
		
	@FindBy(xpath ="(//span[text()='Admin'])[2]")
	private WebElement ddUserRole;
	
	@FindBy(xpath ="//input[@placeholder='Type for hints...']")
	private WebElement txtEmpName;
	
	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[2]")
	private WebElement ddStatus;
	
	@FindBy(xpath ="//span[text()='Enabled']")
	private WebElement ddEnabled;
	
	@FindBy(xpath ="//input[@class='oxd-input oxd-input--active oxd-input--error']")
	private WebElement txtUsername;
	
	@FindBy(xpath ="(//input[@type='password'])[1]")
	private WebElement txtPwd;
	
	@FindBy(xpath ="//button[@type='submit']")
	private WebElement btnSbmit;
	
	public void clickOnAdmin() {
		this.menuAdmin.click();	
	}
	
	public void clickOnAdd() {
		this.btnAdd.click();	
	}
	
	public void clickOnDropDown() {
		this.ddSelect.click();	
	}
	
	public void clickOnDropDownUser() {
		this.ddUserRole.click();	
	}
	
	public void setEmpName(String emp) {
		this.txtEmpName.click();
		this.txtEmpName.sendKeys(emp);
	}
	
	public void clickOnDropDownStatus() {
		this.ddStatus.click();	
	}
	
	public void clickOnDropDownEnable() {
		this.ddEnabled.click();	
	}
	
	public void setUserName(String user) {
		this.txtUsername.click();
		this.txtUsername.sendKeys(user);
	}
	
	public void setPassword(String password) {
		this.txtPwd.click();
		this.txtPwd.sendKeys(password);
	}
	
	public void clickOnSubmit() {
		this.btnSbmit.click();	
	}

}
