package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {
 @Test
	public void abc() throws IOException, InterruptedException 
	{
		
		//Instance Class
		
		Library LB=new Library();
		
		LB.Openapp("http://183.82.100.55/ranford2");
		LB.Admlgn("Admin","M1ndq");
		
		//To get Test Data File
		
		FileInputStream Fis=new FileInputStream("E:\\Selenium Sdet\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
		
		//WorkBook
		
		XSSFWorkbook WB=new XSSFWorkbook(Fis);
		
		//Sheet
		
		XSSFSheet WS=WB.getSheet("Roledata");
		
		//RowCount
		
		int Rc=WS.getLastRowNum();
		System.out.println(Rc);
		
		//Multiple Iterations-----Loop
		
		for (int i=1; i<=Rc;i++)
		{
			//Row
			
			XSSFRow WR=WS.getRow(i);
			
			//Cell
			
			XSSFCell WC=WR.getCell(0);
			XSSFCell WC1=WR.getCell(1);
			
			XSSFCell WC2=WR.createCell(2);
			
			//Cell Values
			
			String Rname=WC.getStringCellValue();
			String Rty=WC1.getStringCellValue();
			
			String Res=LB.Role(Rname,Rty);
			WC2.setCellValue(Res);
			
		}
		
		//Results Excel File
		
		FileOutputStream FOS=new FileOutputStream("E:\\Selenium Sdet\\Ebanking\\src\\com\\ebanking\\results\\Res_Role.xlsx");
		WB.write(FOS);
		WB.close();		
		
	}

}
