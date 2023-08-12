package homework1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	//Scenario: Users will be able to add Account
	//1: Open Browser and go to site http://www.techfios.com/billing/?ng=admin/ 
	//2. Enter username: demo@techfios.com 
	//3. Enter password: abc123
	//4. Click login button
	//5. Click on Bank & Cash button
	//6. Click on New Account button 
	//7. Fill out the Add New Account form
	//8. Click on submit button
	//9. Visually check if the account has been created
	//Visually check to make sure the deposit posted

        
public class NewAccount {
	WebDriver driver;

	@Before //annotation is run only once and specifically before anything else is run in the test class. 
	public void lounchBrowser() {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/billing/?ng=login/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test// annotation is used to identify the actual test case. 
	
	public void findelement() throws InterruptedException {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);

		
		driver.findElement(By.xpath("//span[text()='Bank & Cash']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='New Account']")).click();
		
		driver.findElement(By.xpath("//input[@id='account']")).sendKeys("checking");
		driver.findElement(By.xpath("//input[@id='description']")).sendKeys("New account");
		driver.findElement(By.xpath("//input[@id='balance']")).sendKeys("30,000");
		driver.findElement(By.xpath("//input[@id='account_number']")).sendKeys("012345276");
		driver.findElement(By.xpath("//input[@id ='contact_person']")).sendKeys("Alen lee");
		driver.findElement(By.xpath("//input[@id ='contact_phone']")).sendKeys("9738810036");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
	}

	 @After//will close the browser 
	public void teardown() {
		// close browser
		driver.close();
		driver.quit();

	}
}
