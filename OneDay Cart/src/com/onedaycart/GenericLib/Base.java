package com.onedaycart.GenericLib;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class Base 
 {
	WebDriver driver;
	static WebDriver staticDriver;
	FileLib fi=new FileLib();
	@BeforeClass
	public void configBC() {
		if(fi.getcommonData("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Resources\\chromedriver.exe");
			driver=new ChromeDriver();
			staticDriver=driver;
		}
		else if(fi.getcommonData("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Resources\\geckodriver.exe");
			driver=new FirefoxDriver();
			staticDriver=driver;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(fi.getcommonData("url"));
	}
	@BeforeMethod
	public void configBM() {
		//login 
	}
	@AfterMethod
	public void configAM() {
		//logout
	}
	
	@AfterClass
	public void configAC() {
		driver.close();
	}
}





