package com.java.design.pattern.abstractfactory;

public class MacOSButton implements Button{

	@Override
	public void paint() {
		System.out.println("Painting a Mac-style Button");
		
	}

	@Override
	public void onClick() {
		System.out.println("Mac Button Selected");
		
	}

}
