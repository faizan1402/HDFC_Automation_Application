import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Gmaillogin {
     
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\offic\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		// CFT (Automated Testing browser)
		options.setBinary("C:\\Users\\offic\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		options.addArguments("--disable-notifications");
		this.driver = new ChromeDriver(options);
		
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // means delete all cookies and catche
		// dynamic wait
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));//load the
		// page dynamically
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // load
		// the elements dynamically
		//driver.get("https://support.google.com/mail/answer/8494?hl=en&co=GENIE.Platform%3DDesktop");
		driver.get("https://support.google.com/");
	}
	
	
	@Test
	public void loginGmail() {
        
		//parent xpath and child xpath
		//driver.findElement(By.xpath("//li[@class='h-c-header__cta-li h-c-header__cta-li--primary']//a[@aria-label='Go to your Google Account'][normalize-space()='Go to Google Account']")).click();
        //parent path child path using css selector
		//driver.findElement(By.cssSelector("li[class='h-c-header__cta-li h-c-header__cta-li--primary'] a[class='h-c-header__cta-li-link h-c-header__cta-li-link--primary button-standard-mobile']")).click();
		driver.findElement(By.xpath("//a[@class='gb_Ea gb_wd gb_nd gb_ne']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("softfaizan55@gmail.com");
		driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
	}
	
	
	
	
	
	
}
