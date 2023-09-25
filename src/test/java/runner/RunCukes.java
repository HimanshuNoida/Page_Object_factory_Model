package runner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;

	@io.cucumber.testng.CucumberOptions(
		plugin= {"json:target/positive/cucumber.json","pretty",
				"html:target/RunCuke/cucumber.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				features={"src/test/resources/feature/Amazon_Product.feature","src/test/resources/feature/Run_product_into_searchbar.feature"},
				glue="steps"
				
		)
		
	public class RunCukes extends io.cucumber.testng.AbstractTestNGCucumberTests {
		

		}
		

	
