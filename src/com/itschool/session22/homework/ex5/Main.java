package com.itschool.session22.homework.ex5;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();
        Product product1 = new Product("dress", 400.50, 2705);
        Product product2 = new Product("dress", 300, 2705);
        products.add(product1);
        products.add(product2);
        System.out.println(product1.hashCode()==product2.hashCode());
        product2.setId(2700);
        System.out.println(product1.hashCode()==product2.hashCode());
    }
}
