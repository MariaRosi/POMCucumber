package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBaseClass;

public class HomePage extends TestBaseClass {
	
	//define the elements
	// Page Factory - OR
	@FindBy(xpath="//td[contains(text(),'User: Maria Rosi')]")
	WebElement ele_LoggedInUser;
	

	// Initialize the page objects / elements in constructor
	public HomePage() {
		System.out.println("Prog : HomePage and contructor : HomePage");
		PageFactory.initElements(driver, this);

	}
	
	
	//define method
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	
	
	public String getLoggedInUserName() {
		System.out.println("Prog : HomePage and Method : getLoggedInUserName");
		return ele_LoggedInUser.getText();
	}
	

}
