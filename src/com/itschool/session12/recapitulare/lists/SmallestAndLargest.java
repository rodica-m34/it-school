package com.itschool.session12.recapitulare.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestAndLargest {
    //11. Create a list of 7 random integers. Develop a program that identifies and prints the smallest and the
    //largest numbers from the list.
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            list.add((int)(Math.random() * 200));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Min "+ list.getFirst() + " max "+ list.getLast());
        //sau System.out.println("Min "+list.get(0) + " max "+list.get(list.size()-1));
    }
}
