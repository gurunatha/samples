package com.nt.test;

import com.nt.comps.FlipKart;
import com.nt.factory.FlipKartFactory;

public class ClientApp {

	public static void main(String[] args) {
		FlipKart kart=null,kart1=null;
	// Get FlipKart obj using Factory
		kart=FlipKartFactory.createFlipKartWithCourier("dtdc");
		System.out.println(kart.shopping(new String[]{"shirt","trouser"}));
		System.out.println("...........................................");
		kart1=FlipKartFactory.createFlipKartWithCourier("blueDart");
		System.out.println(kart1.shopping(new String[]{"CRJ","TIJ"}));
		}//main
}//class
