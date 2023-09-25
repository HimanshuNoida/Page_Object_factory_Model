package Pages.actions;

import org.openqa.selenium.support.PageFactory;

import Pages.locators.AmazonHomePageLocators;
import Util.SeleniumDriver;

public class AmazonHomePageActions{

	AmazonHomePageLocators AmazonHomePageLocators = null;

	public AmazonHomePageActions() {
		this.AmazonHomePageLocators = new AmazonHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), AmazonHomePageLocators);
	}

	public void clickMouseTopNavigation() {

		AmazonHomePageLocators.AllTopNavigatinLink.click();

	}

}
