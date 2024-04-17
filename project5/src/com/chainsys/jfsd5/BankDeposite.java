package com.chainsys.jfsd5;

public class BankDeposite {

	public void deposite(int amount) {
		int balanceAmount = 10000;
		int totalbalanceAmount = balanceAmount + amount;
		System.out.println("The Current balance amount : " + balanceAmount);
		System.out.println("The amount entered: " + amount);
		System.out.println("The amount entered: " + totalbalanceAmount);

	}

	public void deposite(String name, String ifsc) {
		System.out.println("Account Holder name: " + name + " IFSC number: " + ifsc);

	}

	public void deposite(String name, String phonenumber, String pancard) {
		System.out.println(
				"Account Holder name: " + name + " Phone Number: " + phonenumber + " User Pancard: " + pancard);
	}

	public void deposite(String name, String phonenumber, String pancard, String aadharnum) {
		System.out.println("Account Holder name: " + name + " Phone Number " + phonenumber + " User Pancard: "
				+ pancard + " User Aadhar Number: " + aadharnum);
	}
}
