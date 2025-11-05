package com.itschool.session25.ex6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(numbers)
                .reduce(0,(num1, num2)->num1+num2);
        System.out.println(sum);
    }
}
