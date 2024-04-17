package com.chainsys.jfsd5;

public class Bank {
	String Name;
	long AccNum;
	double Amount;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
		if (name.matches("[a-zA-Z]+")) {
            this.Name = name;
        } else {
            System.out.println("Invalid name. Please enter alphabetic characters only.");
        }
	}
	public long getAccNum() {
		return AccNum;
	}
	public void setAccNum(long accNum) {
		AccNum = accNum;
		 if (accNum > 0) {
	            this.AccNum= accNum;
	        } else {
	            System.out.println("Invalid accNumber. Please enter a value above zero.");
	        }
		}
	
	public double getAmount() {
		return Amount;
	}
	
	public void setAmount(double amount) {
		Amount = amount;
		if (Amount > 0) {
            this.Amount= amount;
        } else {
            System.out.println("Invalid Amount. Please enter a value above zero.");
        }
	}
	@Override
	public String toString() {
		return "Bank [Name=" + Name + ", AccNum=" + AccNum + ", Amount=" + Amount + "]";
	}
	
	
}
