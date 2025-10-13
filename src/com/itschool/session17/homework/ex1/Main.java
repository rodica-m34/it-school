package com.itschool.session17.homework.ex1;

public class Main {
    public static void main(String[] args) {
        Notification notification1 = new FirstNotificationImpl();
        notification1.sendMessage();

        Notification notification2 = new SecondNotificationImpl();
        notification2.sendMessage();
    }
}
