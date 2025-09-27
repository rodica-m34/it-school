package com.itschool.session15.homework.Challenge3;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Popescu Marcel", 200);
        account1.getAccountDetails();

        BankAccount account2 = new BankAccount("Popescu Marcel", 300);
        account2.getAccountDetails();

        account1.transferFunds(account2,200);
        account2.getAccountDetails();
        account1.getAccountDetails();
    }
}
