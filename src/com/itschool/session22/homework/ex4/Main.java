package com.itschool.session22.homework.ex4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Song> songSet = new HashSet<>();
        Song song1 = new Song("Queen", "Bohemian Rhapsody", 5.55);
        Song song2 = new Song("Queen", "Bohemian Rhapsody", 6);
        songSet.add(song1);
        songSet.add(song2);
        System.out.println(song1.equals(song2));
        System.out.println(song1.hashCode()==song2.hashCode());
    }
}
