package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Roledetails 
{

	@FindBy(xpath=".//*[@id='Table_01']/tbody/tr/td[1]/a/img")
	WebElement RHome;
	
	@FindBy(xpath=".//*[@id='btnRoles']")
	WebElement Nrole;
	
	public void NR()
	{
		Nrole.click();
	}
	
	
	public void RH()
	{
		RHome.click();
	}
}
