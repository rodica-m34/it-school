package com.itschool.session25.ex8;

public class Main {
    public static void main(String[] args) {
        String sentence = "Hello World";
        String vowels = "AEIOUaeiou";
        long count = sentence.chars()
                .filter(c -> (vowels.indexOf(c)!=-1))
                .count();
        System.out.println(count);
    }
}
