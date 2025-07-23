package com.java.design.pattern.factorymethod;

public class FactoryMethodDemo {

	public static void main(String[] args) {
		AbstractNotificationCreator notificationCreator;
		
		notificationCreator = new EmailNotificationCreator();
		notificationCreator.send("Welcome to our platform!");
		
		notificationCreator = new SMSNotificationCreator();
		notificationCreator.send("OTP is 121345");
		
		notificationCreator = new PushNotificationCreator();
		notificationCreator.send("You have a new follower!");
		
		
	}

}
