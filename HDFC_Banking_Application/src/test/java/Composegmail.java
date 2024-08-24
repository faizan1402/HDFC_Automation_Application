import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Composegmail {

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
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // load
		// the elements dynamically
		// driver.get("https://support.google.com/mail/answer/8494?hl=en&co=GENIE.Platform%3DDesktop");
		driver.get("https://support.google.com/");

	}

	// 1 - Logingmail
	@Test
	public void loginGmail() {

		// parent xpath and child xpath
		// driver.findElement(By.xpath("//li[@class='h-c-header__cta-li
		// h-c-header__cta-li--primary']//a[@aria-label='Go to your Google
		// Account'][normalize-space()='Go to Google Account']")).click();
		// parent path child path using css selector
		// driver.findElement(By.cssSelector("li[class='h-c-header__cta-li
		// h-c-header__cta-li--primary'] a[class='h-c-header__cta-li-link
		// h-c-header__cta-li-link--primary button-standard-mobile']")).click();
		driver.findElement(By.xpath("//a[@class='gb_Ea gb_wd gb_nd gb_ne']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("faizan14021997@gmail.com");
		driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
		//driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Faizan@12345");

	}

	/* compose gmail
	@Test
	public void composeGmail() {

		driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();
		// Email
		driver.findElement(By.xpath("//input[@id=':134']")).sendKeys("harry12@gmail.com");
		// Subject Title
		driver.findElement(By.xpath("//input[@id=':pf']")).sendKeys("Test Mail");

		// Body part
		driver.findElement(By.xpath("//div[@id=':ob']")).sendKeys("Test Email Body");

		// Set the label as social
		driver.findElement(By.xpath("//div[@id=':y8']//div[@class='J-J5-Ji J-JN-M-I-JG']")).click();

		Actions action = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//div[@id=':y5']//div[@class='J-N-Jz']"));
		action.moveToElement(move).build().perform();

		// Send
		driver.findElement(By.xpath("//div[@id=':pp']")).click();

		// Stared
		driver.findElement(By.xpath("//span[@id=':w0']")).click();

		System.out.println(driver.findElement(By.cssSelector("span[id=':w0']")).getText());

		// check recived mail
		driver.findElement(By.xpath("//img[@class='ajz']")).click();

		// select social label

		// Verify the Email Details
		// Verify that the email is labeled correctly as "Social"

		driver.findElement(By.xpath("//div[contains(text(),'Social')]//div")).click();
		// Verify that the subject of the received email is "Test Mail".
		driver.findElement(By.xpath("//img[@class='ajz']")).click();

		// Verify that the body of the received email is "Test Email Body

		System.out.println(driver.findElement(By.cssSelector("div[id=':2f'] div[dir='ltr']")).getText());

	}
	
	*/

}
