package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsPractice {

	public static void main(String[] args) throws InterruptedException {

		// Set up driver
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.setHeadless(true);

		// Launch browser
		ChromeDriver driver = new ChromeDriver(options);

		// Go to URL
		driver.get("https://www.irctc.co.in/nget/train-search");

		// Maximize the window
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='OK']")).click();

		System.out.println("Parent window title: " + driver.getTitle());

		// String window = driver.getWindowHandle();

		driver.findElement(By.linkText("FLIGHTS")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> handles = new ArrayList<String>(windowHandles);

		System.out.println("windows size: " + handles.size());

		driver.switchTo().window(handles.get(1));
		System.out.print("Child window title: " + driver.getTitle());

		driver.switchTo().window(handles.get(0));

		driver.close();

		// driver.quit();
	}
}