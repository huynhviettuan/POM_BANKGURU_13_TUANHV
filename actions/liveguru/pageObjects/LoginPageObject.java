package liveguru.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import liveguru.pageUIs.LoginPageUI;

public class LoginPageObject extends AbstractPage {
	WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputToEmailTextbox(String email) {
		waitToElementVisible(driver, LoginPageUI.EMAIL_TXT);
		sendkeyToElement(driver, LoginPageUI.EMAIL_TXT, email);
	}

	public void inputToPasswordTextbox(String password) {
		waitToElementVisible(driver, LoginPageUI.PASSWORD_TXT);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TXT, password);
	}

	public void clickToLoginButton() {
		waitToElementVisible(driver, LoginPageUI.LOGIN_BTN);
		clickToElement(driver, LoginPageUI.LOGIN_BTN);
	}

	public String getEmptyEmailErrorMessage() {
		waitToElementVisible(driver, LoginPageUI.EMPTY_EMAIL_ERROR_MSG);
		return getTextElement(driver, LoginPageUI.EMPTY_EMAIL_ERROR_MSG);
	}

	public String getEmptyPasswordErrorMessage() {
		waitToElementVisible(driver, LoginPageUI.EMPTY_PASSWORD_ERROR_MSG);
		return getTextElement(driver, LoginPageUI.EMPTY_PASSWORD_ERROR_MSG);
	}

	public String getInvalidEmailErrorMessage() {
		waitToElementVisible(driver, LoginPageUI.INVALID_EMAIL_ERROR_MSG);
		return getTextElement(driver, LoginPageUI.INVALID_EMAIL_ERROR_MSG);
	}

	public String getPasswordLessThanErrorMessage() {
		waitToElementVisible(driver, LoginPageUI.INVALID_PASSWORD_ERROR_MSG);
		return getTextElement(driver, LoginPageUI.INVALID_PASSWORD_ERROR_MSG);
	}

	public String getIncorrectEmailOrPasswordMessage() {
		waitToElementVisible(driver, LoginPageUI.INCORRECT_EMAIL_OR_PASSWORD_MSG);
		return getTextElement(driver, LoginPageUI.INCORRECT_EMAIL_OR_PASSWORD_MSG);
	}

}
