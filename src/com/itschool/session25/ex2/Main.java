package com.itschool.session25.ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        String longestString = strings.stream()
                        .max(Comparator.comparing(String::length))
                        .orElse("");
        System.out.println(longestString);
    }
}
