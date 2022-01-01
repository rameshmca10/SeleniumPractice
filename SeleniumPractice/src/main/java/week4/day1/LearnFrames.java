package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) throws InterruptedException {

		// Set up driver
		WebDriverManager.chromedriver().setup();

		// Launch browser
		ChromeDriver driver = new ChromeDriver();

		// Go to URL
		driver.get("http://leafground.com/pages/frame.html");

		// Maximize the window
		driver.manage().window().maximize();

		// Switch to frame
		driver.switchTo().frame(0);

		System.out.println("Frame Title: " + driver.getTitle());
		System.out.println("Before click: " + driver.findElement(By.id("click")).getText());

		driver.findElement(By.id("click")).click();

		System.out.println("After click: " + driver.findElement(By.id("click")).getText());

		driver.switchTo().defaultContent();

		Thread.sleep(5000);

		driver.switchTo().frame(1);
		System.out.println("Frame Title: " + driver.getTitle());

		driver.switchTo().frame(0);
		System.out.println("Frame Title: " + driver.getTitle());

		System.out.println("Before click1: " + driver.findElement(By.id("click1")).getText());

		driver.findElement(By.id("click1")).click();

		System.out.println("After click1: " + driver.findElement(By.id("click1")).getText());

		driver.switchTo().defaultContent();

		Thread.sleep(5000);

		System.out.println(driver.findElement(By.tagName("h1")).getText());

		driver.close();
	}
}