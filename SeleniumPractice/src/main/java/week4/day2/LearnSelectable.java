package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelectable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/selectable.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Actions builder = new Actions(driver);

		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		// WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		// WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));

		// builder.keyDown(Keys.CONTROL).click(item1).click(item4).click(item3).click(item2).keyUp(Keys.CONTROL).perform();

		builder.clickAndHold(item1).moveToElement(item4).release().perform();

		Thread.sleep(2000);

		driver.quit();

	}

}