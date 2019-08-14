package com.leafBot.testng.api.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.leafBot.selenium.api.base.SeleniumBase;

public class ProjectSpecificMethods extends SeleniumBase {

	public String browserName;
	public String dataSheetName;

	/*
	 * @BeforeSuite public void beforeSuite() { startResult(); }
	 * 
	 * @BeforeClass public void beforeClass() { startTestModule(testCaseName,
	 * testDescription); }
	 */

	@BeforeMethod
	public void beforeMethod() {
//		test = startTestCase("LOGIN");
//		test.assignCategory(category);
//		test.assignAuthor(authors);
		startApp("chrome", "http://leaftaps.com/opentaps/control/main");
	}

//	@AfterSuite
//	public void afterSuite() {
//		endResult();
//	}
//
	@AfterMethod
	public void afterMethod() {
		close();
	}

//	@DataProvider(name = "fetchData")
//	public Object[][] getData() {
//		return ReadExcel.getSheet(dataSheetName);
//	}

}