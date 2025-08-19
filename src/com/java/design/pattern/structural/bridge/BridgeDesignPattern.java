package com.java.design.pattern.structural.bridge;

public class BridgeDesignPattern {

	public static void main(String[] args) {
		Payment orderPayment = new OrderPayment(new PayPalGateway());
		orderPayment.pay(2000);
		
		Payment subscriptionPayment = new SubscriptionPayment(new RazorpayGateway());
		subscriptionPayment.pay(1500);
		
		Payment orderStipe = new OrderPayment(new StripeGateway());
		orderStipe.pay(2800);

	}

}

// Implementor
interface PaymentGateway{
	void processPayment(double amount);
}

//Concrete Implementors
class PayPalGateway implements PaymentGateway{

	@Override
	public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via PayPal.");
		
	}
	
}

//Concrete Implementors
class StripeGateway implements PaymentGateway{

	@Override
	public void processPayment(double amount) {
      System.out.println("Processing payment of $" + amount + " via Stripe.");
		
	}
	
}

//Concrete Implementors
class RazorpayGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of ₹" + amount + " via Razorpay.");
    }
}


//// Abstraction
abstract class Payment{
	protected PaymentGateway paymentGateway;

	public Payment(PaymentGateway paymentGateway) {
		this.paymentGateway = paymentGateway;
	}
	
    public abstract void pay(double amount);
}

//// Refined Abstractions
class OrderPayment extends Payment{

	public OrderPayment(PaymentGateway paymentGateway) {
		super(paymentGateway);
	}

	@Override
	public void pay(double amount) {
		System.out.println("Order Payment initiated...");
		paymentGateway.processPayment(amount);
	}
	
}
////Refined Abstractions
class SubscriptionPayment extends Payment{

	public SubscriptionPayment(PaymentGateway paymentGateway) {
		super(paymentGateway);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pay(double amount) {
		System.out.println("Order Payment initiated...");
		paymentGateway.processPayment(amount);
	}
	
}
