package homework2;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddContact {
	
	//Scenario: CRM -> Customers -> Add Contact - Add contact and validate contact added in List Contacts
	//Open Browser and go to site http://techfios.com/test/billing/?ng=admin/
	//Enter username:  demo@techfios.com 
	//Enter password: abc123
	//Click login button
	//Click on Customers button in the Side Navigation
	//Click on Add Customer
	//Fill in the Add Customer Form
	//Click submit
//	Go to CRM -> List Customer Page
//	Search for the new Customer in the search field
//	Validate contact Customer ​

	WebDriver driver;

	// storing in By class
	By userNameField = By.xpath("// input[@id='username']");
	By passwordFieled = By.xpath("//input[@id=\"password\"]");
	By signinButtonField = By.xpath("/html/body/div/div/div/form/div[3]/button");
	By dashboardHeaderField = By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2");
	By customerMenufield = By.xpath("//*[@id='side-menu']/li[3]/a/span[1]");

	By addCustomerfield = By.xpath("//ul[@id='side-menu']/li[3]/ul/li[1]/a");
	By Addcontactfield = By.xpath("//div[@class='col-md-12']/div/div/h5");
	By fullNamefield = By.xpath("//input[@id='account']");
	By CompanyDropdownfield = By.xpath("//select[@id='cid']");
	By emailfield = By.xpath("//input[@id='email']");
	By phonenumberfield = By.xpath("//input[@id='phone']");
	By addressfield = By.xpath("//input[@id='address']");
	By cityfield = By.xpath("//input[@id='city']");
	By stateRegionfield = By.xpath("//input[@id=\"state\"]");
	By postalcodefield = By.xpath("//input[@id=\"zip\"]");
	By countryDropdownfield = By.xpath("//select[@id='country']");
	By tagfield = By.xpath("//*[@id='tags']");
	By CurrencyDropdownfield = By.xpath("//*[@id='currency']");
	By GroupDropdownfield = By.xpath("//*[@id='group']");
	By addcontactpasswordfield = By.xpath("//*[@id='password']");
	By confirmpasswordfield = By.xpath("//input[@id='cpassword']");
	By savefield = By.xpath("//*[@id=\"submit\"]");

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/billing/?ng=login/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void loginTest() throws InterruptedException {

		driver.findElement(userNameField).sendKeys("demo@techfios.com ");
		driver.findElement(passwordFieled).sendKeys("abc123");
		driver.findElement(signinButtonField).click();

		Assert.assertEquals("Dashboard not found!!", "Dashboard",driver.findElement(dashboardHeaderField).getText());
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(customerMenufield));
         driver.findElement(customerMenufield).click();
		 driver.findElement(addCustomerfield).click();
		

		Assert.assertEquals("Add contact not found!!","Add Contact",driver.findElement(Addcontactfield).getText());
		 

		driver.findElement(fullNamefield).sendKeys("selam girm");

		Select sel1 = new Select(driver.findElement(CompanyDropdownfield));
		sel1.selectByVisibleText("Bank Of America");

		driver.findElement(emailfield).sendKeys("gsela@gmail.com");
		driver.findElement(phonenumberfield).sendKeys("8176098414");
		driver.findElement(addressfield).sendKeys("305 york ave");
		driver.findElement(cityfield).sendKeys("houston");
		driver.findElement(stateRegionfield).sendKeys("Texas");
		driver.findElement(postalcodefield).sendKeys("76543");

		Select Sel2 = new Select(driver.findElement(countryDropdownfield));
		Sel2.selectByVisibleText("Eritrea");

		Select sel3 = new Select(driver.findElement(tagfield));
		sel3.selectByValue("Banna");

		Select sel4 = new Select(driver.findElement(CurrencyDropdownfield));
		sel4.selectByValue("1");
		Select sel5 = new Select(driver.findElement(GroupDropdownfield));
		sel5.selectByVisibleText("SQL");
		driver.findElement(passwordFieled).sendKeys("S072280");
		driver.findElement(confirmpasswordfield).sendKeys("S072280");
		driver.findElement(savefield).click();

	}
	

	@After
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	
}

}