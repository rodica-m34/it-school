package com.itschool.session17.homework.ex2;

public class DepositMoney {
    Bank bank;

    public DepositMoney(Bank bank) {
        this.bank=bank;
    }

    public void depositMoneyInAccount (int deposit){
        bank.depositMoney(deposit);
        bank.getBalance();
    }
}
