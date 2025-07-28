package com.java.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;

public class BreakSingletonUsingReflection {
	
	public static void main(String[] args) throws Exception{
		LazySingleton instance1 = LazySingleton.getInstance();
		Constructor<LazySingleton> constructor = LazySingleton.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		LazySingleton instance2 = constructor.newInstance();
		 System.out.println(instance1.hashCode());
	     System.out.println(instance2.hashCode());
	}

}
