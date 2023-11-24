package Pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AllHamburgerLocatorMenu {

	@FindBy(how = How.XPATH, using ="//ul[@class='hmenu hmenu-visible']//a[@class='hmenu-item'][normalize-space()='Best Sellers']")
	public WebElement BestSellers;
	
}
