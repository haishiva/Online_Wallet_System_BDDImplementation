package com.step_definition;

import java.util.concurrent.TimeUnit;

import com.base_class.Library;
import com.pages.OnlineWalletTransferMoneyPage;
import com.pages.OnlineWalletViewBalancePage;
import com.selenium_reusableFunctions.SeleniumUtility;

import io.cucumber.java.en.Then;

public class OnlineWalletTransferMoneySteps extends Library{
	SeleniumUtility seleniumutility;
	OnlineWalletTransferMoneyPage page1;
	
	@Then("To Select The Transfer Money option")
	public void to_Select_The_Transfer_Money_option() {
		page1=new OnlineWalletTransferMoneyPage(driver);
		page1.transferMoney();
	}

	@Then("To Enter The AccountId and Receiver AccountId and Amount")
	public void to_Enter_The_AccountId_and_Receiver_AccountId_and_Amount() {
	    page1.sendDetails("30000", "20000", "100");
	}
	
	@Then("To submit the details")
	public void to_submit_the_details() {
		seleniumutility =new SeleniumUtility(driver);
		seleniumutility.to_take_screenshot("TransferMoneypage");
	    page1.submit();
	}
	
	@Then("To Warn if Transfer fails")
	public void to_Warn_if_Transfer_fails() {
	    logger.info("Transfer Money failed");
	}
	@Then("Take the screenshot")
	public void take_the_screenshot() {
		seleniumutility =new SeleniumUtility(driver);
		seleniumutility.getTitle();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		tearDown();
		logger.info("Closing Browser");
	}
	
	

}
