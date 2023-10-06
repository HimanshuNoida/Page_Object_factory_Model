package steps;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.actions.Add_Item_To_cartActions;
import Pages.locators.Add_Item_To_cartLocators;
import Util.SeleniumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searched_item_to_cart {

	Add_Item_To_cartActions ADP = new Add_Item_To_cartActions();

	public WebDriver driver;

	@Given("user is on the search bar page")
	public void user_is_on_the_search_bar_page() throws InterruptedException {
		this.driver = SeleniumDriver.getDriver();
		Boolean returnvalue = ADP.isdisp();
		if (returnvalue) {
			System.out.println("The searched bar is displaying");
		} else {
			System.out.println("The serched bar is not displayin");
		}

	}

	@When("user enter the item name {string} in the search bar and click search")
	public void user_enter_the_item_name_in_the_search_bar_and_click_search(String item) {

		ADP.enterItemintoSearchBox(item);
		ADP.ClickSearchbar();
	}

	@Then("item should display and")
	public void item_should_display_and() throws InterruptedException {

	//	WebElement item = ADP.getitemtext();
		
		Thread.sleep(4000);
		
		CommonMethods.scrollDown();
		Thread.sleep(4000);
		ADP.select_item();
	
	//	System.out.println("The name of the item is " + text);

	}

	@And("user should able to add it to cart")
	public void user_should_able_to_add_it_to_cart() throws InterruptedException {
		Thread.sleep(4000);
		String parent_window = driver.getWindowHandle();
		System.out.println(parent_window);

		Set<String> windows = driver.getWindowHandles();
		// loop through the set of window handles and switch to each window

		for (String window : windows) {
			// switch to the current window
			driver.switchTo().window(window);

			// check if the current window is not the parent window
			if (!window.equals(parent_window)) {
				// perform the required operations in the current window

				// Example:print the child window title
				System.out.println("child window title " + driver.getTitle());
			}
			Thread.sleep(3000);
			
		}
		ADP.Addtocart();

	}

	@And("Select the address where user want to deleiver")
	public void select_the_address_where_user_want_to_deleiver() {

		ADP.proceedtocart();
		

	}

	@And("purchase it after payment perform succesfull")
	public void purchase_it_after_payment_perform_succesfull() {

		
		
	}
	
	
	

}
