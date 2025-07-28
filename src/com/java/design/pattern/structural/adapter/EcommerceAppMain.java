package com.java.design.pattern.structural.adapter;

public class EcommerceAppMain {
	
	public static void main(String[] args) {
		PaymentProcess process = new InHousePaymentProcess();
		CheckoutService checkout = new CheckoutService(process);
		checkout.checkout(199.99, "USD");
	}

}
