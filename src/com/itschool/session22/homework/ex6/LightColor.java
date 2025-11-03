package com.itschool.session22.homework.ex6;

import java.time.Duration;

public enum LightColor {
    RED ("Stop", Duration.ofSeconds(30)),
    YELLOW ("Caution", Duration.ofSeconds(5)),
    GREEN ("Go", Duration.ofSeconds(45));

    private final String message;
    private final Duration duration;

    LightColor(String message, Duration duration) {
        this.message = message;
        this.duration = duration;
    }

    public String getMessage() {
        return message;
    }

    public String getSeconds() {
        return duration.getSeconds()+ " seconds";
    }
}
