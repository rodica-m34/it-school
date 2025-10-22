package com.itschool.session19.homework.ex2;

public class Payment {
    private final String paymentMethod;
    private final int paymentAmount;
    private String paymentStatus;
    private final Order order;

    public Payment(String paymentMethod, int paymentAmount, Order order) {
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmount;
        this.paymentStatus="unprocessed";
        this.order = order;
    }

    public void processPayment() {
        if (paymentAmount == order.calculateTotalOrderAmount()) {
            paymentStatus="paid";
            return;
        }
        paymentStatus = "partially paid";
    }

    public void displayPaymentInformation() {
         if (paymentStatus.equals("paid")){
            System.out.println("Order no " + order.getOrderNumber() + " in amount of " + order.calculateTotalOrderAmount()
                    + " was paid by " + paymentMethod);
        }
         else
            if (paymentStatus.equals("partially paid")) {
                System.out.println("Order was partially paid for the amount of " + paymentAmount);
         } else if (paymentStatus.equals("unprocessed")) {
                System.out.println("Order was not paid");
            }
    }
}
