package com.itschool.session25.ex5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Alice", "Johnson", 20),
                new Person("Bob", "Smith", 17));
        List<Person> personList = people.stream()
                .filter(person -> person.getAge()>=18)
                .toList();
        System.out.println(personList);
    }
}
