package com.itschool.session12.recapitulare.lists;

import java.util.ArrayList;
import java.util.List;

public class MergeLists {
    //8. Write a program that creates two Lists of strings and merges them into a single list. Print out the merged list.
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(List.of("mere","pere","banane","prune"));
        ArrayList<String> list2 = new ArrayList<>(List.of("morcovi","cartofi","patrunjel"));
        /*ArrayList<String> mergedList = list1;
        for (String el : list2) {
            list1.add(el);
        }*/
        ArrayList<String> mergedList = list1;
        mergedList.addAll(list2);
        System.out.println(mergedList);
    }
}
