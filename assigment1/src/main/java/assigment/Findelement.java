package assigment;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement {
	static WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe ");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test
	public void findElement() throws InterruptedException {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//span[text()='bank&cash']")).click();
	}
	//driver.findElement(By.xpath("//input[@id='account']")).click();
			driver.findElement(By.xpath("//input[@id='account']")).sendKeys("saving account");
			driver.findElement(By.xpath("//input[@id='description']")).sendKeys("new account");
			driver.findElement(By.xpath("//input[@id='balance']")).sendKeys("20,000");
			driver.findElement(By.xpath("//input[@id='account_number']")).sendKeys("234678246");
			driver.findElement(By.xpath("//input[@id='contact_person']")).sendKeys("sophia");
			driver.findElement(By.xpath("//input[@id='contact_phone']")).sendKeys("817-527-9885");
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//button[@type='submit']")).click();
	


// @after
public static void teardown() {
		driver.close();
		driver.quit();
	}
}
	
		


