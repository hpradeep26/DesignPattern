package com.java.design.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//Fix: Use readResolve() in Singleton to prevent this.

public class BreakSingletonWithSerialization {

	public static void main(String[] args) {
		 LazySingleton instance1 = LazySingleton.getInstance();
		 
		 try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
			out.writeObject(instance1);
			out.close();
			
			FileInputStream inputStream = new FileInputStream("singleton.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			LazySingleton instance2 = (LazySingleton) objectInputStream.readObject();
			objectInputStream.close();
			
			 System.out.println(instance1.hashCode());
		     System.out.println(instance2.hashCode());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
