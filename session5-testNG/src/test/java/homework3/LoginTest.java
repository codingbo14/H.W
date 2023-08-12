package homework3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.internal.WrapsElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	String browser = "chrome";
	String url;
	String USER_NAME;
	String PASSWORD;

	@BeforeTest

	public void readconfig() {
		
//we can read fill money ways this four class offerd by java we can read a file
		// fileReader // BufferedReader // InputStream //scanner
		try {
			InputStream input = new FileInputStream("src\\main\\java\\config\\config.properties");

			Properties prop = new Properties();
			prop.load(input);
			browser = prop.getProperty("browser");
			System.out.println("browser used:" + browser);
			url = prop.getProperty("url");
			USER_NAME = prop.getProperty("User_Name");
			PASSWORD = prop.getProperty("PASSWORD");

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	//  Element list

	By userNameField = By.xpath("// input[@id='username']");
	By passwordFieled = By.xpath("//input[@id=\"password\"]");
	By signinButtonField = By.xpath("/html/body/div/div/div/form/div[3]/button");
	By DashboardHeaderField = By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2");
	By customerMenufield = By.xpath("//*[@id=\"side-menu\"]/li[3]/a/span[1]");
	By AddCustomerMenufield = By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a");
	By AddCustomerHeaderMenufield = By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5");
	By fullNamefield = By.xpath("//input[@id='account']");
	By CompanyDropdownfield = By.xpath("//*[@id=\"cid\"]");
	By Emailfield = By.xpath("//input[@id='email']");
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

	// logindata

	String User_Name = "demo@techfios.com";
	String Password = "abc123";

	// testdata or mockdata

	String Dashboard_Header_text = "Dashboard";
	String Addcustomer = "Add customer";
	String ADDcontact = "Add contact";
	String FullName = "selam";
	String company = "Apple";
	String Email = "sela1234@gmail.com";
	String phonenumber = "8173469023";
	String address = "2101 vally view";
	String city = "dallas";
	String stateRegion = "Tx";
	String postalcode = "34765";
	String country = "Colombia";
	String Tag = "Enrico";
	String currency = "USD";
	String Group = "SQL";
	String Add_contact_password = "S072280";
	String Add_confirm_password = "S072280";

	String savebuttonfield1 = "save";

	@BeforeMethod
	public void init() {
		if (browser == "chrome") {

			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "drivers\\msedgedriver.exe");
			driver = new EdgeDriver();

		} else {
			System.out.println("select proper browser!");

		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		// driver.get("https://techfios.com/billing/?ng=login/");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	
	public void login() {
		
		driver.findElement(userNameField).sendKeys(User_Name);
		driver.findElement(passwordFieled).sendKeys(Password);
		driver.findElement(signinButtonField).click();
		Assert.assertEquals(driver.findElement(DashboardHeaderField).getText(), Dashboard_Header_text,
				"Dashboard page not found");

	}

	@Test(priority = 2)

	public void addcustmer() throws InterruptedException {

		login();

		Thread.sleep(2000);

		driver.findElement(customerMenufield).click();
		driver.findElement(AddCustomerMenufield).click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(customerMenufield));
		// Assert.assertEquals(driver.findElement(AddCustomerHeaderMenufield).getText(),Addcustomer_Header_Text,"Add
		// custome

		Random rnd = new Random();
		int generatedNum = rnd.nextInt(999);

		driver.findElement(fullNamefield).sendKeys(FullName + randomNumGenerator(999));
		driver.findElement(Emailfield).sendKeys(Email);
		driver.findElement(phonenumberfield).sendKeys(phonenumber + randomNumGenerator(99));
		driver.findElement(addressfield).sendKeys(address);
		driver.findElement(cityfield).sendKeys(city);
		driver.findElement(stateRegionfield).sendKeys(stateRegion);
		driver.findElement(postalcodefield).sendKeys(postalcode);

		
		selectFromDropdown(driver.findElement(CompanyDropdownfield),company);
		selectFromDropdown(driver.findElement(countryDropdownfield), country);
		selectFromDropdown(driver.findElement(tagfield), Tag);
		selectFromDropdown(driver.findElement(CurrencyDropdownfield), currency);
		selectFromDropdown(driver.findElement(GroupDropdownfield), Group);

		driver.findElement(addcontactpasswordfield).sendKeys(Add_contact_password);
		driver.findElement(confirmpasswordfield).sendKeys(Add_confirm_password);
		driver.findElement(savefield).click();
	}
    
     
   private void selectFromDropdown(WebElement element, String visibleText) {
		
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
		
		Select sel2 = new Select(element);
		sel2.selectByVisibleText(visibleText);
		
		Select sel3 = new Select(element);
		sel3.selectByVisibleText(visibleText);
		
		Select sel5 = new Select(element);
		sel5.selectByVisibleText(visibleText);

		
	}

	private void selectFromDropdown1(WebElement element, String value) {

	Select sel4= new Select(element);
		sel4.selectByValue(value);
	}

	private int randomNumGenerator(int bound) {

		Random rnd = new Random();
		int generatedNum = rnd.nextInt(bound);
		return generatedNum;

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
