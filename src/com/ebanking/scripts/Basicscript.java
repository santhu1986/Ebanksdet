package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Basicscript {

	public static void main(String[] args) throws InterruptedException 
	{
		
		String Expval="Ranford Bank";
		
		//Launch Firefox
		
	   WebDriver driver=new FirefoxDriver();
	   
	   //Maximise
	   
	   driver.manage().window().maximize();
	   
	   //URL
	   
	   driver.get("http://183.82.100.55/ranford2");
	   
	   String Actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
	   
	 //Comparision
	   
	   if (Expval.equalsIgnoreCase(Actval)) 
	   {
		System.out.println("Ranford home page is Displayed");
	   }
	   else
	   {
		   System.out.println("Ranford home page is not Displayed");
			     
	   }
	   //Get title
	   
	   System.out.println(driver.getTitle());
	   
	   //Admin Login
	   
	   Expval="Welcome to Admin";
	   
	   driver.findElement(By.id("txtuId")).sendKeys("Admin");
	   driver.findElement(By.id("txtPword")).sendKeys("M1ndq");
	   driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	   
	   Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	   
       //Comparision
	   
	   if (Expval.equalsIgnoreCase(Actval)) 
	   {
		System.out.println("Admin home page is Displayed");
	   }
	   else
	   {
		   System.out.println("Admin home page is not Displayed");
			     
	   }
	   
	   
	   
	   
	   
	   //Branch Creation
	   
	   Expval="Sucessfully";
	   
	   driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
	   driver.findElement(By.xpath("//input[@name='BtnNewBR']")).click();
	   
	   driver.findElement(By.id("txtbName")).sendKeys("Mindqsdetag");
	   driver.findElement(By.id("txtAdd1")).sendKeys("sr nagar");
	   driver.findElement(By.id("txtZip")).sendKeys("12345");
	   
	    //Dropdown
	   
	   Select Ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
	   Ctry.selectByVisibleText("INDIA");
	   
	   Select Sta=new Select(driver.findElement(By.id("lst_stateI")));
	   Sta.selectByVisibleText("GOA");
	   
	   Select Cty=new Select(driver.findElement(By.id("lst_cityI")));
	   Cty.selectByVisibleText("GOA");
	   
	   driver.findElement(By.id("btn_insert")).click();
	   Thread.sleep(4000);
	   //Alert
	   
	   Actval=driver.switchTo().alert().getText();
	   driver.switchTo().alert().accept();
	   
	   if (Actval.contains(Expval))
	   {
		System.out.println("Branch Created");
	   }
	   else
	   {
		   System.out.println("Branch Already exist");
	   }
	   
	  }

}
