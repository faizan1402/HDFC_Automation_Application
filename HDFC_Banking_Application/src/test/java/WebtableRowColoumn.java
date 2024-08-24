import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebtableRowColoumn {

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

		// driver.get("https://www.w3schools.com/html/html_tables.asp");

	}

	@Test
	public void WebTableRowCol() {
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int colCount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();

		for (int i = 1; i < rowCount; i++) {
			for (int j = 1; j <=colCount; j++) {

				String actValue = driver
						.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + (i + 1) + "]/td[" + j + "]"))
						.getText();

				if (actValue.equals("Italy")) {

					System.out.println(i + " :" + j);
					
					break;
				}
				
				
				System.out.println(actValue);

			}
		}

	}

}
