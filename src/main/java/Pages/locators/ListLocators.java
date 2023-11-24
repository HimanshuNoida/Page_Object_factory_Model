package Pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListLocators {

	@FindBy(how = How.XPATH, using = "//a[@id='nav-link-accountList']")
	public static WebElement login;

	@FindBy(how = How.XPATH, using = "//input[@id='ap_email']")
	public static WebElement webloginusername;

	@FindBy(how = How.XPATH, using = "//input[@id='ap_password']")
	public WebElement loginpassword;

	@FindBy(how = How.XPATH, using = "//input[@id='continue']")
	public WebElement continuee;

	@FindBy(how = How.XPATH, using = "//input[@id='signInSubmit']")
 	public WebElement signIn;
	
	

}
