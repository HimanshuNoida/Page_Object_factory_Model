package Pages.actions;

import org.openqa.selenium.support.PageFactory;

import Pages.locators.AllHamburgerLocatorMenu;
import Util.SeleniumDriver;

public class AllHamburgerMenuActions {

	AllHamburgerLocatorMenu AllHamburgerLocatorMenu = null;

	public AllHamburgerMenuActions() {

		this.AllHamburgerLocatorMenu = new AllHamburgerLocatorMenu();
		PageFactory.initElements(SeleniumDriver.getDriver(), AllHamburgerLocatorMenu);

	}

	public void clickBestSellers(String category) {
       
		AllHamburgerLocatorMenu.BestSellers.click();

	}

}
