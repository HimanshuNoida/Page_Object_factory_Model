package Pages.actions;

import org.openqa.selenium.support.PageFactory;

import Pages.locators.AmazonHomePageLocators;
import Pages.locators.AmazonLoginPageLocators;
import Util.SeleniumDriver;

public class AmazonLoginPageActions {

	AmazonLoginPageLocators AmazonLoginPageLocators = null;

	public AmazonLoginPageActions() {
		this.AmazonLoginPageLocators = new AmazonLoginPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), AmazonLoginPageLocators);
	}

	public void clickLogin() {

		AmazonLoginPageLocators.loginlink.click();

	}

	public void inputUsername(String username) {

		AmazonLoginPageLocators.loginusername.sendKeys(username);

	}

	public void clickContine() {

		AmazonLoginPageLocators.continuee.click();

	}

	public void inputPassword(String password) {

		AmazonLoginPageLocators.loginpassword.sendKeys(password);

	}
	
	public void signIn() {

		AmazonLoginPageLocators.signIn.click();

	}
}
