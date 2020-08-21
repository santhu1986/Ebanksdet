package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exepom
{
	
	
	WebDriver driver;
    @BeforeTest
	public void Login() 
	{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://183.82.100.55/ranford2");
	
	
	RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
	RHP.Login();
	
	}
    @Test()
    public void Rcr() throws InterruptedException, IOException
    {
    	
    	
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

	AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
	AHP.Rol();
	
	Thread.sleep(3000);
	Roledetails RD=PageFactory.initElements(driver,Roledetails.class);
	RD.NR();
	Thread.sleep(3000);
	
	Rcreation RC=PageFactory.initElements(driver,Rcreation.class);
	RC.Rcre(Rname,Rty);
	
	Thread.sleep(3000);
	//Alert
	
	driver.switchTo().alert().accept();
	
	//Home
	
	RD.RH();
	
	}
    }
    
@DataProvider
	
	public Object [][] Rdata()
	{
		
		Object[][] Obj=new Object[3][2];
		
		Obj[0][0]="TellerIciciag";
		Obj[0][1]="E";
		
		Obj[1][0]="Tellercitiag";
		Obj[1][1]="E";
		
		Obj[2][0]="TellerSCag";
		Obj[2][1]="E";
		
		return Obj;
		
	}

    
}
