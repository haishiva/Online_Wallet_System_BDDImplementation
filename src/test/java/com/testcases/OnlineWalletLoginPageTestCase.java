package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base_class.Library;
import com.pages.OnlineWalletLoginPage;
import com.selenium_reusableFunctions.SeleniumUtility;

public class OnlineWalletLoginPageTestCase extends Library {
	OnlineWalletLoginPage page1;
	SeleniumUtility seleniumutility;

	@BeforeTest
	public void launchApp()
	{
		browserSetUp();
		logger.info("Browser Launched");
	}
	@Test
	public void login()
	{
		page1=new OnlineWalletLoginPage(driver);
		page1.loginUser(properties.getProperty("userid"),properties.getProperty("password"));
		page1.submit();
		logger.info("Browser Login successfully");
		
	}
	@AfterTest
	public void close()
	{
		seleniumutility =new SeleniumUtility(driver);
		seleniumutility.getTitle();
		seleniumutility.to_take_screenshot("loginpage");
		//tearDown();
		logger.info("Closing Browser");
		
	}

}
