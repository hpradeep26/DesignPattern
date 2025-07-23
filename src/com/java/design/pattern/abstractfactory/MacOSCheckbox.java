package com.java.design.pattern.abstractfactory;

public class MacOSCheckbox implements Checkbox{

	@Override
	public void paint() {
		System.out.println("Painting a Mac-style checkbox");
		
	}

	@Override
	public void onSelect() {
		System.out.println("Mac checkbox selected.");
		
	}

}
