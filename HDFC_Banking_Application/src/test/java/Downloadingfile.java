import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Downloadingfile {

	
	
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
          
		driver.get("https://demo.automationtesting.in/FileDownload.html");
	
	
}
   @Test
	public void downloadFile() {
		driver.get("https://demo.automationtesting.in/FileDownload.html");
    	 driver.findElement(By.xpath("//a[@type='button']")).click();
    	 
     }
	
}
