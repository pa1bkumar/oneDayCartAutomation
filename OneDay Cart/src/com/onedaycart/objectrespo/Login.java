package com.onedaycart.objectrespo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login 
{
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailTF;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement passwordTF;
	
	@FindBy(xpath="//span[.='Login']")
	private WebElement loginButton;

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	public void login(String email, String password)
	{
		emailTF.sendKeys(email);
		passwordTF.sendKeys(password);
		loginButton.click();
	}

}
