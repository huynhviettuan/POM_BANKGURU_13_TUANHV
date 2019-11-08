package bankguru.pageObjects;

import org.openqa.selenium.WebDriver;

import bankguru.pageUIs.HomePageUI;
import commons.AbstractPage;
import commons.PageGeneratorManager;

public class HomePageObject extends AbstractPage {
	private WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isWelcomeMessageDisplayed() {
		waitToElementVisible(driver, HomePageUI.WELCOME_MESSAGE_TEXT);
		return isElementDisplayed(driver, HomePageUI.WELCOME_MESSAGE_TEXT);
	}

	public LoginPageObject clickToLogOutLink() {
		waitToElementVisible(driver, HomePageUI.LOG_OUT_LINK);
		clickToElement(driver, HomePageUI.LOG_OUT_LINK);
		waitToAlertPresence(driver);
		acceptAlert(driver);
		return PageGeneratorManager.getLoginPage(driver);
	}
}
