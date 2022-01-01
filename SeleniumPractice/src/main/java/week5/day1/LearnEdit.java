package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnEdit {

	@Test
	public void learnEdit() {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("babu@testleaf.com");
		driver.findElement(By.id("email")).clear();

		driver.findElement(By.id("email")).sendKeys(" Babu", Keys.TAB);
		
		driver.quit();

	}

}