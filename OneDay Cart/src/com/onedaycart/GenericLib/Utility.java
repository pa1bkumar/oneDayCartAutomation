package com.onedaycart.GenericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;

/**
	 * This class contains all utility methods or actions performed on web page
	 * @author user
	 *
	 */
public class Utility 
{
    

		static Actions ac;
		static Select sel;
		/**
		 * This method is used to move mouse cursor over webelement in web page
		 * @param driver
		 * @param element
		 */
		public static void moveToElement(WebDriver driver, WebElement element) {
			ac=new Actions(driver);
			ac.moveToElement(element);
		}
		/**
		 * This method used handle dropdown in webpage
		 * @param element
		 * @param value
		 */
		public static void selectByValue(WebElement element, String value) {
			sel=new Select(element);
			sel.selectByValue(value);
		}
		/**
		 * This method is used take screenshot 
		 * @param driver
		 */
		public static void takeScreenshot(WebDriver driver, ITestResult result)
		{
			String methodName = result.getMethod().getMethodName();
			Date d=new Date();
			String[] dAray = d.toString().split(" ");
			String day = dAray[0];
			String month = dAray[1];
			String date = dAray[2];
			String time = dAray[3].replaceAll(":", "_");
			String year = dAray[5];
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./screenshot/"+methodName+"_"+date+"_"+day+"_"+month+"_"+time+"_"+year+".PNG");
			try {
				FileUtils.copyFile(src, dest);
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		/**
		 * This method is used to handle new windows
		 * @param driver
		 * @param nameOrHandle
		 */
		public static void switchToWindow(WebDriver driver, String nameOrHandle) {
			driver.switchTo().window(nameOrHandle);
		}

	}


	
		



