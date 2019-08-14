package com.leafBot.testcases;

import org.testng.annotations.Test;

import com.leafBot.pages.Home;
import com.leafBot.pages.Login;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001 extends ProjectSpecificMethods {
//	@BeforeTest
	//	public void setData() {
	//		testCaseName = "Login";
	//		testDescription = "Check Parallel";
	//		authors = "koushik";
	//		category = "smoke";
	//
	//	}

	@Test
	public void login() {
		Home textOfWelcomeDemoSales = new Login().enterOnDemoSalesManager("Demosalesmanager").enterOnPASSWORD("crmsfa")
				.clickOnLogin().getTextOfWelcomeDemoSales();
		System.out.println(textOfWelcomeDemoSales);

	}

}
