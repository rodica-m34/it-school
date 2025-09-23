package com.itschool.session13.homework.ex3SimpleBankingApplication;

import java.util.ArrayList;

public class Account {
    int initialDeposit;
    int currentBalance;
    String currency;
    ArrayList<Integer> deposits = new ArrayList<>();
    ArrayList<Integer> withdrawals = new ArrayList<>();
    ArrayList<String> transactions = new ArrayList<>();

    public void depositMoney(int amount) {
        if (currentBalance == 0) {
            currentBalance += initialDeposit + amount;
        } else {
            currentBalance += amount;
        }
        transactions.add("deposit of " + amount+ " balance = " + currentBalance);
    }

    public void withdrawMoney(int amount) {
        if (currentBalance - amount < 0) {
            System.out.println("Withdrawal for the amount of " + amount + " is not possible. It exceeds current available amount");
            return;
        }
        currentBalance = currentBalance - amount;
        transactions.add("withdrawal of " + amount + " balance = " + currentBalance);
    }

    @Override
    public String toString() {
        return " initialDeposit=" + initialDeposit +
                ", currency='" + currency + '\'' +
                ", transactions=" + transactions +
                ", currentBalance=" + currentBalance +
                '}';
    }
}
