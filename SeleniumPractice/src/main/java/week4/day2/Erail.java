package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement source = driver.findElement(By.id("txtStationFrom"));

		source.clear();
		source.sendKeys("mas");
		Thread.sleep(500);
		source.sendKeys(Keys.TAB);

		WebElement destination = driver.findElement(By.id("txtStationTo"));

		destination.clear();
		destination.sendKeys("hyb");
		Thread.sleep(500);
		destination.sendKeys(Keys.TAB);

		driver.findElement(By.id("chkSelectDateOnly")).click();

		Thread.sleep(2000);

		int rows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr")).size();

		// int columns = driver.findElements(By.xpath("//table[@class='DataTable
		// DataTableHeader TrainList TrainListHeader']//tr[2]/td")).size();
		System.out.println(rows);

		List<String> trainsList = new ArrayList<String>();

		for (int j = 1; j <= rows; j++)
			trainsList.add(driver
					.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr[" + j + "]/td[2]"))
					.getText());

		Set<String> trainSet = new LinkedHashSet<String>(trainsList);

		if (trainsList.size() != trainSet.size())
			System.out.println("Duplicate trains");

		else
			System.out.println("No Duplicate trains");

		driver.quit();
	}

}