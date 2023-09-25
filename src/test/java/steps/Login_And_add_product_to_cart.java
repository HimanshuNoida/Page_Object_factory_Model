package steps;

import java.util.List;

import org.testng.annotations.BeforeClass;

import Pages.actions.AllHamburgerMenuActions;
import Pages.actions.AmazonHomePageActions;
import Pages.actions.AmazonLoginPageActions;
import Pages.actions.Amazon_Item_AddToCartActions;
import Util.SeleniumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Login_And_add_product_to_cart {

	AmazonLoginPageActions amazonLoginPageActions = new AmazonLoginPageActions();
	AmazonHomePageActions amazonHomePageActions = new AmazonHomePageActions();
	AllHamburgerMenuActions allHamburgerMenuActions = new AllHamburgerMenuActions();
	Amazon_Item_AddToCartActions Addtocart = new Amazon_Item_AddToCartActions();
	Login_And_add_product_to_cart login;

	@Given("^user is on the Login Page of the Amazon website \"([^\"]*)\"$")
	public void user_is_on_the_Login_Page_of_the_Amazon_website(String websiteURL) throws Throwable {

		System.out.println(websiteURL);
		SeleniumDriver.openPage(websiteURL);

	}

	@And("^user click the login link to enter login and password respectively$")
	public void user_click_the_login_link_to_enter_login_and_password_respectively() throws Throwable {
		// Thread.sleep(3000);
		amazonLoginPageActions.clickLogin();
	}

	@And("^user enter the valid username of the account$")
	public void user_enter_the_valid_username_of_the_account(List<String> list) throws Throwable {

		String username = list.get(0);
		amazonLoginPageActions.inputUsername(username);
		// Thread.sleep(3000);
		amazonLoginPageActions.clickContine();
	}

	@And("^user enter the valid password of the Account$")
	public void user_enter_the_valid_password_of_the_Account(List<String> list) throws Throwable {
		// Thread.sleep(3000);
		String password = list.get(0);
		amazonLoginPageActions.inputPassword(password);
		amazonLoginPageActions.signIn();
	}

	@Then("^user login to login on to the Amazon website$")
	public void user_login_to_login_on_to_the_Amazon_website() throws Throwable {

		System.out.println("The user is successfull on the website");

	}

	@Then("^: he  click over the \"([^\"]*)\" category$")
	public void he_click_over_the_category(String topNavigation) throws Throwable {
		Thread.sleep(3000);
		amazonHomePageActions.clickMouseTopNavigation();

	}

	@Then("^click category$")
	public void click_category(List<String> list) throws Throwable {
		String category = list.get(0);
		allHamburgerMenuActions.clickBestSellers(category);
	}

	

	@Then("^he is able to \"([^\"]*)\" Text on the next page$")
	public void he_is_able_to_Text_on_the_next_page(String ExpectedString) throws Throwable {

	String link=Addtocart.getText();
	link.contains(ExpectedString);
	
	}
	
	@And("^he is able  to Add product on the page$")
	public void he_is_able_to_Add_product_on_the_page() throws Throwable {
		Addtocart.itemclick();
		Addtocart.AddToCart();
		
	}

}