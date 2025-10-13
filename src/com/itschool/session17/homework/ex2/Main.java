package com.itschool.session17.homework.ex2;

public class Main {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        DepositMoney money1 = new DepositMoney(bankA);
        money1.depositMoneyInAccount(100);

        Bank bankB = new BankB();
        DepositMoney money2 = new DepositMoney(bankB);
        money2.depositMoneyInAccount(150);

        Bank bankC = new BankC();
        DepositMoney money3 = new DepositMoney(bankC);
        money3.depositMoneyInAccount(200);

    }
}
