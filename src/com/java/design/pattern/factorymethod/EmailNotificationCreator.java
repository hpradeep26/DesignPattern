package com.java.design.pattern.factorymethod;

public class EmailNotificationCreator extends AbstractNotificationCreator{

	@Override
	public Notification createNotification() {
		return new EmailNotification();
	}

	

}
