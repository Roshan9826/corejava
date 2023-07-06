package com.rays.oop;

public class EncAccountDetails {
	public static void main(String[] args) {
		EncAccount ad = new EncAccount();
		
		ad.setAccNumber("123456");
		System.out.println(ad.getAccNumber());
		
		ad.setAccType("Saving");
		System.out.println(ad.getAccType());
		
		ad.setAccBalance(1000);
		System.out.println("Total Balance:"+ ad.getAccBalance());
		
		ad.deposit(6000);
		System.out.println("After Diposit:"+ ad.getAccBalance());
		
		ad.withDrawal(500);
		System.out.println("After Withdrawal:"+ad.getAccBalance());
		
		ad.fundTransfer(600);
		System.out.println("After FundTransfer:"+ ad.getAccBalance());
		
		ad.PayBill(600);
		System.out.println("After payBill:"+ ad.getAccBalance());
	}

}
