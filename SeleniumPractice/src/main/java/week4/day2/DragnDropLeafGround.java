package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragnDropLeafGround {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/drop.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Actions builder = new Actions(driver);

		WebElement dragEl = driver.findElement(By.id("draggable"));

		WebElement dropEl = driver.findElement(By.id("droppable"));

		// builder.dragAndDrop(dragEl, dropEl).perform();

		Thread.sleep(2000);

		org.openqa.selenium.Point location = dragEl.getLocation();
		System.out.println(location.getX() + " , " + location.getY());

		location = dropEl.getLocation();
		System.out.println(location.getX() + " , " + location.getY());

		builder.dragAndDropBy(dragEl, 100, 150).perform();

		Thread.sleep(2000);

		driver.quit();
	}
}