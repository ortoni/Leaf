package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class Login extends ProjectSpecificMethods {

	public Login() {
//		
		PageFactory.initElements(driver.getDriver(), this);
	}

	@FindBy(how = How.ID, using = "username")
	private WebElement demoSalesManager;

	public Login enterOnDemoSalesManager(String str) {
		clearAndType(demoSalesManager, str);
		return this;
	}

	@FindBy(how = How.ID, using = "password")
	private WebElement pASSWORD;

	public Login enterOnPASSWORD(String str) {
		clearAndType(pASSWORD, str);
		return this;
	}

	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")
	private WebElement login;

	public Home clickOnLogin() {
		click(login);
		return new Home();
	}
}
