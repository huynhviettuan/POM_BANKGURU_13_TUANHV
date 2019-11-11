package commons;

import org.openqa.selenium.WebDriver;

import bankguru.pageObjects.DeleteCustomerPageObject;
import bankguru.pageObjects.EditCustomerPageObject;
import bankguru.pageObjects.HomePageObject;
import bankguru.pageObjects.LoginPageObject;
import bankguru.pageObjects.NewCustomerPageObject;
import bankguru.pageObjects.RegisterPageObject;

public class PageGeneratorManager {
	public static LoginPageObject getLoginPage(WebDriver driver) {
		return new LoginPageObject(driver);
	}

	public static HomePageObject getHomePage(WebDriver driver) {
		return new HomePageObject(driver);
	}

	public static RegisterPageObject getRegisterPage(WebDriver driver) {
		return new RegisterPageObject(driver);
	}

	public static NewCustomerPageObject getNewCustomerPage(WebDriver driver) {
		return new NewCustomerPageObject(driver);
	}

	public static EditCustomerPageObject getEditCustomerPage(WebDriver driver) {
		return new EditCustomerPageObject(driver);
	}

	public static DeleteCustomerPageObject getDeleteCustomerPage(WebDriver driver) {
		return new DeleteCustomerPageObject(driver);
	}
}
