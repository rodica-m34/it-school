package com.itschool.session9.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework {
    public static void main(String[] args) {
        List<String> fixedList = Arrays.asList("Apple", "Banana", "Cherry", "Date");

        ArrayList<String> arrayList = new ArrayList<>(fixedList);
        arrayList.remove("Cherry");
        System.out.println(arrayList);

        List <String> list = new ArrayList<>(fixedList);
        list.add("Plums");
        System.out.println(list);

        Integer[] numbers = {1, 2, 3, 4, 5};
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));
        numberList.add(3);
        System.out.println(numberList);

    }
}
