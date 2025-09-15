package com.itschool.session12.recapitulare.javaBasic;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        //3. String to Integer: Write a program that prompts the user to enter a string representing an integer value.
        // Convert the string to an int using the Integer.parseInt() method. What happens if the string cannot be
        // parsed as an integer? How can you handle this scenario?
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        stringToInteger(str);
    }
    public static void stringToInteger(String str) {
        boolean isInteger = true;
        char[] characters = str.toCharArray();
        for (char ch : characters) {
            if (!Character.isDigit(ch)) {
                isInteger = false;
            }
        }
        if (!isInteger) {
            System.out.println("Conversion not possible");
        } else
            System.out.println(Integer.parseInt(str));
    }
}
