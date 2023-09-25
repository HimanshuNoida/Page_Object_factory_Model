package Pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Pages.locators.Add_Item_To_cartLocators;
import Util.SeleniumDriver;

public class Add_Item_To_cartActions {

	Add_Item_To_cartLocators ADL=null;
	
	public  Add_Item_To_cartActions() {
		this.ADL=new Add_Item_To_cartLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), ADL);
	}
	
	
	public Boolean isdisp() throws InterruptedException {
		
		Thread.sleep(4000);
		if (ADL.SearchBox.isDisplayed()) {
			return true;
		}
		return false;

	}
	
	
	public void enterItemintoSearchBox(String item) {
		
		ADL.SearchBox.sendKeys(item);
		
	}
	
	public void ClickSearchbar() {
		
		ADL.searchBar.click();
		
	}
	
	public  void select_item() {
		ADL.itemSelect.click();
	}
	
	
	
	
	public WebElement getitemtext() {
	WebElement item=ADL.selectItemtext;
	return item;
	}
	
	
	public void Addtocart() {
		ADL.Add.click();
	}
	
	
	public void proceedtocart() {
		ADL.proccedtocart.click();
	}
	
	
	public String getText() {
		String Item=ADL.Item_Get_Text.getText();
		return Item;
	}
}
