package com.chainsys.jfsd5;
import java.util.Scanner;
public class BankPassbook {

	public static void main(String[] args) {
		ABCBank bank=new ABCBank();
		
		BankDeposite depo=new BankDeposite();
		Scanner sc = new Scanner(System.in);
		
		String name;
		
		 while (true) {
	            System.out.print("Enter the name: ");
	            name = sc.next();
	            if (name.matches("[a-zA-Z]+")) {
	                break;
	            } else {
	                System.out.println("Please enter a valid name with only characters.");
	            }
	        }	
		
		
		
		String ifsc;
		while (true) {
            System.out.print("Enter the  IFSC Number: ");
            ifsc = sc.next();
            if (ifsc.matches("[A-Z0-9]+")) {
                break;
            } else {
                System.out.println("Please enter correct IFSC Number.");
                
            }
        }		
		
		
		
		String pancard;
		
		while (true) {
            System.out.print("Enter the  PAN Number: ");
            pancard = sc.next();
            if (pancard.matches("[A-Z0-9]{10}")) {
                break;
            } else {
                System.out.println("Please enter correct PAN Number in capital letters and exactly 10 characters long.");
                
            }
        }		
		
		
		
		String aadharNum;
		System.out.print("enter the aadhar Number: ");
		
        while (true) {
            aadharNum = sc.next();
            if (aadharNum.matches("[0-9]{12}")) {
                break;
            } else {
                System.out.print("Please enter a valid Aadhar number: ");
            }
        }
		
	
		
		String phoneNumber;
		System.out.print("Enter the PhoneNumber : ");
		 while (true) {
	            phoneNumber = sc.next();
	            if (phoneNumber.matches("[0-9]{10}")) {
	                break;
	            } else {
	                System.out.print("Please enter a valid Phone number: ");
	            }
	        }
	
		
		int amount;
		System.out.print("Enter the Amount: ");
		 while (true) {
	            amount = sc.nextInt();
	            if (amount > 0) {
	                break;
	            } else {
	                System.out.print("Please enter a valid Amount: ");
	            }
	        }
		
		bank.setAadharNum(aadharNum);
		bank.setAmount(amount);
		bank.setIfsc(ifsc);
		bank.setName(name);
		bank.setPancard(pancard);
		bank.setPhoneNumber(phoneNumber);
		depo.deposite(bank.getAmount());
		depo.deposite(bank.getName(),bank.getIfsc());
		depo.deposite(bank.getName(),bank.getPhoneNumber(),bank.getPancard());
		depo.deposite(bank.getName(),bank.getPhoneNumber(),bank.getPancard(),bank.getAadharNum());
		
	}
	
	
		
	}



