package com.itschool.session22.homework.ex1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Rectangle> rectangleSet = new HashSet<>();
        Rectangle rectangle1 = new Rectangle(8, 10);
        Rectangle rectangle2 = new Rectangle(8, 10);
        rectangleSet.add(rectangle1);
        rectangleSet.add(rectangle2);
        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(rectangle1.hashCode()==rectangle2.hashCode());
    }
}
