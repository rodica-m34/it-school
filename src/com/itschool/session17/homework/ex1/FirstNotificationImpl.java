package com.itschool.session17.homework.ex1;

public class FirstNotificationImpl implements Notification{
    @Override
    public void sendMessage() {
        System.out.println("Message sent through first device");
    }
}
