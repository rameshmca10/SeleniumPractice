package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {

		// To initiate chrome web driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();

		// 1. Launch URL "https://www.myntra.com/"
		Driver.get("https://www.myntra.com/");

		// 2. Maximize the browser
		Driver.manage().window().maximize(); // TO maximize a window

		String title = "Shirt";

		// 3. Search 'Shirt' in the Search bar [find it using Xpath]
		Driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Shirt", Keys.ENTER);

		title = Driver.findElement(By.xpath("//h1[@class='title-title']")).getText();
		String itemsReturned = Driver.findElement(By.xpath("//span[@class='title-count']")).getText();

		System.out.println("searched with " + title + ": returned " + itemsReturned);

		// 4. Check U.S Polo Assn under brand
		Driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("//label[text()='U.S. Polo Assn.']")).click();

		// 5. Sort by 'what's new'
		System.out.println("mouse hover on sorting");
		Actions actions = new Actions(Driver);
		actions.moveToElement(Driver.findElement(By.xpath("//div[@class='sort-sortBy']"))).perform();
		System.out.println(Driver.findElements(By.xpath("//div[@class='sort-sortBy']")).size());
		System.out.println("Selecting What's New");
		Thread.sleep(1000);

		System.out.println(Driver.findElements(By.xpath("//input[@value='new']")).size());

		actions.moveToElement(Driver.findElement(By.xpath("//input[@value='new']"))).click().perform();
		// Thread.sleep(2000);
		// actions.click().build().perform();

		// new WebDriverWait(Driver, Duration.ofSeconds(10))
		// .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='new']"))).click();

		// 6. Get all the prices of the shirts available and store it in a List and
		// Print all the prices of the Shirts

		// Close the driver
		// Driver.close();

	}

}