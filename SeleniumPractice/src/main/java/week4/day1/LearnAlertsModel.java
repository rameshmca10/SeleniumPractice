package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlertsModel {

	public static void main(String[] args) throws InterruptedException {

		// Set up driver
		WebDriverManager.chromedriver().setup();

		// Launch browser
		ChromeDriver driver = new ChromeDriver();

		// Go to URL
		driver.get("http://leafground.com/pages/Alert.html");

		// Maximize the window
		driver.manage().window().maximize();

		// Click on Alert Box
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();

		// Switch focus to Alert
		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		// Perform action on alert
		alert.accept();

		Thread.sleep(2000);

		// Click on Alert Box
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();

		// Switch focus to Alert
		alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		// Perform action on alert
		alert.dismiss();

		Thread.sleep(2000);

		// Click on Alert Box
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();

		// Switch focus to Alert
		alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		String promptText = "TestLeaf";

		alert.sendKeys(promptText);

		// Perform action on alert
		alert.accept();

		Thread.sleep(2000);

		String text = driver.findElement(By.xpath("//p[@id='result1']")).getText();

		System.out.println(text);

		// Close the browser
		driver.close();
	}

}