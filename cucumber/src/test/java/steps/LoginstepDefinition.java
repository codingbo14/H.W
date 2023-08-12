package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Loginpage;
import pages.TestBase;

public class LoginstepDefinition extends TestBase {
  Loginpage loginpage; 
	/*@Test
	 *  public void loginTest()throws Throwable{
	 * loginpageobj.enterUserName("demo@techfios.com");
	 * loginpageobj.enterPassword("abc123"); loginpageobj.clicksignInButton();
	 * takeScreenshot(driver); }
	 */

@Given("User is on the techfios login page")
public void user_is_on_the_techfios_login_page() {
   initDriver();
    driver.get("https://techfios.com/billing/?ng=admin/");
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
      loginpage = PageFactory.initElements(driver, Loginpage.class);
      loginpage.enterUserName(username);
    
}

	@When("User enters password as {string}")
	public void user_enters_password_as_(String password) {
        loginpage.enterPassword(password);
	}

	@When("User clicks on sign in button")
public void user_clicks_on_sign_in_button() {
      loginpage.clickSignInButton();
      
}

	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
   String expectedTitle ="Dashboard- iBilling";
     String actualTitle = loginpage.getPageTitle();
    Assert.assertEquals(expectedTitle,actualTitle);
	}
	
	public void user_enters_the_in_the_field(String data, String field) {
		if (field.equalsIgnoreCase("username")) {
			Loginpage.enterUserName(data);
			System.out.println("data:" + data);
	} else if (field.equalsIgnoreCase("password")) {
		Loginpage.enterPassword(data);
			System.out.println("data:" + data);
		} else {
			System.out.println("unable to enter data:" + data + "in the field:" + field);

	///*}
		//@When("User enters the {string} in the {string} field")
		//public void user_enters_the_in_the_field(String logindata, String field) {
	       //switch (field.toLowerCase()){
	       //case "Username":
	    	//   break;
		//loginpage.enterUserName(logindata);
	     //  case"Password":
	      // loginpage.enterPassword(logindata);
	      // break;
	       //default:
	    	//   System.out.println("logindata:"+ logindata + "and field:"+ field +"not found!");
	   //    }
	 /  /
	


}
