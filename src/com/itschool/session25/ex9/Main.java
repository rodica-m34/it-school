package com.itschool.session25.ex9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.entry;

public class Main {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java","World");
        List<String> getSentence = sentences.stream()
                .flatMap(sentence-> Arrays.stream(sentence.split(" ")))
                .toList();
        Map<String, Long> wordCounts = getSentence.stream()
                .collect(Collectors.groupingBy(word ->word,
                        Collectors.counting()
                        ));
        String mostFrequentWord = wordCounts.entrySet().stream()
                .max( (e1, e2) -> (e1.getValue().compareTo(e2.getValue())))
                .orElse(entry("",1L))
                .getKey();
        System.out.println(mostFrequentWord);
    }
}
