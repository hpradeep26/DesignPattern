package com.java.design.pattern.creational.builder;

public class HttpRequestApp {

	public static void main(String[] args) {
		HttpRequest httpRequest = new HttpRequest.Builder("https://api.example.com/data").build();
		System.out.println(httpRequest);
		
		HttpRequest httpRequest2 = new HttpRequest.Builder("https://api:post/submit").addMethod("post")
		.addHeader("Bearer", "sadasd")
		.body("sadasdsa")
		.build();
		System.out.println(httpRequest2);
	}

}
