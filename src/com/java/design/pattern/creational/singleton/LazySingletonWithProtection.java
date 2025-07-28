package com.java.design.pattern.creational.singleton;

import java.io.Serializable;

public class LazySingletonWithProtection implements Serializable,Cloneable{
	
	private static final long serialVersionUID = -7043074748575704725L;
	
	private LazySingletonWithProtection() {
		if(Holder.INSTANCE !=null) {
			throw new RuntimeException("Use getInstance()");
		}
	}
	
	private static class Holder{
		private static final LazySingletonWithProtection INSTANCE = new LazySingletonWithProtection();
	}
	// Prevents breaking via Deserialization
	protected Object readResolve() {
        return getInstance();
    }

	public static LazySingletonWithProtection getInstance() {
		return Holder.INSTANCE;
	}
	// Prevents breaking via clone
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cannot clone singleton");
	}
}
