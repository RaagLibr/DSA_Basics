package com.enfy.inheritance2;

public class Phone extends Product {
	
	// Default constructor
	public Phone() {
		super("Nokia");
		System.out.println("Phone defult cons");
	}
	
	public void ring() {
		
		System.out.println("Ring!");
	}
	
	@Override
	public Product[] listVariants() {
		throw new UnsupportedOperationException();
	}
	
	public int calculateAmountOfVariants() {
		return super.listVariants().length;
	}

}
