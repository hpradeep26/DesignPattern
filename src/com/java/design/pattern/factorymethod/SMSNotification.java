package com.java.design.pattern.factorymethod;

public class SMSNotification implements Notification{

	@Override
	public void send(String message) {
		System.out.println("Sending SMS Notification" +message);
		
	}

}
