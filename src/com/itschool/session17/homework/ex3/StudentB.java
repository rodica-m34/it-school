package com.itschool.session17.homework.ex3;

public class StudentB extends Marks{
    private final int subject1;
    private final int subject2;
    private final int subject3;
    private final int subject4;

    public StudentB(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    protected float getPercentage() {
        return (float)(subject1+subject2+subject3+subject4)/4;
    }
}
