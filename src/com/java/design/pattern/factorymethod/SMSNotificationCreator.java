package com.java.design.pattern.factorymethod;

public class SMSNotificationCreator extends AbstractNotificationCreator{

	@Override
	public Notification createNotification() {
		return new SMSNotification();
	}

}
