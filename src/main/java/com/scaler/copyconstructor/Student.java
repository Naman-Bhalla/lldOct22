package com.scaler.copyconstructor;

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

    public Student() {}

    public Student(Student other) {
        this.name = other.name;
        this.gender = other.gender;
        this.age = other.age;
        this.id = other.id;
        this.batch = other.batch;;
    }
}
