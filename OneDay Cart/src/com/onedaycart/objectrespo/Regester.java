package com.onedaycart.objectrespo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Regester 
{
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement firstnameTF;
	
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement lastnameTF;
	
	@FindBy(xpath="//input[@id='email_address']")
	private WebElement emailTF;
	
	@FindBy(xpath="//input[@id='phonenumber']")
	private WebElement mobilenumberTF;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordTF;
	
	@FindBy(xpath="//input[@id='confirmation']")
	private WebElement conformationTF;
	
	@FindBy(xpath=" //button[@type='submit']")
	private WebElement submitButton;
	
	public WebElement getFirstnameTF() {
		return firstnameTF;
	}

	public WebElement getLastnameTF() {
		return lastnameTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getMobilenumberTF() {
		return mobilenumberTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getConformationTF() {
		return conformationTF;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	
/*	public void regesterAcc()
	{
		firstnameTF.sendKeys(arg0);
		lastnameTF.sendKeys(arg0);
		emailTF.sendKeys(arg0);
		
		driver.findElement(By.xpath("//a[.='Register']")).click();
		int y=driver.findElement(By.xpath("//input[@id='password']")).getLocation().getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+y+");");
		
		mobilenumberTF.sendKeys(arg0);
		passwordTF.sendKeys(arg0);
		conformationTF.sendKeys(arg0);
		submitButton.clear();
	}*/


}
