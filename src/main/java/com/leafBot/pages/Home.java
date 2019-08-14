package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class Home extends ProjectSpecificMethods {
	public Home() {
		PageFactory.initElements(driver.getDriver(), this);
	}

	@FindBy(how = How.TAG_NAME, using = "h2")
	private WebElement welcomeDemoSales;

	public Home getTextOfWelcomeDemoSales() {
		System.out.println(getElementText(welcomeDemoSales));
		return this;
	}

}
