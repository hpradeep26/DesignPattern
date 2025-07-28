package com.java.design.pattern.structural.adapter;

public interface PaymentProcess {
	
	void paymentProcess(double amount, String currency);
	boolean isPaymentSuccessful();
	String getTransactionId();

}
