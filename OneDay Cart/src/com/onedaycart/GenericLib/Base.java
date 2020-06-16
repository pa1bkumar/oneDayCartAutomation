package com.onedaycart.GenericLib;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.onedaycart.objectrespo.Home;
import com.onedaycart.objectrespo.Login;


public class Base 
 {
	public WebDriver driver;
	static WebDriver staticDriver;
	public FileLib lib=new FileLib();
	
	@BeforeClass
	public void configBC() {
		if(lib.getcommonData("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Resources\\chromedriver.exe");
			driver=new ChromeDriver();
			staticDriver=driver;
		}
		else if(lib.getcommonData("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Resources\\geckodriver.exe");
			driver=new FirefoxDriver();
			staticDriver=driver;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(lib.getcommonData("url"));
	}
	
	
	
	@BeforeMethod
	public void configBM() 
	{
		String email = lib.getcommonData("email");
	    String pass = lib.getcommonData("password");
		Home home = PageFactory.initElements(driver, Home.class);
		home.getLogInlink().click();
		Login login = PageFactory.initElements(driver, Login.class);
		login.login(email, pass);
	}
	@AfterMethod
	public void configAM() 
	{
		System.out.println("hi");
	}
	
	@AfterClass
	public void configAC() {
		driver.close();
	}
}





