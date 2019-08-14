package com.leafBot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.leafBot.drivers.BrowserInstances;

public class TC {
@Test
	public  void main() {
	BrowserInstances driverFactory = BrowserInstances.getInstance();
	driverFactory.setDriver();
	RemoteWebDriver driver = driverFactory.getDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	System.out.println(driver.getTitle());
	driver.close();
	}
}
