package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.Library;

public class OnlineWalletTransferMoneyPage extends Library{
	public OnlineWalletTransferMoneyPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/app-root/app-mainpage/div/nav/ul/li[3]/a")
	WebElement transferMoney;
	
	@FindBy(name="accountId")
	WebElement accountIdText;
	
	@FindBy(name="receiveraccountId")
	WebElement receiverIdText;
	
	@FindBy(name="amount")
	WebElement amountText;
	
	@FindBy(xpath="/html/body/app-root/app-transfermoney/div[1]/form/div[4]/input")
	WebElement submit;
	
	public void transferMoney()
	{
		transferMoney.click();
	}
	
	public void sendDetails(String accountId,String receiverId,String amount)
	{
		accountIdText.sendKeys(accountId);
		receiverIdText.sendKeys(receiverId);
		amountText.sendKeys(amount);
	}
	public void submit()
	{
		submit.click();
	}
}
