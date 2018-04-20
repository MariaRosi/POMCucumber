package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBaseClass;

public class LoginPage extends TestBaseClass {

	// Page Factory - OR
	@FindBy(name = "username")
	WebElement ele_Username;

	@FindBy(name = "password")
	WebElement ele_Password;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement ele_Submit_Button;


	// Initialize the page objects / elements in constructor
	public LoginPage() {
		System.out.println("Prog : LoginPage and contructor : LoginPage");
		PageFactory.initElements(driver, this);

	}
	
	
	//Define Methods/Actions
	public String getLoginPageTitle() {
		System.out.println("Prog : LoginPage and Method : getLoginPageTitle");
		return driver.getTitle();
	}
	
	public HomePage doLogin(String sUsername, String sPassword) throws Exception {
		System.out.println("Prog : LoginPage and Method : doLogin");
		ele_Username.sendKeys(sUsername);
		ele_Password.sendKeys(sPassword);
		Thread.sleep(2000);
		ele_Submit_Button.click();

		return new HomePage();
		
	}
	
	

}
