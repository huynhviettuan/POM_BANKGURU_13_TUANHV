package bankguru.pageObjects;

import org.openqa.selenium.WebDriver;

import bankguru.pageUIs.HomePageUI;
import commons.AbstractPage;

public class HomePageObject extends AbstractPage {
	private WebDriver driverGlobal;

	public HomePageObject(WebDriver driverLocal) {
		driverGlobal = driverLocal;
	}

	public boolean isWelcomeMessageDisplayed() {
		waitToElementVisible(driverGlobal, HomePageUI.WELCOME_MESSAGE_TEXT);
		return isElementDisplayed(driverGlobal, HomePageUI.WELCOME_MESSAGE_TEXT);
	}
}
