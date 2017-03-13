package com.sv.comparable;

public class Account implements Comparable<Account>{
	
	private int accntNo;
	private String firstName;
	private int balance;
	
	
	public Account(int accntNo, String firstName, int balance) {
		super();
		this.accntNo = accntNo;
		this.firstName = firstName;
		this.balance = balance;
	}
	public int getAccntNo() {
		return accntNo;
	}
	public void setAccntNo(int accntNo) {
		this.accntNo = accntNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public int compareTo(Account obj) {
		// TODO Auto-generated method stub
		return this.accntNo-obj.accntNo;
	}
	@Override
	public String toString() {
		return "\nAccount [accntNo=" + accntNo + ", firstName=" + firstName + ", balance=" + balance + "]";
	}
	

}
