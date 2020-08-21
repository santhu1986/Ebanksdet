package com.ebanking.master;

import java.io.IOException;

public class Exelib {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	    
		//Instance Class
		
		Library LB=new Library();
		
		LB.Openapp("http://183.82.100.55/ranford2");
		LB.Admlgn("Admin","M1ndq");
		LB.Branchcre();
		LB.Role("Mindqsdetjuly","E");
	}

}
