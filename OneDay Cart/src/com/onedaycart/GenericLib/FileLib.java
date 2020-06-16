package com.onedaycart.GenericLib;

import java.io.FileInputStream;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib 
{


	public  String getcommonData(String Key)
		{
			 Properties prop=null;
		  
			try {
				 FileInputStream ip = new FileInputStream("./src\\commonData\\commonData.properties");
				 prop=new Properties();
			     prop.load(ip);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		    
		     return prop.getProperty(Key);
		}
		
		public Object[][] getexcelData(String sheetname)
		{
			Sheet sh=null;
			Object[][] data = null;
			try {
				FileInputStream ip=new FileInputStream("C:\\Users\\User\\git\\oneDayCartAutomation\\OneDay Cart\\src\\commonData\\oneDAY.xlsx");
				Workbook wb= WorkbookFactory.create(ip);
				sh=wb.getSheet(sheetname);
				System.out.println("hre");
				Thread.sleep(3000);
				int rownum=sh.getLastRowNum();
				
				int cellnum=sh.getRow(1).getLastCellNum();
				System.out.println("came1");
				data = new Object[rownum][cellnum];
				System.out.println("came");
				for(int i=0;i<rownum;i++)
				{
					for(int j=0;j<cellnum;j++)
					{
					data[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();	
					}
				}
			    } 
			catch (Exception e) 
			{
						e.printStackTrace();
			}
			return data;
		}

	}
	  


