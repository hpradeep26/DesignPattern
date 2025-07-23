package com.java.design.pattern.abstractfactory;

public class WindowsCheckbox implements Checkbox{

	@Override
	public void paint() {
		System.out.println("Windows-style checkbox.");
	}

	@Override
	public void onSelect() {
		System.out.println("Windows checkbox selected.");
		
	}

}
