package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/table.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		int rows = driver.findElements(By.xpath("//table[@id='table_id']//tr")).size();

		int columns = driver.findElements(By.xpath("//table[@id='table_id']//tr[2]/td")).size();

		// System.out.println("Second Row and First Column: "
		// +
		// driver.findElement(By.xpath("//table[@id='table_id']//tr[2]/td[1]")).getText());

		for (int i = 2; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				if (j == 3)
					driver.findElement(By.xpath("//table[@id='table_id']//tr[" + i + "]/td[" + j + "]/input")).click();
				else
					System.out.println("Table Data at row " + i + " , column " + j + " " + driver
							.findElement(By.xpath("//table[@id='table_id']//tr[" + i + "]/td[" + j + "]")).getText());
			}
		}

		Thread.sleep(5000);
		driver.quit();

	}

}