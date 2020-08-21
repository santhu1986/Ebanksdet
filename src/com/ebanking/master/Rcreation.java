package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Rcreation 
{

	@FindBy(id="txtRname")
	WebElement Rname;
	
	@FindBy(id="lstRtypeN")
	WebElement Rtype;
	
	@FindBy(xpath=".//*[@id='btninsert']")
	WebElement Rsub;
	
	
	public void Rcre(String Rn,String Rty)
	{
		Rname.sendKeys(Rn);
		Select Rt=new Select(Rtype);
		Rt.selectByVisibleText(Rty);
		Rsub.click();
	}
}
