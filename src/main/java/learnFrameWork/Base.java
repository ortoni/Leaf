package learnFrameWork;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base {
	@Test
	public void login() throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leaftaps.com/opentaps");
		System.out.println("Browser launched suucessfully");
		Base b = new Base();
		WebElement user = driver.findElementById("username");
		WebElement password = driver.findElementById("password");

		b.type(user, "DemoSalesManager");
		b.type(password, "crmsfa");
		b.click(driver.findElementByClassName("decorativeSubmit"));
	File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotAs, new File("./snaps/img.png"));
	}
	public void click(WebElement ele) {
		ele.click();
		System.out.println("Element has been clicked");
	}
	
	public void type(WebElement ele, String text) {
		ele.clear();
		ele.sendKeys(text);
		System.out.println(text + " is entered successfully in the "+ele);
	}

}
