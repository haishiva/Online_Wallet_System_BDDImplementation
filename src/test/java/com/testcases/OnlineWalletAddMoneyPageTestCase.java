package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base_class.Library;
import com.pages.OnlineWalletAddMoneyPage;
import com.pages.OnlineWalletLoginPage;
import com.selenium_reusableFunctions.SeleniumUtility;

public class OnlineWalletAddMoneyPageTestCase extends Library{
	OnlineWalletAddMoneyPage page2;
	OnlineWalletLoginPage page1;
	SeleniumUtility seleniumutility;
	@BeforeTest
	public void launchApp()
	{
		browserSetUp();
		logger.info("Browser Launched");
		page1=new OnlineWalletLoginPage(driver);
		page1.loginUser(properties.getProperty("userid"),properties.getProperty("password"));
		page1.submit();
		logger.info("Browser Login successfully");
	}
	@Test
	public void addMoney()
	{
		page2=new OnlineWalletAddMoneyPage(driver);
		page2.addMoney();
		page2.enterDetails("30000", "1000");
		page2.submit();
		logger.info("Money added successfully");
	}
	@AfterTest
	public void close()
	{
		seleniumutility =new SeleniumUtility(driver);
		seleniumutility.getTitle();
		seleniumutility.to_take_screenshot("AddMoneypage");
		tearDown();
		logger.info("Closing Browser");
		
	}
	
}
