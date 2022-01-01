package week5.day1;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	EdgeDriver driver;
	String title;

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("Before Method ");
		// Setup edge browser
		WebDriverManager.edgedriver().setup();

		// Get driver location
		System.out.println(System.getProperty("webdriver.edge.driver"));

		// Launch the edge browser
		driver = new EdgeDriver();

		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser
		driver.manage().window().maximize();

		// Get Page title and store in String variable
		title = driver.getTitle();

		// Print page title
		System.out.println("Login Page Title: " + title);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method ");
		driver.quit();
	}
}