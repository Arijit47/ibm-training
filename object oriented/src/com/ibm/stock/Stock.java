package com.ibm.stock;

import Sample.override;
/**
 * This is class about stock
 * @author Sayan Sarkar
 * @version 1.0
 */
public class Stock implements Exchange {
	/**
	 * overridden methods
	 */
	@override
	public void viewQuote() {
		System.out.println("View Quote");
	}

	@override
	public void setQuote() {
		System.out.println("Set Quote");
	}

	@override
	public void getQuote() {
		System.out.println("Get Quote");
	}
}

