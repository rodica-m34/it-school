package com.itschool.session22.homework.ex10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        swap(arr1, arr1.get(0), arr1.get(2));
        System.out.println(arr1);

        ArrayList<String> arr2 = new ArrayList<>(List.of("mar","caisa","para","banana","ananas"));
        swap(arr2,"para","ananas");
        System.out.println(arr2);
    }

    public static <T> void swap(ArrayList<T> arrayList, T elem1, T elem2) {
        int poz1 = arrayList.indexOf(elem1);
        int poz2 = arrayList.indexOf(elem2);
        arrayList.set(poz1, elem2);
        arrayList.set(poz2, elem1);
    }
}