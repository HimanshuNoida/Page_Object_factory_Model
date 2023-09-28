package steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Util.SeleniumDriver;

public class CommonMethods {

	public static void ScrolltoElem(WebElement item) {

		((JavascriptExecutor) SeleniumDriver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", item);
		
	}

	public static void scrollDown() {

		Actions action = new Actions(SeleniumDriver.getDriver());

		
		for(int i=0;i<12;i++){
		action.sendKeys(Keys.DOWN).build().perform();
		}

	}

}
