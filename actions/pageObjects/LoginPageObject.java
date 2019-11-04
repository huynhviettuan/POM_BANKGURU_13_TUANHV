package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.LoginPageUI;

public class LoginPageObject extends AbstractPage {
	private WebDriver driverGlobal;

	public LoginPageObject(WebDriver driverLocal) {
		driverGlobal = driverLocal;
	}

	public String getLoginPageURL() {
		return getCurrentPageURL(driverGlobal);
	}

	public void clickToHereLink() {
		waitToElementVisible(driverGlobal, LoginPageUI.HERE_LINK);
		clickToElement(driverGlobal, LoginPageUI.HERE_LINK);
	}

	public void inputToUserIDTextbox(String userIDValue) {
		waitToElementVisible(driverGlobal, LoginPageUI.USERNAME_TEXTBOX);
		sendkeyToElement(driverGlobal, LoginPageUI.USERNAME_TEXTBOX, userIDValue);
	}

	public void inputToPasswrodTextbox(String passwordValue) {
		waitToElementVisible(driverGlobal, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driverGlobal, LoginPageUI.PASSWORD_TEXTBOX, passwordValue);
	}

	public void clickToLoginButton() {
		waitToElementVisible(driverGlobal, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driverGlobal, LoginPageUI.LOGIN_BUTTON);
	}

}
