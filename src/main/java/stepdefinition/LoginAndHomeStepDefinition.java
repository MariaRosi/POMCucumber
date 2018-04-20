package stepdefinition;

import base.TestBaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.HomePage;
import pages.LoginPage;
import utility.TestUtility;

public class LoginAndHomeStepDefinition extends TestBaseClass {

	LoginPage loginPage;
	HomePage homePage;
	TestUtility testUtility;

	// constructor
	public LoginAndHomeStepDefinition() {
		super();
	}

	@Given("^open the browser$")
	public void open_the_browser() throws Throwable {
		initializeBaseClass();

	}

	@When("^validate page title$")
	public void validate_page_title() throws Throwable {
		loginPage = new LoginPage();
		String sTitle = loginPage.getLoginPageTitle();
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", sTitle);

	}

	@Then("^do the login$")
	public void do_the_login() throws Throwable {
		loginPage = new LoginPage();
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable {
		homePage = new HomePage();
		String sTitle = homePage.getHomePageTitle();
		Assert.assertEquals("CRMPRO", sTitle);
	}

	@Then("^validate correct user logged in$")
	public void validate_correct_user_logged_in() throws Throwable {
		testUtility = new TestUtility();
		testUtility.switchToFrame();

		Assert.assertTrue(homePage.getLoggedInUserName().contains("User: Maria Rosi"));

	}

	@Then("^quit the browser$")
	public void quit_the_browser() throws Throwable {
		
		driver.quit();

	}

}
