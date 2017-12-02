package com.nt.service;

import java.util.Random;

import javax.inject.Named;

@Named("pinGenerator")
public class ATMPinGenerator {
	//target method
	public int generatePin(){
		Random rad=null;
		rad=new Random();
		
		return rad.nextInt(9999);
	}//method
}//class
