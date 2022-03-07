package com.ibm.bank;

public class Transaction {
	private String type;
	private double ammount;
	private double balance;

	public Transaction(String type, double ammount, double balance) {
		super();
		this.type = type;
		this.ammount = ammount;
		this.balance = balance;
	}

	public String print() {
		return type + "\t" + ammount + "\t" + balance;
	}
}
