package com.step_definition;

import com.base_class.Library;
import com.pages.OnlineWalletLoginPage;
import com.selenium_reusableFunctions.SeleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OnlineWalletLoginSteps extends Library{
	OnlineWalletLoginPage page1;
	SeleniumUtility seleniumutility;

	@Given("To Launch the browser and navigate to url")
	public void to_Launch_the_browser_and_navigate_to_url() {
		browserSetUp();
	     logger.info("browser launched");		
	}

	@When("To Enter username and password")
	public void to_Enter_username_and_password() {
		page1=new OnlineWalletLoginPage(driver);
		page1.loginUser(properties.getProperty("userid"),properties.getProperty("password"));
		
		
	}

	@Then("To Click on submit button")
	public void to_Click_on_submit_button() {
		page1.submit();
		logger.info("Browser Login successfully");
	}

	@Then("To Warn if login fails")
	public void to_Warn_if_login_fails() {
	    logger.info("Error while logging In");
	}

	@Then("To Take the screenshot and get title")
	public void to_Take_the_screenshot_and_get_title() {
		seleniumutility =new SeleniumUtility(driver);
		seleniumutility.getTitle();
		seleniumutility.to_take_screenshot("loginpage");
		tearDown();
		logger.info("Closing Browser");
	}

}
