package Util;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SeleniumDriver {

	private static SeleniumDriver seleniumdriver;

	// initliaze driver
	private static WebDriver driver;
	private static WebDriverWait waitDriver;
	private static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIMEOUT = 50;

	private SeleniumDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		

	}

	public static void openPage(String url) {
		driver.get(url);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setUpDriver() {
		if (seleniumdriver == null) {
			seleniumdriver = new SeleniumDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}

	public static void tearDown() {
		if (driver != null) {                       
			driver.close();
			driver.quit();
		}
		seleniumdriver = null;
	}

}
