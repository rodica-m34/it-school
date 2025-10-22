package com.itschool.session19.homework.ex1;

public class Main {
    public static void main(String[] args) {
        //1. Create author
        Author author1 = new Author("Cartarescu","roman", "06-10-1950");

        //2. Create books with this author
        Book book1 = new Book("Solenoid","Humanitas","RO234I899",3,author1);
        book1.addCopies(4);
        book1.removeCopies(8);
        book1.removeCopies(1);
        book1.displayBookInformation();
        System.out.println("==========================");

        Book book2 = new Book("Theodoros","Humanitas","RO21789765",10, author1);
        book2.addCopies(2);
        book2.removeCopies(5);
        book2.displayBookInformation();
        System.out.println("=======================");

        //3. add books to the author
        author1.addBook(book1);
        author1.addBook(book2);
        author1.displayAuthorInformation();
        System.out.println("================");

        //4. Create the library
        Library library = new Library();
        //add books to library
        library.addBooks(book1);
        library.addBooks(book2);
        System.out.println(library.searchBookByCriteria(Library.TITLE_CRITERIA,"Solenoid"));
        library.removeBooks(book1);
        author1.removeBook(book1);
        library.displayBooks();
        System.out.println("======================");

        //adaugare inapoi book2 in library
        author1.addBook(book1);
        library.addBooks(book1);
        library.displayBooks();
        System.out.println("===================");

        //5. Create members
        Member member1 = new Member("Ninel Dorel", "Garofitei 55", "08734562",345);
        member1.borrowBooks(book1);
        member1.updateOverdueBooks(book1);
        member1.borrowBooks(book2);
        member1.displayBorrowedBooks();
        System.out.println("====================");
        //retur carte
        member1.returnBooks(book1);
        member1.borrowBooks(book2); // s-a facut update la copies
        member1.displayBorrowedBooks();
        System.out.println("============================");

        Member member2 = new Member("Popescu Alex", "Panselutei 22","0986543", 234);
        member2.borrowBooks(book1);
        if (member1.hasOverdueBooks()){
            System.out.println("The member " + member2.getName() + " has overdue books");
        }
        else {
            System.out.println("No overdue books");
        }
        member2.displayBorrowedBooks();
        System.out.println("====================");

       //6. Adaugare membri in library
        library.addMember(member1);
        library.addMember(member2);
        library.displayMembers();
        //search for a member by name
        System.out.println(library.searchMember("name","Popescu Alex"));
        //search for a member by id
        System.out.println(library.searchMember("id","234"));
        // remove members
        //library.removeMembers(member1);
        //library.displayMembers();
    }
}
