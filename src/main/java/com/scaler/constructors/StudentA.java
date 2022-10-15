package com.scaler.constructors;

public class StudentA {
    int id;
    String name = "Alok";
    String gender;
    int age;
    String batch;

    public StudentA() {
        gender = "Male";
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
