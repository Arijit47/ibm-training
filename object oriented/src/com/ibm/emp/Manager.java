package com.ibm.emp;

public class Manager extends Employee {
	private double commision;

	public Manager() {
	}

	public Manager(String empName, double salary, double commision) {
		super(empName, salary);
		this.commision = commision;
	}

	@Override
	public void paySlip() {
		super.paySlip();
		System.out.println("Commision: " + commision);
	}

	@Override
	public double getSalary() {
		return super.getSalary() + commision;
	}
}
