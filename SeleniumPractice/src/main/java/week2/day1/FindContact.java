package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContact {

	public static void main(String[] args) {
		// Setup edge browser
		WebDriverManager.edgedriver().setup();

		// Get driver location
		System.out.println(System.getProperty("webdriver.edge.driver"));

		// Launch the edge browser
		EdgeDriver driver = new EdgeDriver();

		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser
		driver.manage().window().maximize();

		// Get Page title and store in String variable
		String title = driver.getTitle();

		// Print page title
		System.out.println("Login Page Title: " + title);

		// find the username element and enter value
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		// find the password element and enter value
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// find the Login element and click
		driver.findElement(By.className("decorativeSubmit")).click();
		// Get Page title and store in String variable
		title = driver.getTitle();

		// Print page title
		System.out.println("Welcome Page Title: " + title);

		// find the CRM/SFA element and click
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Get Page title and store in String variable
		title = driver.getTitle();

		// Print page title
		System.out.println("CRM/SFA Page Title: " + title);

		// find the Contacts element and click
		driver.findElement(By.linkText("Contacts")).click();

		// Get Page title and store in String variable
		title = driver.getTitle();

		// Print page title
		System.out.println("Contacts Page Title: " + title);

		// find the Find Contact element and click
		driver.findElement(By.linkText("Find Contacts")).click();

		// Get Page title and store in String variable
		title = driver.getTitle();

		// Print page title
		System.out.println("Find Contact Page Title: " + title);

		// find the Email element and click
		driver.findElement(By.linkText("Email")).click();

		// find the email element and enter value
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");

		// find the Find Contact element and click
		driver.findElement(By.className("x-btn-text")).click();

		driver.close();

	}

}