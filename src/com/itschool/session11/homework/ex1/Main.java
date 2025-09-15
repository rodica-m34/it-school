package com.itschool.session11.homework.ex1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1. Create a shopping list with array and print the values
        String [] shoppingList = {"mere", "iaurt", "paine", "apa"};

        for (String product : shoppingList)
            System.out.print(product + " ");
        System.out.println();
        //sau
        System.out.println(Arrays.toString(shoppingList));
    }
}
