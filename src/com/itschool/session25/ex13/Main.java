package com.itschool.session25.ex13;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
        long product = numbers.stream()
                .map(Integer::valueOf)
                .reduce((number1, number2)->number1*number2)
                .orElse(0);
        System.out.println(product);
    }
}
