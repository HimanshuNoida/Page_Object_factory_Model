package Pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomeLandingLocators {
	
	@FindBy(how=How.XPATH,using="//div[@class='nav-search-scope nav-sprite']")
	public WebElement category_search;
	
	
	@FindBy(how=How.XPATH,using="//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']/option")
	public  List<WebElement> element_name;

	
	@FindBy(how=How.XPATH,using="//form[@id='nav-search-bar-form']/div[2]/div[1]/input")
	public WebElement EnterSearched_item;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='nav-search-submit-button']")
	public WebElement searchBar;
	
	@FindBy(how=How.XPATH,using="//span[@data-component-type='s-search-results']/div[1]/div[2]/div/div")
	public WebElement Item_Select_Click;
	
	@FindBy(how=How.XPATH,using="//input[@id='add-to-cart-button']")
	public  WebElement addtocart;
	
	
	
}
