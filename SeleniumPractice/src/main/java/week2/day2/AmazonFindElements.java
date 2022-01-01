package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonFindElements {
//	Title - To practice findElements (multiple elements)
	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Load the URL - "https://www.amazon.in/"
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		// Search in the search box as 'USI punching bag'
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("USI punching bag");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

		// check 'Eligible for Pay On Delivery' checkbox
		driver.findElement(By.xpath("//span[contains(text(),'Eligible')]/preceding-sibling::div")).click();

		// find all the bag names and store it in a list

		Thread.sleep(3000);
		// print the size
		String result = driver
				.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span")).getText();
		String[] str = result.split(" ");

		int searchResults = Integer.parseInt(str[2]);
		System.out.println("Results: " + searchResults);

		int i = 0, j = 0, k = 1;

		// Iterate it over an array and print the bag names
		boolean nextPage = true;

		while (nextPage) {

			int elePage = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"))
					.size();

			i = i + elePage;

			System.out.println("\nNumber of results on Page " + k + ": " + elePage);

			for (j = 1; j <= elePage; j++) {
				System.out.println(driver
						.findElement(
								By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[" + j + "]"))
						.getText());

			}

			if (i < searchResults) {
				k = k + 1;
				driver.findElement(By.xpath("//a[text()='Next']")).click();
				Thread.sleep(3000);

			} else
				nextPage = false;

		}

		// Close the browser
		driver.close();
	}

}