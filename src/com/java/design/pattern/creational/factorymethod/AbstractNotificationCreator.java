package com.java.design.pattern.creational.factorymethod;

public abstract class AbstractNotificationCreator {
	// Factory Method
	public abstract Notification createNotification();
	
	 // Common logic using the factory method
	public void send(String message) {
		Notification notification = createNotification();
		notification.send(message);
	}

}
