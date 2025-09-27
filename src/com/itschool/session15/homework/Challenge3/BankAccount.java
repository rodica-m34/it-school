package com.itschool.session15.homework.Challenge3;

import java.util.Random;

public class BankAccount {
    private String accountHolderName;
    Random random = new Random();
    //private static final String accountNumber = "ROOFING1453768743";
    private int accountNumber;
    private double balance;
    private static int noOfAccountsOpenedInTheBank=0;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        noOfAccountsOpenedInTheBank++;
        final int accountGenerator = noOfAccountsOpenedInTheBank;
        accountNumber = accountGenerator;
    }

    public void deposit (double amount) {
        if (amount<0) {
            System.out.println("Amount deposited should not be negative");
            return;
        }
        balance += amount;
    }

    public void withdraw (double amount) {
        if (balance - amount < 0) {
            System.out.println("Withdrawal for the amount of " + amount + " is not possible. It exceeds current available amount");
            return;
        }
        balance = balance - amount;
    }

    public double getBalance(){
        return balance;
    }

    public void getAccountDetails(){
        System.out.println("Account no: "+ accountNumber + " holder: "+accountHolderName+ ", has a current balance of : " + getBalance());
    }

    public void transferFunds(BankAccount targetAccount, double amount){
        if (this.balance>=amount){
            targetAccount.balance= targetAccount.balance+amount;
            this.balance=this.balance-amount;
        }
        else {
            System.out.println("The transfer could not be processed");
        }
    }
}
