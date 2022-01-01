package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	// http://leaftaps.com/opentaps/control/main
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();

		// Duplicate Lead:
		// 1 Launch the browser
		Driver.get("http://leaftaps.com/opentaps");
		Driver.manage().window().maximize(); // TO maximize a window
		String title = Driver.getTitle(); // to get the title of the page / URL.
		System.out.println(title);

		// 2 Enter the username
		Driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");

		// 3 Enter the password
		Driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		// 4 Click Login
		Driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

		// 5 Click crm/sfa link
		Driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();

		// 6 Click Leads link
		Driver.findElement(By.xpath("//a[text()='Leads']")).click();

		// 7 Click Find leads
		Driver.findElement(By.linkText("Find Leads")).click();

		Thread.sleep(3000);

		// 8 Click on Phone
		Driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner']//span)[2]")).click();

		// 9 Enter phone number
		Driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("54321");

		// 10 Click find leads button
		Driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(5000);

		// 11 Capture lead name of First Resulting lead
		String text = Driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"))
				.getText();
		System.out.println("Lead name before - " + text);

		// 12 Click First Resulting lead
		Driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();

		// 13 Click Duplicate Lead
		Driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		Thread.sleep(3000);

		// 14 Verify the title as'Duplicate Lead'
		System.out.println(Driver.findElement(By.id("sectionHeaderTitle_leads")).getText());

		// 15 Click Create Lead
		Driver.findElement(By.xpath("//input[@value='Create Lead']")).click();

		// 16 Confirm the duplicated lead name is same as captured name
		System.out
				.println("Lead name after duplicate - " + Driver.findElement(By.id("viewLead_firstName_sp")).getText());

		// 17 Close the browser (Do not log out)
		Driver.close();
	}

}