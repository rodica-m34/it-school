package com.itschool.session19.homework.ex2;

import java.util.ArrayList;

public class Order {
    private final String orderNumber;
    private final Customer customerInformation;
    private ArrayList<Product> products = new ArrayList<>();
    private String status;

    public Order(String orderNumber, String status, Customer customerInformation, ArrayList<Product> products) {
        this.orderNumber = orderNumber;
        this.status = status;
        this.customerInformation=customerInformation;
        this.products=products;
        // adaugat acum
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   /* public void addToOrder (Product product){
        products.add(product);
    }
    public void removeFromOrder (Product product){
        if (!products.contains(product)){
            System.out.println("Shopping cart is empty, no products to be removed");
            return;
        }
        products.remove(product);
    }*/

    public int calculateTotalOrderAmount (){
        int sum=0;
        for (Product product : products){
            sum+=product.getPrice();
        }
        return sum;
    }

    //de verificat
    public void displayOrderInformation (){
        System.out.println("Order no " + orderNumber);
        System.out.println("Order amount " + calculateTotalOrderAmount());

    }

    public void updateOrderStatus (String status){
        this.status=status;
    }
}
