package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.Library;

public class OnlineWalletAddMoneyPage extends Library{

	public OnlineWalletAddMoneyPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/app-root/app-mainpage/div/nav/ul/li[1]/a")
	WebElement addMoneyButton;
	
	@FindBy(name="accountId")
	WebElement accountIdText;
	
	@FindBy(name="accountBalance")
	WebElement accountBalanceText;
	
	@FindBy(xpath="/html/body/app-root/app-addmoney/div[1]/form/div[3]/input")
	WebElement submitButton;
	public void addMoney()
	{
		addMoneyButton.click();
	}
	public void enterDetails(String accountId,String money)
	{
		accountIdText.sendKeys(accountId);
		accountBalanceText.sendKeys(money);
	}
	public void submit()
	{
		submitButton.click();
	}
}
