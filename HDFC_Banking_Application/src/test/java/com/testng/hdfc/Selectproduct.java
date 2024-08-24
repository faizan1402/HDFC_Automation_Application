package com.testng.hdfc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selectproduct {

	WebDriver driver;

	@BeforeMethod
	public void setup() 
	{

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
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // load
		// the elements dynamically
		driver.get("https://www.hdfcbank.com/");

	}
	
	

	@Test
	public void loans() throws InterruptedException {
		
		
		WebElement newdropdown = driver.findElement(By.xpath("//a[contains(text(),'Select Product Type')]"));
		newdropdown.click();
		// parent xpath childxpath ->
		//Loans
		WebElement element = driver.findElement(By.cssSelector("ul[class='dropdown1 dropdown-menu']  li[value='5']"));
		element.click();
		
		
       driver.findElement(By.xpath("//div[@class='drp2']//a[@class='btn-primary dropdown-toggle btn-block']")).click();
		
       //  Home loans
		driver.findElement(By.cssSelector("ul[class='dropdown2 dropdown-menu'] li[value='1']")).click();
		
		//Apply Online
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Apply online')]")).click();
		
		
		
		
		
	}
	

	
	@AfterMethod
	public void tearDown() 
	{
		//driver.quit();

	}

}
