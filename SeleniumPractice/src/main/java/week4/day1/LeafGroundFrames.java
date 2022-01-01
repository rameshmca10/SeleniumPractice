package week4.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundFrames {

	public static void main(String[] args) throws IOException {

//	http://leafground.com/pages/frame.html

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();

//		1.Take the the screenshot of the click me button of first frame

		driver.switchTo().frame(0);

		WebElement alertbox = driver.findElement(By.xpath("//button[text()='Click Me']"));
		File esource = alertbox.getScreenshotAs(OutputType.FILE);
		File edestination = new File("./Screenshots/leafgroundframealert.jpeg");
		FileUtils.copyFile(esource, edestination);

//		2.Find the number of frames
//		  - find the Elements by tagname - iframe
//		  - Store it in a list
//		  - Get the size of the list. (This gives the count of the frames visible to the main page)

		driver.quit();
	}
}