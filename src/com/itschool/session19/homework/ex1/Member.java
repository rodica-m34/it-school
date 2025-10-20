package com.itschool.session19.homework.ex1;

import java.util.ArrayList;

public class Member {
    private String name;
    private String address;
    private String contactInformation;
    private int id;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    private ArrayList<Book> overdueBooks = new ArrayList<>();
    //care sunt cu final?
    public Member(String name, String address, String contactInformation, int id) {
        this.name = name;
        this.address = address;
        this.contactInformation = contactInformation;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean hasOverdueBooks(){
        return (!overdueBooks.isEmpty());
    }

    public void borrowBooks (Book book){
        if (hasOverdueBooks()){
            System.out.println("The book cannot be borrowed, there are overdue books");
            return;
        }
        if (!book.isBookAvailable()){
            System.out.println("Book is not available to be borrowed");
            return;
        }
        borrowedBooks.add(book);
        book.removeCopies(1);
    }

    //adaugata de mine
    public void updateOverdueBooks (Book book){
        overdueBooks.add(book);
    }

    public void returnBooks (Book book){
        if (hasOverdueBooks()){
            overdueBooks.remove(book);
        }
        borrowedBooks.remove(book);
        book.addCopies(1);
    }

    public void displayBorrowedBooks(){
        for (Book book : borrowedBooks){
            System.out.println("Borrowed books are: ");
            book.displayBookInformation();
        }
    }
}
