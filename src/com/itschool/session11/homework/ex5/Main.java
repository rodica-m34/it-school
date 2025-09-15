package com.itschool.session11.homework.ex5;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*5. Create an ArrayList that stores city names. Add at least five city names initially. Then,
        prompt the user to add a city name. If the city name is already in the list, display a message saying
        it's a duplicate; otherwise, add it to  the list.*/
        ArrayList <String> cityNames = new ArrayList<>();

        cityNames.addAll(Arrays.asList("Paris", "Tokyo", "Londra", "Barcelona", "Madrid", "Sydney"));

        Scanner sc = new Scanner(System.in);
        int option=0;

        while (true)
        {
            System.out.println("1. Add city name, 2. Exit");
            System.out.println("Enter your option: ");
            option = sc.nextInt();
            switch (option)
            {
                case 1:
                    System.out.print("Add a city name: ");
                    String cityName = sc.next();
                    if (cityNames.contains(cityName))
                    {
                        System.out.println("It's a duplicate");
                    }
                    else {
                        cityNames.add(cityName);
                    }
                case 2: return;
                default:
                    System.out.println("Invalid Option");
            }
        }

        //System.out.println(cityNames);
    }
}
