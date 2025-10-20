package com.itschool.session19.homework.ex2;

import java.util.ArrayList;

public class Product {
    private String name;
    private String description;
    private int price;
    private int quantity;
    private ArrayList<Product> inventory = new ArrayList<>();

    public Product(String name, String description, int price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public  boolean productIsInStock (Product product){
        if (inventory.contains(product) && product.quantity>0){
            return true;
        }
        return false;
    }

    public void addProductToInventory (Product newProduct){
        //verific dc produsul e deja in stoc si ii maresc cant
        //ii verifica toate campurile? sau dupa ce criteriu
        if (productIsInStock(newProduct)){
            int newQuantity = quantity + newProduct.quantity;
            setQuantity(newQuantity);
            return;
        }
        inventory.add(newProduct);
    }

    public void removeProductFromInventory (Product product){
        if (!inventory.contains(product)){
            System.out.println("The product is not in stock");
            return;
        }
        inventory.remove(product);
    }

    public void displayProductInformation (){
            System.out.println("Product name: " + name);
            System.out.println("description: " + description);
            System.out.println("price: " + price);
            System.out.println("quantity: " + quantity);
    }
}
