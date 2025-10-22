package com.itschool.session19.homework.ex2;

public class Main {
    public static void main(String[] args) {
        //Creare produse
        Product product1 = new Product("Coat","Winter Coat",600,5);
        product1.addProductToInventory(product1);
        Product product2 = new Product("Jacket", "Puffer Jacket", 500, 7);
        product2.addProductToInventory(product2);
        //verificare produs in stoc
        System.out.println(product2.productIsInStock(product2));
        product1.displayProductInformation();
        product2.displayProductInformation();
        Product product3 = new Product("Jacket", "Spring/Summer", 100, 4);
        product3.addProductToInventory(product3);
        product3.displayProductInformation();
        Product product4 = new Product("Boots", "Leather boots",700,8);
        product4.addProductToInventory(product4);
        product4.displayProductInformation();

        Customer customer1 = new Customer("Alexa Alexandra","alexa.alexa@gmail.com",
                "Buzoiului 81","Buzoiului 81");
        customer1.addProductsToShoppingCart(product1);
        customer1.addProductsToShoppingCart(product2);
        Order placedOrder = customer1.placeOrder();
        customer1.viewOrderStatus();
        customer1.viewOrderHistory();

        System.out.println("===================");
        customer1.addProductsToShoppingCart(product3);
        customer1.placeOrder();
        customer1.viewOrderStatus();
        customer1.viewOrderHistory();

        System.out.println("====================");
        System.out.println("Payment information: ");
        Payment payment1 = new Payment("card", 1100,placedOrder);
        payment1.processPayment();
        payment1.displayPaymentInformation();

        //cantitatile au fost diminuate dupa comanda
        product1.displayProductInformation();
        product2.displayProductInformation();
    }
}
