package pages;

import org.junit.runner.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpage {
	WebDriver driver;

	public loginpage(WebDriver driver) {
		this.driver = driver;

	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")

	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignInButton;
	@FindBy(how = How.XPATH, using = "//[@id='page-wrapper']")
	WebElement bank_and_cash;
	@FindBy(how = How.XPATH, using = "//[@id='page-wrapper']/div[3]/div[1]/div/div/div[1]/h5")
	WebElement New_Account_button;
	@FindBy(how = How.XPATH, using = "//[@id='account']")
	WebElement Account_Title_field;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement account_description_field;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement initial_Balance_field;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement account_Number_field;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement contact_person_field;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement phone_Number_field;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement internet_Banking_URL_field;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	WebElement Submit_button;

	// Methods to interact with the elements

	public void enterUserName1(String userName) {
		UserName.sendKeys(userName);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterPassword(String password) {
		Password.sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void clickSignInButton() {
		SignInButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickonbankCash() {
		bank_and_cash.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickonnewAccount() {
		New_Account_button.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enteraccountTitle(String accountTitle) {
		Account_Title_field.sendKeys(accountTitle);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterdescription(String description) {
		account_description_field.sendKeys(description);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void enterinitialBalance(String initialBalance) {
		initial_Balance_field.sendKeys(initialBalance);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enteraccountNumber(String accountNumber) {
		account_Number_field.sendKeys(accountNumber);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void entercontactPerson(String contactPerson) {
		contact_person_field.sendKeys(contactPerson);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void enterPhonenumber(String Phonenumber) {
		phone_Number_field.sendKeys(Phonenumber);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void enterinternetBankingURL(String internetBankingURL) {
		internet_Banking_URL_field.sendKeys(internetBankingURL);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void clickonsubmitbutton() {
		Submit_button.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getTitle() {

		return driver.getTitle();
	}
}
