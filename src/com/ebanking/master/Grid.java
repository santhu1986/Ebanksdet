package com.ebanking.master;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Grid 
{

	
	DesiredCapabilities Cap=null;
	@Test
	public void Gd() throws MalformedURLException, InterruptedException
	{
		Cap=new DesiredCapabilities();
		Cap.setBrowserName("chrome");
		Cap.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.106:4444/wd/hub"),Cap);
		
		driver.manage().window().maximize();
		driver.get("http://183.82.100.55/ranford2");
		
		
		RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
		RHP.Login();
		
		AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
		AHP.Rol();
		
		Thread.sleep(3000);
		Roledetails RD=PageFactory.initElements(driver,Roledetails.class);
		RD.NR();
		Thread.sleep(3000);
		
		Rcreation RC=PageFactory.initElements(driver,Rcreation.class);
		RC.Rcre("Tellerabcd","E");
		
		Thread.sleep(3000);
		//Alert
		
		driver.switchTo().alert().accept();
		
		
	}
	
	
}
