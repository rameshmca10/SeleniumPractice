package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlertsNonModel {

	public static void main(String[] args) {

		// Set up driver
		WebDriverManager.chromedriver().setup();

		// Launch browser
		ChromeDriver driver = new ChromeDriver();

		// Go to URL
		driver.get("http://leafground.com/pages/Alert.html");

		// Maximize the window
		driver.manage().window().maximize();

		// Click on Alert Box
		driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();

		System.out.println(driver.findElement(By.xpath("//button[@class='swal-text']")).getText());

		driver.findElement(By.xpath("//button[text()='OK']")).click();

		// Close the browser
		driver.close();
	}

}