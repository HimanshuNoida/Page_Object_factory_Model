package Pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonHomePageLocators {
	
	@FindBy(how = How.XPATH, using = "//a[@id='nav-hamburger-menu']")
	public WebElement AllTopNavigatinLink;
	

}
