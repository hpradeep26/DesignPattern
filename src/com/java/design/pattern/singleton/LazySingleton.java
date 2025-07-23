package com.java.design.pattern.singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable,Cloneable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static LazySingleton instance;
	
	// preventing external objects from creating new instances.
	private LazySingleton() {
		
	}
	
	public static LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton(); 
		}
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
