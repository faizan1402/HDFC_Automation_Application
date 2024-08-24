package com.testng.hdfc2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HoverClass {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // till the maximum 30sec before throwing

		driver.get("https://www.flipkart.com/");

		Actions a = new Actions(driver);// so actions class is using for hover the mouse

		WebElement move = driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));

		a.moveToElement(move).build().perform();// move to element method

		driver.findElement(By.linkText("Women Ethnic")).click();

		boolean text = driver.findElement(By.xpath("//h1[contains(text(),'Women Ethnic Wear')]")).isDisplayed();

		if (text) {

			System.out.println("Women Ethnic is here");
		}

		else {

			System.out.println("Women Ethnic is not here");
		}

		// a.moveToElement(move).build().perform();

	}

}
