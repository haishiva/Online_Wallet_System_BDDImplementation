package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.Library;

public class OnlineWalletViewBalancePage extends Library{
	public OnlineWalletViewBalancePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/app-root/app-mainpage/div/nav/ul/li[2]/a")
	WebElement viewBalanceButton;
	
	@FindBy(name="accountId")
	WebElement accountIdtext;
	
	@FindBy(xpath="/html/body/app-root/app-accountbalance/div[1]/form/div[2]/input")
	WebElement submit;
	
	public void viewBalance()
	{
		viewBalanceButton.click();
	}
	public void sendDetails(String accountId)
	{
		accountIdtext.sendKeys(accountId);
	}
	public void submit()
	{
		submit.click();
	}

}
