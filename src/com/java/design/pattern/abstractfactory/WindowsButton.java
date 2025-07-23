package com.java.design.pattern.abstractfactory;

public class WindowsButton implements Button {

	@Override
	public void paint() {
		System.out.println("Window Paint");
		
	}

	@Override
	public void onClick() {
		System.out.println("Window Onclick");
		
	}

}
