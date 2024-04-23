package com.chainsys.jfs6;

abstract class Hospital {
	abstract void printinfo();
}

	class Consulting  extends Hospital {
		
		void printinfo() {
			String nameOfPatient="Guru";
			System.out.println("patient name is:"+nameOfPatient);
			int age=25;
			System.out.println("age of :"+age);
			String problem="Fever";
			System.out.println("Problems occured: "+problem);
			

	}

}
	 class Insurance extends Hospital{
		void printinfo() {
			int age=25;
			if (age>20) 
				System.out.println("insurance can be claimed");
			else
				System.out.println("insurance is not Applicable ");
		}

	}
	 
	 class Bill {
		 void show() {
			 System.out.println("total amount to paid is billamount minus insurance claimed ");
		 }
	 }
	 
	

	


