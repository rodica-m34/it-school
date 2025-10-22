package com.itschool.session19.homework.ex1;

public class Book {
    private final String title;
    private final Author author;
    private final String publisher;
    private final String ISBN;
    private int noOfCopies;

    public Book(String title, String publisher, String ISBN, int noOfCopies, Author author) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.noOfCopies = noOfCopies;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author.getName();
    }

    public String getISBN() {
        return ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public boolean isBookAvailable (){
        return noOfCopies>0;
    }

    public void addCopies (int copies){
        if (copies<=0){
            System.out.println("Number of copies to be added should be greater than 0");
            return;
        }
        int newNoOfCopies = noOfCopies+copies;
        setNoOfCopies(newNoOfCopies);
    }

    public void removeCopies (int copies){
        if (copies<=0){
            System.out.println("Number of copies to be removed should be greater than 0");
            return;
        }
        if (copies> noOfCopies){
            System.out.println("No of " + copies + " copies to be removed is greater than actual no of copies");
            return;
        }
        int newNoOfCopies = noOfCopies-copies;
        setNoOfCopies(newNoOfCopies);
    }


    public void displayBookInformation (){
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("ISBN: " + getISBN());
        System.out.println("No of copies: " + getNoOfCopies());
    }
}
