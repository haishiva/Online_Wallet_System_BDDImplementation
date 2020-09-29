package com.step_definition;

import java.util.concurrent.TimeUnit;

import com.base_class.Library;
import com.pages.OnlineWalletAddMoneyPage;
import com.pages.OnlineWalletLoginPage;
import com.pages.OnlineWalletViewBalancePage;
import com.selenium_reusableFunctions.SeleniumUtility;

import io.cucumber.java.en.Then;

public class OnlineWalletViewBalanceSteps extends Library{
	OnlineWalletLoginPage page1;
	OnlineWalletViewBalancePage page2;
	SeleniumUtility seleniumutility;
	
	@Then("To Select The View Balance option")
	public void to_Select_The_View_Balance_option() {
		page2=new OnlineWalletViewBalancePage(driver);
		page2.viewBalance();
		logger.info("Selected view balance option");
	}

	@Then("To Enter The AccountId")
	public void to_Enter_The_AccountId() {
	   page2.sendDetails("30000");
	   logger.info("AccountId entered");
	}

	@Then("To Click On Submit Button")
	public void to_Click_On_Submit_Button() {
	   page2.submit();
	   logger.info("Submit the details");
	}

	@Then("To Warn if View Balance fails")
	public void to_Warn_if_View_Balance_fails() {
		logger.info("View Balance option is failed");
	}

	@Then("To Take the screenshot and get the title")
	public void to_Take_the_screenshot_and_get_the_title() {
		seleniumutility =new SeleniumUtility(driver);
		seleniumutility.getTitle();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		seleniumutility.to_take_screenshot("ViewBalancepage");
		seleniumutility.quit();
		logger.info("Closing Browser");
	}


}
