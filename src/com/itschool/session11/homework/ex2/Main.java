package com.itschool.session11.homework.ex2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //2. Create a wishlist for christmas with ArrayList and print the values
        ArrayList<String> wishlist = new ArrayList<>();
        wishlist.add("masina");
        wishlist.add("ceas");
        wishlist.add("laptop");
        wishlist.add("carti");
        System.out.println(wishlist);
        //sau
        for (String wish : wishlist) {
            System.out.print(wish+ " ");
        }
    }
}
