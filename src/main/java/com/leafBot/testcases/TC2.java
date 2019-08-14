package com.leafBot.testcases;

import org.testng.annotations.Test;

import com.leafBot.pages.Home;
import com.leafBot.pages.Login;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC2 extends ProjectSpecificMethods {
//	@BeforeTest
//	public void setData() {
//		testCaseName = "Login 2";
//		testDescription = "Check Parallel 2";
//		authors = "koushik";
//		category = "smoke";
//	}

	@Test
	public void login() {
		Home textOfWelcomeDemoSales = new Login()
				.enterOnDemoSalesManager("Demosalesmanager")
				.enterOnPASSWORD("crmsfa")
				.clickOnLogin()
				.getTextOfWelcomeDemoSales();
		System.out.println(textOfWelcomeDemoSales);

	}

}
