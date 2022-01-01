package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		// To launch URL
		Driver.get("https://dev97183.service-now.com/");

		// TO maximise a window
		Driver.manage().window().maximize();

		// to get the title of the page / URL.
		String title = Driver.getTitle();
		System.out.println(title);

		// Find element and perform action
		Driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		Driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("India@123");
		Driver.findElement(By.xpath("//input[@id='sysverb_login']")).click();
		Driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incident");
		Driver.findElement(By.xpath("(//div[text() = 'Create New'])[1]")).click();
	}

}