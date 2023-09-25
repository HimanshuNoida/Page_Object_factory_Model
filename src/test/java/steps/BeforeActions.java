package steps;

import Util.SeleniumDriver;
import io.cucumber.java.Before;


public class BeforeActions {

	@Before
	public static void setUP() {

		SeleniumDriver.setUpDriver();
	}

}
