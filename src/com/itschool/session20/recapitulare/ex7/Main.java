package com.itschool.session20.recapitulare.ex7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Create an abstract class Shape with an abstract method area().
        // Create subclasses such as Rectangle, Triangle, and Circle that implement the area() method differently.
        // Create an array of Shape objects, and iterate through the array to calculate and print the area of each shape.
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(5,2);
        Shape shape3 = new Triangle(6,7);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(shape1);
        shapes.add(shape2);
        shapes.add(shape3);
        for (Shape shape : shapes){
            System.out.print(shape.getName()+" ");
            System.out.println(shape.area());
        }
    }
}
