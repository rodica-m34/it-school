package com.itschool.session25.ex1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);
        List<Integer> evenNumbers = numbers.stream()
                .filter(number->number%2==0)
                .toList();
        System.out.println(evenNumbers);
    }
}
