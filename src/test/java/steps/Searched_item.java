package steps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import Pages.actions.HomeLandingActions;
import Util.SeleniumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searched_item {

	HomeLandingActions HLP = new HomeLandingActions();
	WebDriver driver;

	@Given("User is on the home Page of the Amazon website")
	public void user_is_on_the_home_Page_of_the_Amazon_website() {
		driver = SeleniumDriver.getDriver();

		String title = driver.getTitle();
		System.out.println(title);
	}

	@When("user select the category in the category bar")
	public void user_select_the_category_in_the_category_bar() throws InterruptedException {

		HLP.Category_Click_And_Select();
		Thread.sleep(4000);
		HLP.Listofcategory();
		Thread.sleep(4000);
		HLP.search_Bar_Item_Click();
		

	}

	@And("select the searched product based on the selected category")
	public void select_the_searched_product_based_on_the_selected_category() throws InterruptedException {

		
		HLP.clickSearched_item();

	}

	@Then("user select the item")
	public void user_select_the_item() {

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
		}
	}

	@And("click Add to cart")
	public void click_Add_to_cart() {

		HLP.Productaddtocart();
	}

	@And("select the Deleivery Address")
	public void select_the_Deleivery_Address() {
		
		
		

	}

	@And("perform the payment")
	public void perform_the_payment() {

		
	}

	@Then("order should should done sucessfully")
	public void order_should_should_done_sucessfully() {

	}

}
