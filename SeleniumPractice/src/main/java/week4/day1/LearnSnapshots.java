package week4.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSnapshots {

	public static void main(String[] args) throws InterruptedException, IOException {

		// Set up driver
		WebDriverManager.chromedriver().setup();

		// Launch browser
		ChromeDriver driver = new ChromeDriver();

		// Go to URL
		driver.get("http://leafground.com/pages/Alert.html");

		// Maximize the window
		driver.manage().window().maximize();

		// Click on Alert Box
		// driver.findElement(By.xpath("//button[text()='Alert Box']")).click();

		// Switch focus to Alert
		// Alert alert = driver.switchTo().alert();

		// System.out.println(alert.getText());

		// Entire page screenshot
		File psource = driver.getScreenshotAs(OutputType.FILE);
		File pdestination = new File("./Screenshots/leafgroundpage.jpeg");
		FileUtils.copyFile(psource, pdestination);

		// Webelement screenshot
		WebElement alertbox = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		File esource = alertbox.getScreenshotAs(OutputType.FILE);
		File edestination = new File("./Screenshots/leafgroundalert.jpeg");
		FileUtils.copyFile(esource, edestination);

		driver.quit();

	}
}