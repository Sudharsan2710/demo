package com.chainsys.jfsd5;

public class ABCBank {
	String name;
	String ifsc;
	String pancard;
	String aadharNum;
	String phoneNumber;
	int amount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public String getAadharNum() {
		return aadharNum;
	}

	public void setAadharNum(String aadharNum) {
		this.aadharNum = aadharNum;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ABCBank [name= " + name + ", ifsc= " + ifsc + ", pancard= " + pancard + ", aadharNum= " + aadharNum
				+ ", phoneNumber= " + phoneNumber + ", amount= " + amount + "]";
	}

}
