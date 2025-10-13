package com.itschool.session17.homework.ex2;

public class BankA implements Bank{
    private static int balance;

    @Override
    public void getBalance() {
        System.out.println(balance);
    }

    @Override
    public void depositMoney(int deposit) {
        balance=balance+deposit;
    }


}
