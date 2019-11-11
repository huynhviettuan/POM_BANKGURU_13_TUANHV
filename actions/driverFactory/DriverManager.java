package driverFactory;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
	WebDriver driver;

	abstract void createDriver();

	public void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	public WebDriver getDriver() {
		if (driver == null) {
			createDriver();
		}
		return driver;
	}
}
