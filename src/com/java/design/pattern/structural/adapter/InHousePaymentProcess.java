package com.java.design.pattern.structural.adapter;

public class InHousePaymentProcess implements PaymentProcess{

	private boolean isPaymentSuccessful;
	private String transactionId;

	@Override
	public void paymentProcess(double amount, String currency) {
		System.out.println("InHousePaymentProcessor: Processing payment of " + amount + " " + currency);
		transactionId = "TXN_" + System.currentTimeMillis();
		isPaymentSuccessful = true;
		System.out.println("InHousePaymentProcessor: Payment successful. Txn ID: " + transactionId);
	}

	@Override
	public boolean isPaymentSuccessful() {
		return isPaymentSuccessful;
	}

	@Override
	public String getTransactionId() {
		return transactionId;
	}

}
