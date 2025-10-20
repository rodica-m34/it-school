package com.itschool.session19.homework.ex1;

import java.util.ArrayList;

public class Author {
    private final String name;
    private final String nationality;
    private final String dateOfBirth;
    private ArrayList<Book> books = new ArrayList<>();
    public Author(String name, String nationality, String dateOfBirth) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void displayAuthorInformation(){
        System.out.println("Author name: " + getName());
        System.out.println("Author nationality: " + getNationality());
        System.out.println("Author date of birth: " + getDateOfBirth());
        System.out.print("Books are: ");
        for (Book book : books){
            System.out.print(book.getTitle()+" ");
        }
        System.out.println();
    }

    public void addBook (Book newBook){
        if (books.contains(newBook)){
            System.out.println("Author has already this book");
            return;
        }
        books.add(newBook);
    }

    public void removeBook(Book book){
        books.remove(book);
    }
}
