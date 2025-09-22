package com.itschool.session13.homework.ex3SimpleBankingApplication;

public class Main {
    public static void main(String[] args) {
        AccountHolder holder1 = new AccountHolder();
        holder1.firstName="Virgil";
        holder1.lastName="Ionescu";
        holder1.CNP="1234567892345";
        holder1.account.currency="EUR";
        holder1.account.initialDeposit=100;

        holder1.account.depositMoney(200);
        holder1.account.withdrawMoney(250);
        //holder1.account.withdrawMoney(260);
        holder1.account.withdrawMoney(40);

        System.out.println("Current balance is: " + holder1.account.currentBalance);
        System.out.println("Account details and transactions: ");
        System.out.println(holder1);


    }


}
