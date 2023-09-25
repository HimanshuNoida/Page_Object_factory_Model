package Pages.actions;

import org.openqa.selenium.support.PageFactory;

import Pages.locators.Amazon_Item_AddToCartLocators;
import Util.SeleniumDriver;

public class Amazon_Item_AddToCartActions {

	Amazon_Item_AddToCartLocators Amazon_Item_AddToCartLocators = null;
	String link;

	public Amazon_Item_AddToCartActions() {

		this.Amazon_Item_AddToCartLocators = new Amazon_Item_AddToCartLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), Amazon_Item_AddToCartLocators);
	}

	public void itemclick() {
		Amazon_Item_AddToCartLocators.link.click();
	}

	public void AddToCart() {
		Amazon_Item_AddToCartLocators.addtocart.click();
	}
	
	
	
	public String getText() {
	link=Amazon_Item_AddToCartLocators.link.getText();
	return link;
	}

}
