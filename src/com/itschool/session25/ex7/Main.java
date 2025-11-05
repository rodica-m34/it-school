package com.itschool.session25.ex7;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");
        List<Integer> lengths = strings.stream()
                .map(String::length)
                .toList();
        System.out.println(lengths);
    }
}
