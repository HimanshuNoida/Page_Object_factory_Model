package Pages.actions;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Pages.locators.HomeLandingLocators;
import Util.SeleniumDriver;

public class HomeLandingActions {

	HomeLandingLocators HLP = null;
	static WebElement item;

	public HomeLandingActions() {

		this.HLP = new HomeLandingLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), this.HLP);
	}

	public void Category_Click_And_Select() {
		HLP.category_search.click();

	}

	public void Listofcategory() throws InterruptedException {
		Thread.sleep(2000);
		int categorysize = HLP.element_name.size();

		System.out.println(categorysize);
//34

		int j=0;
		System.out.println(j);
		while (j <= 2) {
			System.out.println(j);
			try {
		 item=HLP.element_name.get(j);
		item.click();

			}catch (Exception e) {
				 ((JavascriptExecutor)SeleniumDriver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", item);
			}
			
			j++;

			if (j == 4) {
				break;
			}
		}

	}

	public void clickSearched_item() throws InterruptedException {
		Thread.sleep(3000);

		HLP.Item_Select_Click.click();
	}

	public void Productaddtocart() {

		HLP.addtocart.click();
	}

	
	
	public void search_Bar_Item_Click() {
		HLP.searchBar.click();
	}
	
	
	public void scrollpage() {
		
	
	}
}
