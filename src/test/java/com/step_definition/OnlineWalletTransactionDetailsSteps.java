package com.step_definition;

import java.util.concurrent.TimeUnit;

import com.base_class.Library;
import com.pages.OnlineWalletTransactionDetailsPage;
import com.selenium_reusableFunctions.SeleniumUtility;

import io.cucumber.java.en.Then;

public class OnlineWalletTransactionDetailsSteps extends Library{
	SeleniumUtility seleniumutility;
	OnlineWalletTransactionDetailsPage page1;
	
	@Then("To Select Transaction Details Option")
	public void to_Select_Transaction_Details_Option() {
	    page1=new OnlineWalletTransactionDetailsPage(driver);
	    page1.submit();
	}

	@Then("Get The screenshot and get title")
	public void get_The_screenshot_and_get_title() {
		seleniumutility =new SeleniumUtility(driver);
		seleniumutility.getTitle();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		seleniumutility.to_take_screenshot("TransferDetailspage");
		seleniumutility.quit();
		logger.info("Closing Browser");
	}




}
