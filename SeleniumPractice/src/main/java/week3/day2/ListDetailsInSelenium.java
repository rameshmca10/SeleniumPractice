package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListDetailsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com");
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(5000);
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total items in the list is  " + totalItems);
		List<WebElement> brandList = driver.findElements(By.className("brand"));
		System.out.println("No.Of Brand name " + brandList.size());
		System.out.println("Brand Name ");
		for (WebElement webElement : brandList) {
			String brandName = webElement.getText();
			System.out.println(brandName);
		}
		List<WebElement> productName = driver.findElements(By.className("nameCls"));
		System.out.println("No.Of Product name " + productName.size());
		System.out.println("Product Name ");
		for (WebElement webElement : productName) {
			String productName1 = webElement.getText();
			System.out.println(productName1);
		}
	}
}