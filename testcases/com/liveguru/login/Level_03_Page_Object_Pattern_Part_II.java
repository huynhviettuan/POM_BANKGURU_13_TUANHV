package com.liveguru.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.AbstractPage;
import liveguru.pageObjects.LoginPageObject;
import liveguru.pageObjects.MyDashboardPageObject;

public class Level_03_Page_Object_Pattern_Part_II extends AbstractPage {

	WebDriver driver;
	WebDriverWait explicitWait;
	private LoginPageObject loginPage;
	private MyDashboardPageObject mydashboardPage;
	String emailValid = "selenium_11_02@gmail.com";
	String emailInvalid = "123@123.456";
	String passwordValid = "111111";
	String passwordInvalid = "1234523aas";
	String passwordLess = "123";

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		explicitWait = new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://live.demoguru99.com/index.php/customer/account/login/");
	}

	@Test
	public void TC_01_LoginWithEmailEmpty() {
		loginPage = new LoginPageObject(driver);
		loginPage.inputToEmailTextbox("");
		loginPage.inputToPasswordTextbox(passwordValid);
		loginPage.clickToLoginButton();
		Assert.assertEquals(loginPage.getEmptyEmailErrorMessage(), "This is a required field.");
	}

	@Test
	public void TC_02_LoginWithPasswordEmpty() {
		loginPage.inputToEmailTextbox(emailValid);
		loginPage.inputToPasswordTextbox("");
		loginPage.clickToLoginButton();
		Assert.assertEquals(loginPage.getEmptyPasswordErrorMessage(), "This is a required field.");
	}

	@Test
	public void TC_03_LoginWithEmailInvalid() {
		loginPage.inputToEmailTextbox(emailInvalid);
		loginPage.inputToPasswordTextbox(passwordValid);
		loginPage.clickToLoginButton();
		Assert.assertEquals(loginPage.getInvalidEmailErrorMessage(), "Please enter a valid email address. For example johndoe@domain.com.");
	}

	@Test
	public void TC_04_LoginWithPasswordLessThan6Chars() {
		loginPage.inputToEmailTextbox(emailValid);
		loginPage.inputToPasswordTextbox(passwordLess);
		loginPage.clickToLoginButton();
		Assert.assertEquals(loginPage.getPasswordLessThanErrorMessage(), "Please enter 6 or more characters without leading or trailing spaces.");
	}

	@Test
	public void TC_05_LoginWithPasswordIncorrect() {
		loginPage.inputToEmailTextbox(emailValid);
		loginPage.inputToPasswordTextbox(passwordInvalid);
		loginPage.clickToLoginButton();
		Assert.assertEquals(loginPage.getIncorrectEmailOrPasswordMessage(), "Invalid login or password.");
	}

	@Test
	public void TC_06_LoginWithEmailAndPasswordValid() {
		loginPage.inputToEmailTextbox(emailValid);
		loginPage.inputToPasswordTextbox(passwordValid);
		loginPage.clickToLoginButton();
		mydashboardPage = new MyDashboardPageObject(driver);
		Assert.assertTrue(mydashboardPage.isMyDasboardDisplayed());
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
