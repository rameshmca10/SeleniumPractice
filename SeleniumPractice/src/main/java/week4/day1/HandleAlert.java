package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlert {

	public static void main(String[] args) {

//		1) Launch the URL - https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

//		2) Maximize the browser

		driver.manage().window().maximize();

//		3) Set the TimeOuts

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

//		4) Switch in to the frame

		driver.switchTo().frame(0);

//		5) Click on the Try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

//		6) Enter your name in the Alert's text box

		String name = "Ramesh";

		Alert alert = driver.switchTo().alert();
		alert.sendKeys(name);

//		7) Accept the Alert

		alert.accept();

//		8) Verify your name in the text and print it

		System.out.println(name + ": " + driver.findElement(By.id("demo")).getText().contains(name));

		driver.close();

	}

}