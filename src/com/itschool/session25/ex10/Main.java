package com.itschool.session25.ex10;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");
        List<String> joinedStrings = strings.stream()
                .flatMap(sentence-> Arrays.stream(sentence.split(" ")))
                .toList();
        long noOfCharacters = joinedStrings.stream()
                .map(String::length)
                .reduce(0, Integer::sum);
        System.out.println(noOfCharacters);
    }
}
