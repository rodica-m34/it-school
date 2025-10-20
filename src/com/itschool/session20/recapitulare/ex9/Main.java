package com.itschool.session20.recapitulare.ex9;

public class Main {
    public static void main(String[] args) {
        //Create a class Person with private attributes such as name, age, and address.
        // Implement methods such as getName(), getAge(), and getAddress() that return the values of these attributes.
        // Implement setter methods such as setName(), setAge(), and setAddress() that allow you to modify these
        // attributes safely and securely, while maintaining proper data encapsulation
        Person person1 = new Person("Ionescu Maria", 21, "Garofitei 49");
        person1.setName("Marinel");
        displayData(person1);

        Person person2 = new Person("Zoe Ana", 31, "Panselutei 22");
        person2.setAge(32);
        displayData(person2);
    }

    public static void displayData(Person person){
        System.out.println("Name:" + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
        System.out.println("=================");
    }
}
