package com.itschool.session25.ex14;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.entry;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList (
                new Product("Pepsi","suc",8),
                new Product("Chio","chipsuri",10),
                new Product("Lays","chipsuri",9),
                new Product("Danone","iaurt",3));

        Map<String, Double> map = products.stream()
                .collect(Collectors.groupingBy(product -> product.getCategory(),
               Collectors.averagingDouble(Product::getPrice)
                ));
        String maxPriceCategory = map.entrySet().stream()
                .max( (e1,e2) -> (e1.getValue().compareTo(e2.getValue()) ))
                .orElse(entry("",0.0))
                .getKey();
        System.out.println(maxPriceCategory);

    }
}
