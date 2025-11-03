package com.itschool.session22.homework.ex12;

import java.util.Set;

public enum DayScheduler {
    MONDAY (Set.of("Go to work", "go to the cinema", "cook dinner")),
    TUESDAY (Set.of("Go to work", "buy groceries", "pay bills")),
    WEDNESDAY (Set.of("Go to dentist", "pay bills", "call mom")),
    THURSDAY (Set.of("Go to work", "clean the room")),
    FRIDAY (Set.of("Go to work, buy towels")),
    SATURDAY (Set.of("Stay at home")),
    SUNDAY (Set.of("Walk in the park, meet a friend"));

    private final Set<String> activities;

    DayScheduler( Set<String> activities) {
        this.activities = activities;
    }

    public Set<String> getActivities() {
        return activities;
    }
}
