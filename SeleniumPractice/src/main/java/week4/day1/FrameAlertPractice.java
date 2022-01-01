package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameAlertPractice {
	public static void main(String[] args) throws InterruptedException {

		// Set up driver
		WebDriverManager.chromedriver().setup();

		// Launch browser
		ChromeDriver driver = new ChromeDriver();

		// Go to URL
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

		// Maximize the window
		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult");

		Thread.sleep(2000);

		System.out.println("Frame Title: " + driver.getTitle());

		// Click on Alert Box
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		// Switch focus to Alert
		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		String typeText = "Ramesh";

		alert.sendKeys(typeText);

		// Perform action on alert
		alert.accept();

		System.out.println(driver.findElement(By.id("demo")).getText());

		if (driver.findElement(By.id("demo")).getText().contains(typeText))
			System.out.println("Entered text is displayed");
		else
			System.out.println("Entered text is not displayed");

		driver.switchTo().defaultContent();

		driver.close();
	}
}