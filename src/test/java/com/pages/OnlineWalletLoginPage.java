package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base_class.Library;

public class OnlineWalletLoginPage extends Library {
	public OnlineWalletLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="userId")
	WebElement userIdInt;
	
	@FindBy(name="password")
	WebElement passwordText;
	
	@FindBy(xpath="/html/body/app-root/app-login/div[1]/form/div[3]/input")
	WebElement loginButton;
	
	public void loginUser(String userId,String password)
	{
		userIdInt.sendKeys(userId);
		passwordText.sendKeys(password);
		
	}
	public void submit()
	{
		loginButton.click();
	}

}
