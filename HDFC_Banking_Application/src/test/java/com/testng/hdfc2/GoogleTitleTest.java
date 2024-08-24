package com.testng.hdfc2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\offic\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
	//WebDriverManager.chromedriver().setup();
	  
	  //driver = new ChromeDriver(); //launch chrome driver
	  ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 WebDriver driver = new ChromeDriver(options);
	  driver.manage().window().maximize(); // maximize the window
	  driver.manage().deleteAllCookies(); //means delete all cookies and catche
		 //dynamic wait
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));//load the page dynamically
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // load the elements dynamically
	  driver.get("http:www.google.com");
	}
	//How to defined sequence keyword -> So using priority keyword
	
      @Test()
      public void googleTitleTest() {
    	  
    	  String title = driver.getTitle();
    	  System.out.println(title);
    	  
    	  //if i want to check the title is correct google title so check the validation using Assert method
    
   Assert.assertEquals(title,"Google","title is not matched"); // no need if else conditions just assert method implement
 // Assert.assertEquals(title,"Google") -> (actual result,expected result)-> if  both are match then test case passed or not match test case failed  
    	  
      }
     
      @Test()
      public void googleLogoTest() {
    	  
    	  boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
      }
      
      
      @AfterMethod
      public void tearDown() {
    	 // driver.quit();
      
      }

}
