package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UiPathLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		// To launch URL
		Driver.get("https://acme-test.uipath.com/login");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rameshmca10@gmail.com");
		Driver.findElement(By.xpath("//input[@id='password']")).sendKeys("TestLeaf@2021");
		Driver.findElement(By.xpath("//button[text()[normalize-space()='Login']]")).click();

		String title = Driver.getTitle();
		System.out.println(title);
		Driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		Driver.close();
	}

}