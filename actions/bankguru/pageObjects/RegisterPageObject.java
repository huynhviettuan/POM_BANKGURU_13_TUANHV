package bankguru.pageObjects;

import org.openqa.selenium.WebDriver;

import bankguru.pageUIs.RegisterPageUI;
import commons.AbstractPage;

public class RegisterPageObject extends AbstractPage {
	private WebDriver driverGlobal;

	public RegisterPageObject(WebDriver driverLocal) {
		driverGlobal = driverLocal;
	}

	public void inputEmailIDTextbox(String emailIDValue) {
		waitToElementVisible(driverGlobal, RegisterPageUI.EMAIL_ID_TEXTBOX);
		sendkeyToElement(driverGlobal, RegisterPageUI.EMAIL_ID_TEXTBOX, emailIDValue);
	}

	public void clickSubmitButton() {
		waitToElementVisible(driverGlobal, RegisterPageUI.SUBMIT_BUTTON);
		clickToElement(driverGlobal, RegisterPageUI.SUBMIT_BUTTON);
	}

	public String getUserIDValue() {
		waitToElementVisible(driverGlobal, RegisterPageUI.USER_ID_TEXT);
		return getTextElement(driverGlobal, RegisterPageUI.USER_ID_TEXT);
	}

	public String getPasswordValue() {
		waitToElementVisible(driverGlobal, RegisterPageUI.PASSWORD_TEXT);
		return getTextElement(driverGlobal, RegisterPageUI.PASSWORD_TEXT);
	}

	public void OpenLoginPage(String loginPageURL) {
		openAnyURL(driverGlobal, loginPageURL);
	}
}
