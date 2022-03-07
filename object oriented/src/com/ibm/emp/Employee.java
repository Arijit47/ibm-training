package com.ibm.emp;

public abstract class Employee {
	private int empNo;
	private String empName;
	private double salary;
	
	private static int counter=1001;
	public Employee() {
	}

	public Employee(String empName, double salary) {
		this.empNo = counter++;
		this.empName = empName;
		this.salary = salary;
	}

	public void paySlip() {
		System.out.println("Emp No:" + empNo);
		System.out.println("Emp Name:" + empName);
		System.out.println("Salary:" + salary);
	}

	public double getSalary() {
		return salary;
	}
}
