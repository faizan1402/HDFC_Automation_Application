package com.testng.hdfc;

import java.time.Duration;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hdfchoverclass {

	
	WebDriver driver;

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\offic\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		// WebDriver driver = new ChromeDriver(options);
		/*
		 * how to disable chrome notification using chromeoptions class and using
		 * --disable-notifications -> this message type
		 */
		options.addArguments("--disable-notifications");
		this.driver = new ChromeDriver(options);
		
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // means delete all cookies and catche
		// dynamic wait
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));//load the
		// page dynamically
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // load
		// the elements dynamically
		driver.get("https://www.hdfcbank.com/");

	}



@Test
public void hdfchover() {
	
	Actions a = new Actions(driver);
	
	 driver.findElement(By.cssSelector(".desktop-login.position-find.btn.btn-primary.login-btn.hide-in-mobileApp.ng-scope")).click();
	
	
	a.moveToElement(driver.findElement(By.cssSelector(".desktop-login.position-find.btn.btn-primary.login-btn.hide-in-mobileApp.ng-scope"))).build().perform();
	driver.findElement(By.linkText("NetBanking")).click();
	
	
	
}

@Test
public void close() throws InterruptedException {
	
	Thread.sleep(2000);
	driver.findElement(By.cssSelector(".onetrust-close-btn-handler.banner-close-button.ot-close-icon")).click();
}



@After
public void tearDown() {
	driver.quit();

}



}
