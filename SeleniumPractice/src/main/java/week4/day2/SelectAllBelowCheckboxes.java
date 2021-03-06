package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAllBelowCheckboxes {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/checkbox.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		List<WebElement> findElements = driver
				.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following::input"));

		System.out.println(findElements.size());

		for (WebElement el : findElements)
			el.click();

		driver.quit();
	}

}