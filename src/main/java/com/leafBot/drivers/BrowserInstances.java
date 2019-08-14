package com.leafBot.drivers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserInstances {

	private BrowserInstances() {}
	private static BrowserInstances instance = null;
	static ThreadLocal<RemoteWebDriver> remoteWebdriver = new ThreadLocal<RemoteWebDriver>();

	public static BrowserInstances getInstance() {
		if(instance == null) {
			instance = new BrowserInstances();
		}
		return instance;
	}
	public void setDriver() {
		remoteWebdriver.set(new ChromeDriver());
	}
	public RemoteWebDriver getDriver() {
		return remoteWebdriver.get();
	}
}