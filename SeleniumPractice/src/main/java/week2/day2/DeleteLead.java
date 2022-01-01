package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		// http://leaftaps.com/opentaps/control/main

		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();

		// Delete Lead:
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

		System.out.print("Checking first lead - ");

		// 11 Capture lead ID of First Resulting lead
		String text = Driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		System.out.println(text);

		// 12 Click First Resulting lead
		Driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

		// 13 Click Delete
		Driver.findElement(By.xpath("//a[text()='Delete']")).click();

		// 14 Click Find leads
		Driver.findElement(By.linkText("Find Leads")).click();

		// 15 Enter captured lead ID
		Driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);

		// 16 Click find leads button
		Driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);

		// 17 Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		if(Driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']/div")).getText()=="No records to display");
		System.out.println("Record ID "+text+" is deleted successfully");

		// 18 Close the browser (Do not log out)
		Driver.close();
		System.out.println("Closed the browser");
	}

}