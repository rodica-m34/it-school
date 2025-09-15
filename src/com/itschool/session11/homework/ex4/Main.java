package com.itschool.session11.homework.ex4;

public class Main {
    public static void main(String[] args) {
        //4. Given an array of 10 integers, count how many of them are even numbers and how many are odd. Print out both counts.
        int[] numbers = {2, 5, 7, 9, 12, 15, 88, 120, 121, 443};
        int countEvens = 0, countOdds = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                countEvens++;
            }
            else
                countOdds++;
        }
        System.out.println("Number of even numbers is: " + countEvens + " and number of odd numbers is: "+countOdds);
    }
}
