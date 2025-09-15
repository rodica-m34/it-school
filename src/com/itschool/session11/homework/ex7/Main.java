package com.itschool.session11.homework.ex7;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        //7. Create an ArrayList containing names of fruits. Implement a custom sorting mechanism to arrange
        //them in descending order based on their length. If two fruits have the same length, sort them in alphabetical order.
        ArrayList <String> fruits = new ArrayList<>(List.of("banane", "mere", "pere", "mure", "struguri", "zmeura"));
        Collections.sort(fruits, new SortbyLengthAndAlphabetic());
        System.out.println(fruits);
    }

    static class SortbyLengthAndAlphabetic implements Comparator<String>
    {
        @Override
        public int compare(String s1, String s2) {
            if (s1.length()==s2.length()){
                return s1.compareTo(s2);
            }
            return s2.length()-s1.length();
        }
    }
}
