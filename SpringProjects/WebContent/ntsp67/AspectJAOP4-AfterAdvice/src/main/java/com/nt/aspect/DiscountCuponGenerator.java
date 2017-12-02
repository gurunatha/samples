package com.nt.aspect;

import java.io.FileWriter;

import org.aspectj.lang.JoinPoint;

public class DiscountCuponGenerator {
	
/*	public  void generateCupon(JoinPoint jp, float billAmt)throws Throwable{
		String cuponMsg=null;
		FileWriter fw=null;
		
		if(billAmt<=20000)
			cuponMsg="Avail 20% discount on next purchase";
		else if(billAmt<=30000)
			cuponMsg="Avail 30% discount on next purchase";
		else
			cuponMsg="Avail 10% discount on next purchase";
		
		//write cupon Msg to file...
		 fw=new FileWriter("e:\\apps\\cupon.txt");
		 fw.write(cuponMsg);
		 fw.flush();
		 fw.close();
	}//method
*/
	public  void generateCupon( float billAmt)throws Throwable{
		String cuponMsg=null;
		FileWriter fw=null;
		
		if(billAmt<=20000)
			cuponMsg="Avail 20% discount on next purchase";
		else if(billAmt<=30000)
			cuponMsg="Avail 30% discount on next purchase";
		else
			cuponMsg="Avail 10% discount on next purchase";
		
		//write cupon Msg to file...
		 fw=new FileWriter("e:\\apps\\cupon.txt");
		 fw.write(cuponMsg);
		 fw.flush();
		 fw.close();
	}//method
	}//class
