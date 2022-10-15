package com.scaler.introtooop;

public class Student {
    int id;
    String name;
    String gender;
    int age;
    String batch;

    void changeBatch(String newBatch) {
        batch = newBatch;
        System.out.println("Batch changed");
    }

    void pauseCourse(int duration) {
        batch = null;
        System.out.println("Course Paused");
    }
}
