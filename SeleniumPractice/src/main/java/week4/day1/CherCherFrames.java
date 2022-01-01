package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CherCherFrames {

	// https://chercher.tech/practice/frames-example-selenium-webdriver

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		driver.switchTo().frame(0);

		System.out.println(driver.findElement(By.id("topic")).getText());

		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Hello Frame 1");

		driver.switchTo().frame("frame3");

		driver.findElement(By.xpath("//b[text()='Inner Frame Check box :']/following-sibling::input")).click();

		driver.switchTo().defaultContent();

		driver.switchTo().frame(driver.findElement(By.id("frame2")));

		new Select(driver.findElement(By.id("animals"))).selectByIndex(2);

		driver.close();
	}

}