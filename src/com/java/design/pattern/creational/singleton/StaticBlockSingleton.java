package com.java.design.pattern.creational.singleton;

public class StaticBlockSingleton {
	
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {
		
	}
	
	static {
		try {
			instance = new StaticBlockSingleton();
		}catch(Exception e) {
			throw new RuntimeException("Exception while creating Singleton Object");
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
