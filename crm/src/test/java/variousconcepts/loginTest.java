package variousconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import okio.Timeout;

public class loginTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		logintest();
		teardown();
		// set system property
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\gsela\\selenium2023\\crm\\driver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		// chrome object
		 driver = new ChromeDriver();
		// delete cookies
		driver.manage().deleteAllCookies();
		// maximize window
		driver.manage().window().maximize();
		// go to website
		driver.get("https://techfios.com/billing/?ng=login/");
		// insert username
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// insert password
		driver.findElement(By.id("password")).sendKeys("558566");
		// Click sign in button
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		// close browser
		driver.close();
	}

	public static void launchBrowser() {
		// set system property
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\gsela\\selenium2023\\crm\\driver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		// chrome object

		WebDriver driver = new ChromeDriver();
		// delete cookies
		driver.manage().deleteAllCookies();
		// maximize window
		driver.manage().window().maximize();
		// go to website
		driver.get("https://techfios.com/billing/?ng=login/");
		//driver.manage().timeouts().implicitlywait(10,Timeout.seconds);
	}

	public static void logintest() throws InterruptedException {
		// insert username
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// insert password
		driver.findElement(By.id("password")).sendKeys("558566");
		// Click sign in button
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}

	public static void teardown() {
		// close browser
		driver.close();
	}

}

	
