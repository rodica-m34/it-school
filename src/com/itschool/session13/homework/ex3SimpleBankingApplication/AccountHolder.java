package com.itschool.session13.homework.ex3SimpleBankingApplication;

public class AccountHolder {
    String firstName, lastName, CNP;
    Account account = new Account();

    @Override
    public String toString() {
        return "AccountHolder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", CNP='" + CNP + '\'' +
                ", account: " + account +
                '}';
    }
}
