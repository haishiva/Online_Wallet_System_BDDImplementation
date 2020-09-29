package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.Library;

public class OnlineWalletTransactionDetailsPage extends Library{
	public OnlineWalletTransactionDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/app-root/app-mainpage/div/nav/ul/li[4]/a")
	WebElement transactionDetails;
	
	public void submit()
	{
		transactionDetails.click();
	}
}
