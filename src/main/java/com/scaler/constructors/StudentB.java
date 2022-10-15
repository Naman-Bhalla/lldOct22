package com.scaler.constructors;

public class StudentB {
    int id;
    String name;
    String gender;
    int age;
    String batch;

    public StudentB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void changeBatch(String newBatch) {
        batch = newBatch;
        System.out.println("Batch changed");
    }

    void pauseCourse(int duration) {
        batch = null;
        System.out.println("Course Paused");
    }
}
