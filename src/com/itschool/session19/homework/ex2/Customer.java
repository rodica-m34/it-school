package com.itschool.session19.homework.ex2;

import java.util.ArrayList;

public class Customer {
    private final String name;
    private String email;
    private String shippingAddress;
    private String billingAddress;
    private ArrayList<Product> shoppingCart = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private int i=0;

    public Customer(String name, String email, String shippingAddress, String billingAddress) {
        this.name = name;
        this.email = email;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void addProductsToShoppingCart (Product product){

        shoppingCart.add(product);
        int newQuantity = product.getQuantity() - 1;
        product.setQuantity(newQuantity);
    }

    public void removeProductsFromShoppingCart (Product product){
        shoppingCart.remove(product);
    }

    //adaugata de mine
    private String getAnOrderNumber (){
        return "No" + i++;
    }

    //modified
    //am adaugat in constr comenzii product list
    //am scos metodele de add si remove din comanda
    //cum adaug nr comenzii?
    public Order placeOrder (){
        //tb resetat shopping cart pt ca la o noua comanda adauga produse peste ele
        //shoppingCart = new ArrayList<>();
        ArrayList <Product> actualShoppingCart = new ArrayList<>(shoppingCart);
        Order order = new Order(getAnOrderNumber(), "order placed", this, actualShoppingCart);
        orders.add(order);
        shoppingCart.clear();
        return order;
    }

    //display order history
    public void viewOrderHistory (){
        for (Order order : orders){
            order.displayOrderInformation();
        }
    }

    public void viewOrderStatus (){
        System.out.println(orders.getLast().getStatus());
    }
}
