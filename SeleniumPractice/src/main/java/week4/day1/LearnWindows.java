package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindows {
	
	public static void main(String[] args) throws InterruptedException {

		// Set up driver
		WebDriverManager.chromedriver().setup();

		// Launch browser
		ChromeDriver driver = new ChromeDriver();

		// Go to URL
		driver.get("http://leafground.com/pages/Window.html");

		// Maximize the window
		driver.manage().window().maximize();

		System.out.println("Parent window title: " + driver.getTitle());

		// String window = driver.getWindowHandle();

		driver.findElement(By.id("home")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> handles = new ArrayList<String>(windowHandles);

		System.out.println("windows size: " + handles.size());

		driver.switchTo().window(handles.get(1));
		System.out.println("Child window title: " + driver.getTitle());

		driver.quit();
	}
}