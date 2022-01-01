package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToInteractMultipleElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		List<WebElement> findElements = driver.findElements(By.tagName("a"));

		System.out.println("Links on Facebook: " + findElements.size());

		driver.get("http://leafground.com/pages/Link.html");

		findElements = driver.findElements(By.tagName("a"));

		System.out.println("Links on LeafGround: " + findElements.size());

		driver.get("http://leaftaps.com/opentaps/control/main");

		findElements = driver.findElements(By.className("inputLogin"));

		System.out.println("Inputs on LeafTap: " + findElements.size());

		for (WebElement el : findElements)
			System.out.println(el.getAttribute("name"));

		driver.quit();

	}

}