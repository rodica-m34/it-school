package com.itschool.session19.homework.ex2;

public class Payment {
    private String paymentMethod;
    private int paymentAmount;
    private String paymentStatus;
    private Order order;

    public Payment(String paymentMethod, int paymentAmount, Order order) {
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmount;
        this.paymentStatus="unprocessed";
        this.order = order;
    }

    public boolean processPayment() {
        if (paymentAmount == order.calculateTotalOrderAmount()) {
            paymentStatus="paid";
            return true;
        }
        paymentStatus = "partially paid";
        return false;
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
