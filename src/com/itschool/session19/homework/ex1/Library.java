package com.itschool.session19.homework.ex1;

import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books = new ArrayList<>();
    private final ArrayList<Member> members = new ArrayList<>();
    public static final String TITLE_CRITERIA = "title";
    public static final String AUTHOR_CRITERIA = "author";
    public static final String ISBN_CRITERIA = "ISBN";

    public void addBooks (Book newBook){
        if (checkIfAlreadyAvailable(newBook)){
            newBook.addCopies(newBook.getNoOfCopies());
            return;
        }
        books.add(newBook);
    }

    public void removeBooks (Book newBook){
        if (checkIfAlreadyAvailable(newBook)){
            books.remove(newBook);
        }
        else {
            System.out.println("The book to be removed does not exist in the library");
        }
    }

    public void displayBooks (){
        System.out.println("The library has the following books:");
        for (Book book : books){
            book.displayBookInformation();
            System.out.println();;
        }
    }

    private boolean checkIfAlreadyAvailable(Book bookToSearch){
        for (Book book : books){
            if (book.isBookAvailable() && isSameBook(book, bookToSearch)){
                return true;
            }
        }
        return false;
    }

    private boolean isSameBook(Book libraryBook, Book bookToSearch) {
        return libraryBook.getAuthor().equals(bookToSearch.getAuthor()) &&
                libraryBook.getTitle().equals(bookToSearch.getTitle());
    }

    //search for books by title, author, or ISBN
    //search by criteria type and criteriaName; ex: searchBookByCriteria (title, Solenoid)
    public boolean searchBookByCriteria (String criteria, String criteriaName){
        boolean booksWasFound=false;
        for (Book book : books){
            if (TITLE_CRITERIA.equals(criteria)){
                if (book.getTitle().equals(criteriaName)){
                    booksWasFound=true;
                }
                return booksWasFound;
            }
            if (AUTHOR_CRITERIA.equals(criteria)){
                if (book.getAuthor().equals(criteriaName)){
                    booksWasFound=true;
                }
                return booksWasFound;
            }
            if (ISBN_CRITERIA.equals(criteria)){
                if (book.getISBN().equals(criteriaName)){
                    booksWasFound=true;
                }
                return booksWasFound;
            }
        }
        return false;
    }

    public void addMember (Member member){
        if (members.contains(member)){
            System.out.println("Member already exists");
            return;
        }
        members.add(member);
    }

    public void removeMembers (Member member){
        if (!members.contains(member)){
            System.out.println("Member does not exist in the library database");
            return;
        }
        members.remove(member);
    }

    //search for members by name or ID
    //search by criteria type and criteriaName; ex: searchMember (name, Ionescu Marcel)
    public boolean searchMember (String criteria, String criteriaName) {
        boolean memberWasFound = false;
        for (Member member : members) {
            if (criteria == "name") {
                if (member.getName() == criteriaName) {
                    memberWasFound = true;
                    return memberWasFound;
                }
            }
            if (criteria == "id") {
                if (member.getId() == Integer.parseInt(criteriaName)) {
                    memberWasFound = true;
                    return memberWasFound;
                }
            }
        }
        return false;
    }

    public void displayMembers (){
        System.out.println("Members of the library are: ");
        for (Member member : members){
            System.out.println("Member name: "+ member.getName());
            System.out.println("Member id: " + member.getId());
            System.out.println("Member address is: " + member.getAddress());
            System.out.println("Member contact information: " + member.getContactInformation());
        }
    }
}
