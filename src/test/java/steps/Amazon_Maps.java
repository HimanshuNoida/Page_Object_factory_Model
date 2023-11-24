package steps;

import java.util.List;
import java.util.Map;

import Pages.actions.Amazon_MapsActions;
import io.cucumber.java.en.When;

public class Amazon_Maps {
	
	Amazon_MapsActions maps=new Amazon_MapsActions();

	@When("user enter the valid username and password in the password  field")
	public void user_enter_the_valid_username_and_password_in_the_password_field(
			io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> data = dataTable.asMaps();
		String username = data.get(0).get("username");
		String password = data.get(0).get("password");
		maps.input_username_and_password(username, password);
		
		
		

	}

}
