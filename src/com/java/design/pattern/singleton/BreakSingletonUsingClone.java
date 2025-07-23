package com.java.design.pattern.singleton;

public class BreakSingletonUsingClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		LazySingleton instance1 = LazySingleton.getInstance();
		
		LazySingleton instance2 = (LazySingleton) instance1.clone();
		
		System.out.println(instance1);
		System.out.println(instance2);
	}

}
