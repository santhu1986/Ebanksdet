package com.ebanking.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleNG
{
	
	WebDriver driver;

	@BeforeMethod
	public void xyz() 
	{
     driver=new FirefoxDriver();
     driver.manage().window().maximize();
     
	
	}
	@Test
	public void pqr() throws InterruptedException 
	{
	 driver.get("http://183.82.100.55/ranford2");
	 
	 Thread.sleep(4000);
	}
	@Test
	public void qrp() throws InterruptedException 
	{
	 driver.get("http://www.google.com");
	 Thread.sleep(4000);
	}
	@AfterMethod
	public void abc() 
	{
		 driver.close();
		 }
}
