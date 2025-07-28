package com.java.design.pattern.structural.adapter;

public class CheckoutService {
	
	PaymentProcess paymentProcessor;

	public CheckoutService(PaymentProcess paymentProcess) {
		this.paymentProcessor = paymentProcess;
	}
	
	public void checkout(double amount, String currency) {
		paymentProcessor.paymentProcess(amount, currency);
		if(paymentProcessor.isPaymentSuccessful()) {
			System.out.println("CheckoutService: Order successful! Transaction ID: " 
                    + paymentProcessor.getTransactionId());
		}else {
			 System.out.println("CheckoutService: Order failed. Payment was not successful.");
		}
	}
	
}
