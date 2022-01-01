package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException {

//		1) Launch chrome and load URL - https://www.irctc.co.in/

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.irctc.co.in/");

		driver.manage().window().maximize();

//		2) Click on FLIGHTS link

		driver.findElement(By.xpath("//button[text()='OK']")).click();

		driver.findElement(By.linkText("FLIGHTS")).click();

//		3) Print the title of the Flights window

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> handles = new ArrayList<String>(windowHandles);

		System.out.println("windows size: " + handles.size());

		System.out.println("Parent window title: " + driver.getTitle());

		driver.switchTo().window(handles.get(1));
		System.out.println("Child window title: " + driver.getTitle());

//		4) Close the train search window (first window)

		driver.switchTo().window(handles.get(0)).close();

		// windowHandles = driver.getWindowHandles();

		// handles = new ArrayList<String>(windowHandles);

		driver.switchTo().window(handles.get(1));

		System.out.println("Child window title: " + driver.getTitle());

		driver.findElement(By.linkText("Contact Us")).click();

		Thread.sleep(5000);

		System.out.println(driver.findElement(By.xpath("//a[@class='dropdown-item'][1]")).getText());

//		5) Get the toll free (1800 110 139) from Flights window and print

		driver.quit();
	}

}