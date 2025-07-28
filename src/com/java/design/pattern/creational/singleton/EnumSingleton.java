package com.java.design.pattern.creational.singleton;

public enum EnumSingleton {
	INSTANCE;
	
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
