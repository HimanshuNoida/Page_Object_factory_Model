package Pages.actions;

import org.openqa.selenium.support.PageFactory;

import Pages.locators.ListLocators;
import Util.SeleniumDriver;

public class ListActions{
	
	ListLocators list=null;
	
	public ListActions() {
	this.list=new ListLocators();
	PageFactory.initElements(SeleniumDriver.getDriver(),list);

	}
	
		
	public  void loginusername(String username) {
		list.login.click();
		list.webloginusername.sendKeys(username);
		list.continuee.click();
	}
	
	
	public void loginPassword(String password) {
		list.loginpassword.sendKeys(password);
		list.signIn.click();
		
	}
	
	
	

}
