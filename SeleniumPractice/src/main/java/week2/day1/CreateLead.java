package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

		// leafground.com

		// Setup chrome browser
		// WebDriverManager.chromedriver().setup();

		// Get driver location
		// System.out.println(System.getProperty("webdriver.chrome.driver"));

		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--incognito");

		// Launch the chrome browser
		// ChromeDriver driver = new ChromeDriver(options);

		// Setup firefox browser
		// WebDriverManager.firefoxdriver().setup();

		// Get driver location
		// System.out.println(System.getProperty("webdriver.firefox.driver"));

		// Launch the firefox browser
		// FirefoxDriver driver = new FirefoxDriver();

		// Setup edge browser
		WebDriverManager.edgedriver().setup();

		// Get driver location
		System.out.println(System.getProperty("webdriver.edge.driver"));

		// Launch the edge browser
		EdgeDriver driver = new EdgeDriver();

		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser
		driver.manage().window().maximize();

		// Get Page title and store in String variable
		String title = driver.getTitle();

		// Print page title
		System.out.println("Login Page Title: " + title);

		// find the username element and enter value
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		// find the password element and enter value
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// find the Login element and click
		driver.findElement(By.className("decorativeSubmit")).click();

		// Get Page title and store in String variable
		title = driver.getTitle();

		// Print page title
		System.out.println("Welcome Page Title: " + title);

		// find the CRM/SFA element and click
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Get Page title and store in String variable
		title = driver.getTitle();

		// Print page title
		System.out.println("CRM/SFA Page Title: " + title);

		// find the Create Lead element and click
		driver.findElement(By.linkText("Create Lead")).click();

		// Get Page title and store in String variable
		title = driver.getTitle();

		// Print page title
		System.out.println("Create Lead Page Title: " + title);

		// find the company name element and enter value
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		// find the first name element and enter value
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramesh");

		// find the last name element and enter value
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Garlapati");

		// find the source element and enter value
		WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select selectSource = new Select(sourceElement);
		selectSource.selectByVisibleText("Employee");

		// find the marketing campaign element and enter value
		WebElement campaignElement = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select selectCampaign = new Select(campaignElement);
		selectCampaign.selectByIndex(2);

		// find the first name local element and enter value
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Rams");

		// find the last name local element and enter value
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Gar");

		// find the salutation name element and enter value
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Dear");

		// find the birth date element and enter value
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/02/84");

		// find the Title element and enter value
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr");

		// find the department element and enter value
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");

		// find the annual revenue element and enter value
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("150000");

		// find the preferred currency element and enter value
		WebElement currencyElement = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select selectCurrency = new Select(currencyElement);
		selectCurrency.selectByValue("AFA");

		// find the industry element and enter value
		WebElement industryElement = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select selectIndustry = new Select(industryElement);
		selectIndustry.selectByValue("IND_AEROSPACE");

		// find the annual revenue element and enter value
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("500");

		// find the ownership element and enter value
		WebElement ownershipElement = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select selectOwnership = new Select(ownershipElement);
		selectOwnership.selectByIndex(3);

		// find the sic code element and enter value
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("45879");

		// find the ticket sybmol element and enter value
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("just");

		// find the description element and enter value
		driver.findElement(By.id("createLeadForm_description")).sendKeys("testing using selenium");

		// find the important note element and enter value
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("This is very important note");

		// find the country code element and enter value
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("5");

		// find the area code element and enter value
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("65");

		// find the phone number element and enter value
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7854698");

		// find the extension element and enter value
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("5578");

		// find the person to ask for element and enter value
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("general");

		// find the email element and enter value
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ram@gmail.com");

		// find the web url element and enter value
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://test.com");

		// find the to name element and enter value
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("to hello");

		// find the attention name element and enter value
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("for attention");

		// find the address line 1 element and enter value
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("street 1");

		// find the address line 2 element and enter value
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("colony2");

		// find the city element and enter value
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("abudhabi");

		// find the state element and enter value
		WebElement stateElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select selectState = new Select(stateElement);
		selectState.selectByIndex(3);

		// find the zip code element and enter value
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("547905");

		// find the country element and enter value
		WebElement countryElement = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select selectCountry = new Select(countryElement);
		selectCountry.selectByIndex(3);

		// find the zip code extension element and enter value
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("25487");

		// find the Create Lead element and click
		driver.findElement(By.name("submitButton")).click();

		// Get Page title and store in String variable
		title = driver.getTitle();

		// Print page title
		System.out.println("View Lead Page Title: " + title);

		// Get and Print the selected source
		WebElement viewSource = driver.findElement(By.id("viewLead_dataSources_sp"));
		System.out.println("Selected source:" + viewSource.getText());

		driver.close();
	}
}