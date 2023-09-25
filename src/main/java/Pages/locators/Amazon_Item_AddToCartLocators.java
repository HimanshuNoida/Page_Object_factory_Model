package Pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Amazon_Item_AddToCartLocators {
	
	
	@FindBy(how=How.XPATH,using="//div[@id='zg_left_colmask']/div/div[1]/div/div[1]/div[1]/div/div/div/div[2]//div[@class='a-carousel-col a-carousel-center']/div/ol/li[1]")
	public  WebElement link;
	
	@FindBy(how=How.XPATH,using="//span[@id='zg_banner_text']")
	WebElement item_link;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='add-to-cart-button']")
	public  WebElement addtocart;
	
}
