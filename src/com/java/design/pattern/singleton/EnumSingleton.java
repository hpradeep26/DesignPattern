package com.java.design.pattern.singleton;

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
