package com.testng.hdfc2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;
public class LaunchChrome {

	public static void main(String[] args) {
	    
	     // System.setProperty(key,value)
		
		
		/*	
		 Below chromeoptions and options.addArguments these are lines adding chrome 111.55 version this lattest version 
		 main problem socket problem
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\offic\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
	    WebDriver driver = new ChromeDriver(options); // launch the chrome browser
	    
	    */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\offic\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		
	    //latest chrome driver (path) 
		
		//WebDriverManager.chromedriver().setup();
		 ChromeOptions options = new ChromeOptions();
		
		 options.addArguments("--remote-allow-origins=*");
		
	    WebDriver driver = new ChromeDriver(options); // launch the chrome browser
		
	    
	     driver.get("http:www.google.com");
	       
	     
	     
	       String title = driver.getTitle(); // get title
	     
	     System.out.println(title);
	      
	     // validation point actual thing vs expected thing
	      
	     
	     if(title.equals("Google")) {
	    	 
	    	 System.out.println("correct title");
	     }
	     else {
	    	   
	    	 System.out.println("in-correct title");
	     }
	      
	       // print the Current Url
	      System.out.println(driver.getCurrentUrl());  //Current Url print
	      
	      // if you want to print source page
	      
	     // System.out.println(driver.getPageSource());
	      
	      driver.quit(); //If you want to close all the windows immediately.
	    
	}

}
