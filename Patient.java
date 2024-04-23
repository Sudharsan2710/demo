package com.chainsys.jfs6;

public class Patient {

	public static void main(String[] args) {
		Hospital h1=new Consulting();
		h1.printinfo();
	
		
		
		Hospital h2 = new Insurance();
		h2.printinfo();
		
		Bill h3 = new Bill();
		h3.show();
		

	}

}
