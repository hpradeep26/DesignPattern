package com.java.design.pattern.creational.factorymethod;

public class SlackNotification implements Notification{

	@Override
	public void send(String message) {
		System.out.println("Slack  Sending "+message);
		
	}

}
