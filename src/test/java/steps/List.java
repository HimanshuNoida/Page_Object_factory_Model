package steps;

import org.testng.Assert;

import Pages.actions.ListActions;
import Util.SeleniumDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class List {

	ListActions listAction = new ListActions();
	String Actualtitle;

	@Given("The user is on the Homepage  of  the login page")
	public void the_user_is_on_the_Homepage_of_the_login_page() {
		SeleniumDriver.openPage("https://www.amazon.in");
	}

	@When("user enter the valid username  in the username  field")
	public void user_enter_the_valid_username_in_the_username_field(io.cucumber.datatable.DataTable dataTable) {

		java.util.List<java.util.List<String>> data = dataTable.asLists();
		java.util.List<String> username = data.get(0);
		String userData = username.get(0);
		listAction.loginusername(userData);

	}

	@Then("enter the valid password in the password field")
	public void enter_the_valid_password_in_the_password_field(io.cucumber.datatable.DataTable dataTable) {

		java.util.List<java.util.List<String>> list = dataTable.asLists();
		java.util.List<String> password = list.get(0);
		String pwd = password.get(0);
		listAction.loginPassword(pwd);

	}

	@And("user  gets sucessfully login into the website")
	public void user_gets_sucessfully_login_into_the_website() {
		Actualtitle = SeleniumDriver.getDriver().getTitle();

		if (Actualtitle.contains("amazon")) {
			System.out.println("The title not contains amazon");
		} else {
			System.out.println("The title contains amazon");
		}
	}

	@Then("user able  to see the HomePage of the website")
	public void user_able_to_see_the_HomePage_of_the_website() {

		if (Actualtitle.contains("amazon")) {
			String amazon = "amazon";
			Assert.assertEquals(amazon, Actualtitle, "The user is not able to login ");
		}

	}

}
