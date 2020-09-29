package com.step_definition;

import java.util.concurrent.TimeUnit;

import com.base_class.Library;
import com.pages.OnlineWalletAddMoneyPage;
import com.pages.OnlineWalletLoginPage;
import com.selenium_reusableFunctions.SeleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OnlineWalletAddMoneySteps extends Library{
	OnlineWalletLoginPage page1;
	OnlineWalletAddMoneyPage page2;
	SeleniumUtility seleniumutility;

	@Given("To Launch The browser and navigate the url")
	public void to_Launch_The_browser_and_navigate_the_url() {
		browserSetUp();
	     logger.info("browser launched");	
	}

	@When("To Enter The username  and password")
	public void to_Enter_The_username_and_password() {
		page1=new OnlineWalletLoginPage(driver);
		page1.loginUser(properties.getProperty("userid"),properties.getProperty("password"));
		
	}

	@Then("To Click On submit button")
	public void to_Click_On_submit_button() {
		page1.submit();
		logger.info("Browser Login successfully");
	}

	@Then("To Select The Add Money Option")
	public void to_Select_The_Add_Money_Option() {
		page2=new OnlineWalletAddMoneyPage(driver);
	   page2.addMoney();
	   logger.info("Selected Add Money Option");
	}

	@Then("To Enter The AccountId and Amount")
	public void to_Enter_The_AccountId_and_Amount() {
	   page2.enterDetails("30000", "1000");
	   logger.info("Details entered");
	}

	@Then("To Click on Submit button")
	public void to_Click_on_Submit_button() {
	 seleniumutility =new SeleniumUtility(driver);
	 seleniumutility.to_take_screenshot("AddMoneypage");
	  page2.submit();
	  logger.info("Submited the details");
	}

	@Then("To Warn If Add Money Fails")
	public void to_Warn_If_Add_Money_Fails() {
	   logger.info("Add Money Failed");
	}

	@Then("To Take The screenshot and get title")
	public void to_Take_The_screenshot_and_get_title() {
		seleniumutility =new SeleniumUtility(driver);
		seleniumutility.getTitle();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		tearDown();
		logger.info("Closing Browser");
	}

}
