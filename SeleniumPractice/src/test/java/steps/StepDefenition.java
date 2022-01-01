package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefenition {

	public ChromeDriver driver;

	@Given("Open the chrome browser")
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}

	@And("Load the application URL")
	public void loadApplication() {

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	}

	@Given("Enter the username as {string}")
	public void enterUsername(String str) {
		driver.findElement(By.id("username")).sendKeys(str);

	}

	@And("Enter the password as {string}")
	public void enterPassword(String str) {
		driver.findElement(By.id("password")).sendKeys(str);

	}

	@When("Click on login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Homepage is displayed")
	public void verifyHomepage() {
		driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		driver.close();
	}

	@But("Error message is displayed")
	public void verifyErrorMessage() {
		String mesg = driver.findElement(By.id("errorDiv")).getText();
		System.out.println("Error Message: " + mesg);
		driver.close();
	}

}