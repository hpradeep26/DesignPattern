package com.java.design.pattern.creational.factorymethod;

public class PushNotificationCreator extends AbstractNotificationCreator{

	@Override
	public Notification createNotification() {
		return new PushNotification();
	}

}
