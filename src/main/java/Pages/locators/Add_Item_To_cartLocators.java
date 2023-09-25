package Pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Add_Item_To_cartLocators {

	@FindBy(how = How.XPATH, using ="//input[@id='twotabsearchtextbox']")
	public WebElement SearchBox;

	@FindBy(how = How.XPATH, using = "//input[@id='nav-search-submit-button']")
	public WebElement searchBar;

	@FindBy(how = How.XPATH,using="//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[3]/div/div")
	public WebElement itemSelect;
	
	@FindBy(how=How.XPATH,using="//span[@class='rush-component s-latency-cf-section']/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[2]/h2/a/span")
	public WebElement selectItemtext;
	
	@FindBy(how=How.XPATH,using="//input[@id='add-to-cart-button']")
	public WebElement Add;
	
	
	@FindBy(how=How.XPATH,using="//span[normalize-space()='Results']")
	public WebElement Item_Get_Text;
	
	@FindBy(how=How.XPATH,using="//input[@name='proceedToRetailCheckout']")
	public WebElement proccedtocart;
	

}
