package com.itschool.session25.ex3;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(1,100)
                .filter(Main::isNumberPrime)
                .forEach(System.out::println);
    }

    public static boolean isNumberPrime(int number){
        return IntStream.range(2, number).noneMatch(i -> number % i == 0);
    }
}
