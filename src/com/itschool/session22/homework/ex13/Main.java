package com.itschool.session22.homework.ex13;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The life impossible", "Matt Haig", "Nemira");
        Book book2 = new Book("The midnight library", "Matt Haig", "Nemira");
        Book book3 = new Book("The midnight library", "Matt Haig", "Nemira");
        StoringObjects<Book> bookStoringObjects = new StoringObjects<>();
        bookStoringObjects.addElements(book1);
        bookStoringObjects.addElements(book2);
        bookStoringObjects.addElements(book1);
        bookStoringObjects.addElements(book3);
        bookStoringObjects.viewStoredObjects();
        System.out.println("============================");
        Car car1 = new Car("Toyota", "green");
        Car car2 = new Car("Tesla", "white");
        Car car3 = new Car("Tesla", "white");
        StoringObjects<Car> carStoringObjects = new StoringObjects<>();
        carStoringObjects.addElements(car1);
        carStoringObjects.addElements(car1);
        carStoringObjects.addElements(car2);
        carStoringObjects.addElements(car3);
        carStoringObjects.viewStoredObjects();


    }

}
