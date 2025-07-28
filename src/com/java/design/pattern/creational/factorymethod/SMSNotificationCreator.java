package com.java.design.pattern.creational.factorymethod;

public class SMSNotificationCreator extends AbstractNotificationCreator{

	@Override
	public Notification createNotification() {
		return new SMSNotification();
	}

}
