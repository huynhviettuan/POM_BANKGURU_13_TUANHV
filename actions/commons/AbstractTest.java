package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractTest {
	WebDriver driver;

	public WebDriver openMultiBrowser(String browserName) {
		if (Constants.OS_NAME.contains("win")) {
			System.setProperty("webdriver.chrome.driver", Constants.ROOT_FOLDER + "\\resources\\chromedriver.exe");
		}
		if (Constants.OS_NAME.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", Constants.ROOT_FOLDER + "//resources//mac_chromedriver");
		}
		if (Constants.OS_NAME.contains("linux")) {
			System.setProperty("webdriver.chrome.driver", Constants.ROOT_FOLDER + "//resources//linux_chromedriver.exe");
		}

		if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("headless")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			options.addArguments("windown-size = 1366x768");
			driver = new ChromeDriver(options);
		} else {
			System.out.println("Please choose browser in xml file");
		}
		return driver;

	}

}
