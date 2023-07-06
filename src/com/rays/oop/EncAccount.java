package com.rays.oop;

public class EncAccount {
	
	private String accNumber = " ";
	private String accType = " ";
	private Double accBalance = 0.0;
	
	public void setAccNumber(String s) {
		accNumber = s;
	}
	public String getAccNumber() {
		return accNumber;	
	}
	public void setAccType(String s) {
		accType =s;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccBalance(double d) {
		accBalance = d;
	}
	public Double getAccBalance() {
		return accBalance;
	}
	public void deposit(double d) {
		this.accBalance = accBalance+d;
	}
    public void withDrawal(double d) {
	this.accBalance = accBalance - d;
}
    public void fundTransfer(double d) {
    	this.accBalance = accBalance - d;
    }
    public void PayBill(double d) {
    	this.accBalance = accBalance -d;
    }
}
