package com.itschool.session11.homework.ex8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //8. In an array of strings representing movie titles,
        //implement a linear search method to find whether a given movie title exists. If it does, print out its position in the array.
        ArrayList <String> movies = new ArrayList<>(List.of("Seinfeld", "Friends", "Big Bang Theory", "Sheldon", "Modern Family", "Brooklyn 99"));
        String movie = "Friends";
        boolean found = false;
        int poz=0;
        for (int i=0; i<movies.size(); i++)
        {
            if (movies.get(i) .equals(movie))
            {
                found=true;
                poz=i;
            }
        }
        if (!found)
        {
            System.out.println("Movie not found in the list");
        }
        else {
            System.out.println("Movie found in the list on position "+ poz);
        }
    }
}
