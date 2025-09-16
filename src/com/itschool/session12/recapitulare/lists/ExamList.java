package com.itschool.session12.recapitulare.lists;

import java.util.ArrayList;
import java.util.Arrays;

public class ExamList {
    //10. You have a list of 5 exam scores: 90, 85, 78, 88, 92.
    // Create a program that updates the score at index 2 to 95. Print the list before and after making the change.
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(90, 85, 78, 88, 92));
        System.out.println(list);
        list.set(2,95);
        System.out.println(list);
    }

}
