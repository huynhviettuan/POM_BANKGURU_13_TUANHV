package liveguru.pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import liveguru.pageUIs.MyDasboardPageUI;

public class MyDashboardPageObject extends AbstractPage {
	WebDriver driver;

	public MyDashboardPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isMyDasboardDisplayed() {
		waitToElementVisible(driver, MyDasboardPageUI.MYDASHBOARD_TXT);
		return isElementDisplayed(driver, MyDasboardPageUI.MYDASHBOARD_TXT);
	}
}
