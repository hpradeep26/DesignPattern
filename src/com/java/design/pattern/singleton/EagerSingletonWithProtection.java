package com.java.design.pattern.singleton;

import java.io.Serializable;

public class EagerSingletonWithProtection implements Serializable,Cloneable{
	
	private static final long serialVersionUID = 7267998455420567060L;
	private static final EagerSingletonWithProtection INSTANCE = new EagerSingletonWithProtection();
	
	private EagerSingletonWithProtection() {
		 if (INSTANCE != null) {
	            throw new RuntimeException("Use getInstance()");
	        }
	}
	
	public static EagerSingletonWithProtection getInstance() {
        return INSTANCE;
    }
	
	 // Prevents breaking via Deserialization
	protected Object readResolve() {
        return INSTANCE;
    }
	
	 // Prevents breaking via Cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cannot clone singleton");
	}
	
}
