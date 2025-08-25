package com.java.design.pattern.behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class ODP_YoutubeChannelSubscription {

	public static void main(String[] args) {
		Channel channel = new Channel("CoderArmy");
		Subscriber subs1 = new Subscriber("Varun", channel);
		Subscriber subs2 = new Subscriber("Tarun", channel);

		channel.subscribe(subs1);
		channel.subscribe(subs2);

		channel.uploadVideo("Observer Pattern Tutorial");

		// Varun unsubscribes; Tarun remains subscribed
		channel.unsubscribe(subs1);

		// Upload another video: only Tarun is notified
		channel.uploadVideo("Decorator Pattern Tutorial");
	}

}


interface ISubscriber{
	void update();
}
interface IChannel{

	void subscribe(ISubscriber subscriber);
	void unsubscribe(ISubscriber subscriber);
	void notifySubscriber();
}

class Channel implements IChannel{

	List<ISubscriber> subscriberList;
	private String name;
	private String latestVideo;



	public Channel(String name) {
		this.name = name;
		this.subscriberList = new ArrayList<>();
	}

	@Override
	public void subscribe(ISubscriber subscriber) {
		subscriberList.add(subscriber);

	}

	@Override
	public void unsubscribe(ISubscriber subscriber) {
		subscriberList.remove(subscriber);

	}

	@Override
	public void notifySubscriber() {
		for (ISubscriber iSubscriber : subscriberList) {
			iSubscriber.update();
		}

	}
	public void uploadVideo(String title) {
		latestVideo = title;
		System.out.println("\n[" + name + " uploaded \"" + title + "\"]");
		notifySubscriber();
	}

	public String getVideoData() {
		return "\nCheckout our new Video : " + latestVideo + "\n";
	}
}

//Concrete Observer: represents a subscriber to the channel
class Subscriber implements ISubscriber {
	private String name;
	private Channel channel;


	public Subscriber(String name, Channel channel) {
		super();
		this.name = name;
		this.channel = channel;
	}


	@Override
	public void update() {
		System.out.println("Hey " + name + "," + channel.getVideoData());

	}

}