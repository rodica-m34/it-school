package com.itschool.session12.recapitulare.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertList {
    //7. Write a program that creates a List of integers and then converts this list to an array.
    // Print out the array using a loop
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Integer [] intArray = new Integer[list.size()];
        intArray = list.toArray(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
