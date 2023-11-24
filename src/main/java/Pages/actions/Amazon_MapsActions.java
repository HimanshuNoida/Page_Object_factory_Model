package Pages.actions;

import org.openqa.selenium.support.PageFactory;

import Pages.locators.Amazon_Maps_Locators;
import Util.SeleniumDriver;

public class Amazon_MapsActions {

	Amazon_Maps_Locators maps = null;

	public Amazon_MapsActions() {
		this.maps = new Amazon_Maps_Locators();
		PageFactory.initElements(SeleniumDriver.getDriver(), maps);
	}

	public void input_username_and_password(String username, String password) {

		maps.login.click();
		maps.loginusername.sendKeys(username);
		maps.continuee.click();
		maps.loginpassword.sendKeys(password);
		maps.signIn.click();
	}

}
