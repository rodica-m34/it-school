package com.itschool.session12.recapitulare.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateNewList {
    //9. You are given a list of city names: "New York", "Los Angeles", "Chicago", "Houston", "Phoenix". Create a program
    //that generates a new list containing only the 2nd to 4th items of this list and prints this new list to the console.
    public static void main(String[] args) {
        ArrayList<String> list1 =new ArrayList<>(Arrays.asList("New York", "Los Angeles", "Chicago", "Houston", "Phoenix"));
        ArrayList<String> list2 = new ArrayList<>();
        list2.add(list1.get(1));
        list2.add(list1.get(3));
        System.out.println(list2);
    }
}
