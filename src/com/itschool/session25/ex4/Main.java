package com.itschool.session25.ex4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four");
        String singleString = strings.stream()
                .reduce("",(a, b)->a+b+",");
        System.out.println(singleString);
    }
}
