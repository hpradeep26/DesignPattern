package com.java.design.pattern.structural.adapter;

public class LegacyGatewayAdapter implements PaymentProcess{
	
	 private final LegacyGateway legacyGateway;
	 private long referenceNumber;
	 
	 
	 
	public LegacyGatewayAdapter(LegacyGateway legacyGateway) {
		super();
		this.legacyGateway = legacyGateway;
	}

	@Override
	public void paymentProcess(double amount, String currency) {
		System.out.println("Adapter: Translating processPayment() for " + amount + " " + currency);
		legacyGateway.executeTransaction(amount, currency);
		referenceNumber = legacyGateway.getReferenceNumber();
	}

	@Override
	public boolean isPaymentSuccessful() {
		return legacyGateway.checkStatus(referenceNumber);
	}

	@Override
	public String getTransactionId() {
		return "LEGACY_TXN_"+referenceNumber;
	}

}
