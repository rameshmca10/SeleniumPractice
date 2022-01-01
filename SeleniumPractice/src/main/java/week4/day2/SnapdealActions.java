package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapdealActions {

	public static void main(String[] args) throws InterruptedException {

//	1. Launch https://www.snapdeal.com/
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.snapdeal.com");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//		2. Go to Mens Fashion

		WebElement mensFashion = driver
				.findElement(By.xpath("//a[@class='menuLinks leftCategoriesProduct ']/span[contains(text(),'Men')]"));
		WebElement shirts = driver.findElement(By.xpath("(//span[text()='Shirts'])[2]"));

		Actions builder = new Actions(driver);
		builder.moveToElement(mensFashion).perform();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(shirts));
		wait.until(ExpectedConditions.elementToBeClickable(shirts));

		builder.click(shirts).perform();

		WebElement wishList = driver.findElement(By.xpath("//span[@class='animated-icon']"));
		builder.moveToElement(wishList).perform();

		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();

//		3. Go to Sports Shoes
//		4. Get the count of the sports shoes
//		5. Click Training shoes
//		6. Sort by Low to High
//		7. Check if the items displayed are sorted correctly
//		8.Select the price range (900-1200)
//		9.Filter with color Navy 
//		10 verify the all applied filters 
//		11. Mouse Hover on first resulting Training shoes
//		12. click QuickView button
//		13. Print the cost and the discount percentage
//		14. Take the snapshot of the shoes.
//		15. Close the current window
//		16. Close the main window1. Launch https://www.snapdeal.com/
//			2. Go to Mens Fashion
//			3. Go to Sports Shoes
//			4. Get the count of the sports shoes
//			5. Click Training shoes
//			6. Sort by Low to High
//			7. Check if the items displayed are sorted correctly
//			8.Select the price range (900-1200)
//			9.Filter with color Navy 
//			10 verify the all applied filters 
//			11. Mouse Hover on first resulting Training shoes
//			12. click QuickView button
//			13. Print the cost and the discount percentage
//			14. Take the snapshot of the shoes.
//			15. Close the current window
//			16. Close the main window

		driver.close();
	}
}