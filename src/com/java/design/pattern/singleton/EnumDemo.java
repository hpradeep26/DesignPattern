package com.java.design.pattern.singleton;

public class EnumDemo {

	public static void main(String[] args) {
		EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
		System.out.println(enumSingleton.getValue());
		enumSingleton.setValue(2);
		System.out.println(enumSingleton.getValue());

	}

}
