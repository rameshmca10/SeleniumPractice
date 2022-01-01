package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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

		// find the Create Contact element and click
		driver.findElement(By.linkText("Create Contact")).click();

		// Get Page title and store in String variable
		title = driver.getTitle();

		// Print page title
		System.out.println("Create Contact Page Title: " + title);

		// find the first name element and enter value
		driver.findElement(By.id("firstNameField")).sendKeys("Ramesh");

		// find the last name element and enter value
		driver.findElement(By.id("lastNameField")).sendKeys("Garlapati");

		// find the Create Contact element and click
		driver.findElement(By.name("submitButton")).click();

		// Get Page title and store in String variable
		title = driver.getTitle();

		// Print page title
		System.out.println("View Contact Page Title: " + title);

		// Get and Print the selected source
		WebElement viewSource = driver.findElement(By.id("viewContact_firstName_sp"));
		System.out.println("First Name:" + viewSource.getText());

		driver.close();

	}

}