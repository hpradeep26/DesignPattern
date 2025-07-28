package com.java.design.pattern.structural.adapter;

public class EcommAppMain {

	public static void main(String[] args) {
		// Modern processor
		PaymentProcess paymentProcess = new InHousePaymentProcess();
		CheckoutService checkoutService = new CheckoutService(paymentProcess);
		checkoutService.checkout(100.00, "USD");
		
		 // Legacy gateway through adapter
        System.out.println("\n--- Using Legacy Gateway via Adapter ---");
		LegacyGateway legacyGateway = new LegacyGateway();
		paymentProcess = new LegacyGatewayAdapter(legacyGateway);
		CheckoutService legacyCheckout = new CheckoutService(paymentProcess);
		legacyCheckout.checkout(100.00, "USD");
	}

}
