package com.java.design.pattern.singleton;

public class EagerInitilazation {
	
	// The single instance, created immediately
	private static final EagerInitilazation EAGER_INITILAZATION = new EagerInitilazation();
	
	private EagerInitilazation() {
		
	}
	
	public static EagerInitilazation getIntialization() {
		return EAGER_INITILAZATION;
	}
}
